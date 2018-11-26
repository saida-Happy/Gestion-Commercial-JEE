package bo;

import java.util.List;

import dao.ClientDAO;

public class ClientBo {
	private dao.ClientDAO clientDAO;

	public dao.ClientDAO getClientDAO() {
		return clientDAO;
	}

	public void setClientDAO(dao.ClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}

	// ********** Ajouter un client à la base de données **********

	public void addClient(dao.Client client) { 
	         clientDAO.save(client); 
	} 
	 
	// ********** Chercher un client par son "id" de la base de données **********

    public dao.Client findClientById(Integer id) { 
        return  clientDAO.findById(id); 
    } 
    
	// ********** Chercher un client par son "nom" de la base de données **********

    public List<dao.Client> findClientByName(Object nomClient) { 
        return  clientDAO.findByNomClient(nomClient);
    } 
 
	// ********** Mettre à jour les inforamtions d'un client de la base de données **********

    public void updateClient(dao.Client client) { 
        clientDAO.merge(client); 
    } 

	// ********** Supprimer un client dans la base de données **********

    public void deleteClient(dao.Client client) { 
        clientDAO.delete(client); 
    } 
    
	// ********** Récuperer la liste de tous les clients dans la base de données **********

    public List<dao.Client> findAllUser() {
    	return clientDAO.findAll();
    }
    
}
