package bo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import beans.Commandes;
import dao.CommandesDAO;


public class CommandeBo {
	private CommandesDAO commandesDAO;

	
	  public CommandesDAO getCommandesDAO() {
		return commandesDAO;
	}


	public void setCommandesDAO(CommandesDAO commandesDAO) {
		this.commandesDAO = commandesDAO;
	}

	// ********** Ajouter une commande à la base de données **********

	public void addCommande(Commandes commande) { 
	    	 
		     CommandesDAO s = new CommandesDAO();
	    	 Session ss = s.getSession();					
			 Transaction tx = ss.beginTransaction();
	         commandesDAO.save(commande); 
	         tx.commit(); 
	         
	     }
	
	// ********** Chercher une commande par son "id" de la base de données **********

	  public beans.Commandes findCommandeById(Integer id) { 
	        return commandesDAO.findById(id);
	     
	    } 
	 
	// ********** Mettre à jour les inforamtions d'une commande de la base de données **********

	    public void updateCommande(beans.Commandes  c) { 
	    	commandesDAO.merge(c); 
	    } 

	// ********** Supprimer une commande dans la base de données **********

	    public void deleteCommande(beans.Commandes  c) { 
	    	commandesDAO.delete(c); 
	    } 
	    
	// ********** Récuperer la liste de toutes les commandes dans la base de données **********

	    public List<beans.Commandes > findAllCommande() {
	    	return commandesDAO.findAll();
	    }
	    
}
