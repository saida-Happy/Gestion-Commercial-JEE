package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bo.ClientBo;

/**
 * Client entity. @author MyEclipse Persistence Tools
 */
public class Client extends AbstractClient implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Client() {
	}

	/** full constructor */
	public Client(String nomClient, String adresseClient, String teleClient,
			String emailClient) {
		super(nomClient, adresseClient, teleClient, emailClient);
	}

	
	
	public String ajouterClient() {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
        ClientBo clientBo  = (ClientBo)ctx.getBean("clientBo");
        FacesContext fc = FacesContext.getCurrentInstance(); 
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		
		setNomClient(getNomClient());
		setAdresseClient(getAdresseClient());
		setTeleClient(getTeleClient());		
		setEmailClient(getEmailClient());

		clientBo.addClient(this);
		
		this.setNomClient("");
		this.setAdresseClient("");
		this.setTeleClient("");		
		this.setEmailClient("");

			 return "ajoutC";
	}
	
	public String annulerClient() {
		return "ajoutC";
	}
	
	
}
