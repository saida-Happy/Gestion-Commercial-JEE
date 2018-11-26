package beans;

import java.io.InputStream;

import service.Commercial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import net.sf.jasperreports.engine.JasperRunManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.ProduitsPrix;

import service.EjbStockServiceRemote;
import service.CommercialWSService;
import service.CommercialWSDelegate;

import bo.CommandeBo;

/**
 * Commandes entity. @author MyEclipse Persistence Tools
 */
public class Commandes extends AbstractCommandes implements
		java.io.Serializable {
	private int qteexiste;
	private CommandeBo commandeBo;
	private List<Commandes> liste;



	public List<Commandes> getListe() {
		return getCommandList();
	}

	public void setListe(List<Commandes> liste) {
		this.liste = liste;
	}

	public int getQteexiste() {
		return qteexiste;
	}

	public CommandeBo getCommandeBo() {
		return commandeBo;
	}

	public void setCommandeBo(CommandeBo commandeBo) {
		this.commandeBo = commandeBo;
	}

	public void setQteexiste(int qteexiste) {
		this.qteexiste = qteexiste;
	}

	/** default constructor */
	public Commandes() {

	}

	/** full constructor */
	public Commandes(Integer codeCmd, String nomClt, Integer codePdt,
			Integer qteCmd, Date dateCmd) {
		super(codeCmd, nomClt, codePdt, qteCmd, dateCmd);
	}

	// ********** Afficher la liste des commandes faites **********
	
	public String affiche() throws ParseException,
			DatatypeConfigurationException {

		ExternalContext exc = FacesContext.getCurrentInstance()
				.getExternalContext();
		Map<String, String> params = exc.getRequestParameterMap();
		int code = Integer.parseInt(params.get("codePdt"));
		int qte = Integer.parseInt(params.get("qtePdt"));
		FacesContext fc = FacesContext.getCurrentInstance();
		FacesMessage fm = new FacesMessage("Verifier vos informations!");
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		String client = session.getAttribute("login").toString();
		Date actuelle = new Date();
		DateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
		String dat = f1.format(actuelle);
		Date date = f1.parse(dat);

		setCodePdt(code);
		setQteexiste(qte);
		setNomClt(client);
		setDateCmd(date);
		setCodeCmd(0);
		setQteCmd(0);

		return "envoie";
	}

	// ********** Methode qui permet d'enregistrer une commande **********

	public String saveCommande() throws DatatypeConfigurationException,
			ParseException {

		InitialContext ct;

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		CommandeBo cmd = (CommandeBo) ctx.getBean("commandeBo");
		FacesContext fc = FacesContext.getCurrentInstance();
		FacesMessage fm = new FacesMessage("Verifier les informations !");

		if (getNomClt() != null && getCodePdt() != 0 && getQteCmd() != 0
				&& getCodeCmd() != 0 && getDateCmd() != null) {
			int n = getQteCmd();
			if (getQteexiste() < n) {

				fc.addMessage("addCmdForm", fm);
				return "saveCmdFulaire";

			} else {

				CommercialWSService client = new CommercialWSService();
				CommercialWSDelegate service = client
						.getCommercialWSPort();;

				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
				String d = sdf.format(date);
				Date dateC = sdf.parse(d);
				GregorianCalendar c = new GregorianCalendar();
				c.setTime(dateC);
				XMLGregorianCalendar date2 = DatatypeFactory.newInstance()
						.newXMLGregorianCalendar(c);

				Commandes commande = new Commandes(getCodeCmd(), getNomClt(),
						getCodePdt(), getQteCmd(), dateC);
				cmd.addCommande(commande);

				int r = service.ajouterCommande(getCodeCmd(),getNomClt(),getCodePdt(), getQteCmd(), date2);

				if (r == 1) {
					try {

						ct = new InitialContext();
						EjbStockServiceRemote bean = (EjbStockServiceRemote) ct
								.lookup("tt/tt");
						bean.udpateStock(getCodePdt(), getQteCmd());

					} catch (NamingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return "saveCmdSuccess";

				} else {
					fc.addMessage("addCmdForm", fm);
					return "saveCmdFulaire";
				}
			}

		} else {
			fc.addMessage("addCmdForm", fm);
			return "saveCmdFulaire";
		}

	}

	public List<beans.Commandes> getCommandList() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		commandeBo = (CommandeBo) ctx.getBean("commandeBo");
		return commandeBo.findAllCommande();
	}

	public String annuler() {
		return "annulerCmd";
	}
	
	// ********** Génerer la facture de la commande en PDF **********

	public void Imprimer() {

		Connection conn = null;
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpServletResponse response = (HttpServletResponse) facesContext
				.getExternalContext().getResponse();

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/g_vente", "root", "");

			InputStream reportStream = facesContext.getExternalContext()
					.getResourceAsStream("//facturation.jasper");
			ExternalContext exc = FacesContext.getCurrentInstance()
					.getExternalContext();
			Map<String, String> params = exc.getRequestParameterMap();
			int code = Integer.parseInt(params.get("codeCmd"));
			int qte = Integer.parseInt(params.get("codePdt"));
			int qtee = Integer.parseInt(params.get("qteCmd"));
			
			List<service.ProduitsPrix> listProduitPrix=null;

			CommercialWSService client = new CommercialWSService();

			CommercialWSDelegate service = client.getCommercialWSPort();
			listProduitPrix=service.listProduit();
			
			
			
			
		String bbb = "";
			int aaa = 0;
			for (int i = 0; i < listProduitPrix.size(); i++) {

				if (listProduitPrix.get(i).getCodePdt() == qte) {
					bbb = listProduitPrix.get(i).getNomPdt();
					aaa = listProduitPrix.get(i).getPrixPdt();

					break;
				}
			}
			int total = qtee * aaa;

			Map m = new HashMap();
			m.put("fact", code);
			m.put("nomPdt", bbb);
			m.put("prixPdt", aaa);
			m.put("total", total);
			byte[] b = JasperRunManager.runReportToPdf(reportStream, m, conn);
			response.setContentType("application/pdf");
			response.setContentLength(b.length);
			ServletOutputStream servletOutputStream = response
					.getOutputStream();
			servletOutputStream.write(b, 0, b.length);
			servletOutputStream.flush();
			servletOutputStream.close();

		} catch (Exception e) {
			System.out.println("Error!!!!!!!!!");
		}
	}

}
