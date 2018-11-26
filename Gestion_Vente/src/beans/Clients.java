/**
 * 
 */
package beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.swing.JOptionPane;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.Client;
import bo.ClientBo;

/**
 * @author DELL
 * 
 */
public class Clients {

	private ClientBo clientBo;
	private List<Client> liste;
	private List<String> noms;
	private Client client;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<String> getNoms() {
		return getName();
	}

	public void setNoms(List<String> noms) {
		this.noms = noms;
	}

	public ClientBo getClientBo() {
		return clientBo;
	}

	public void setClientBo(ClientBo clientBo) {
		this.clientBo = clientBo;
	}

	public List<Client> getListe() {
		return getClientList();
	}

	public void setListe(List<Client> liste) {
		this.liste = liste;
	}

	public Clients() {
	}

	// ********** Récuperer la liste des clients depuis la base de données **********
	public List<dao.Client> getClientList() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		clientBo = (ClientBo) ctx.getBean("clientBo");
		return clientBo.findAllUser();
	}

	
	// ********** Récuperer la liste des noms des clients uniquement depuis la base de données **********

	public List<String> getName() {
		noms = new ArrayList<String>();
		for (int i = 0; i < getListe().size(); i++) {
			noms.add(getListe().get(i).getNomClient());
		}
		return noms;
	}
	
	// ********** Supprimer un client de la base de données et de la session **********

	public void supprimerClient() {

		ExternalContext exc = FacesContext.getCurrentInstance()
				.getExternalContext();
		Map<String, String> params = exc.getRequestParameterMap();
		String code = params.get("nomClient");
		liste = getClientList();
		Iterator<dao.Client> it = liste.iterator();
		while (it.hasNext()) {
			client = it.next();
			if (client.getNomClient().equals(code)) {
				ApplicationContext ctx = new ClassPathXmlApplicationContext(
						"applicationContext.xml");
				clientBo = (ClientBo) ctx.getBean("clientBo");
				clientBo.deleteClient(client);
				break;
			}

		}

	}


	public String addClient() {
		return "envoieC";
	}

}