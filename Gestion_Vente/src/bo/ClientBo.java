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

	// ********** Ajouter un client � la base de donn�es **********

	public void addClient(dao.Client client) { 
	         clientDAO.save(client); 
	} 
	 
	// ********** Chercher un client par son "id" de la base de donn�es **********

    public dao.Client findClientById(Integer id) { 
        return  clientDAO.findById(id); 
    } 
    
	// ********** Chercher un client par son "nom" de la base de donn�es **********

    public List<dao.Client> findClientByName(Object nomClient) { 
        return  clientDAO.findByNomClient(nomClient);
    } 
 
	// ********** Mettre � jour les inforamtions d'un client de la base de donn�es **********

    public void updateClient(dao.Client client) { 
        clientDAO.merge(client); 
    } 

	// ********** Supprimer un client dans la base de donn�es **********

    public void deleteClient(dao.Client client) { 
        clientDAO.delete(client); 
    } 
    
	// ********** R�cuperer la liste de tous les clients dans la base de donn�es **********

    public List<dao.Client> findAllUser() {
    	return clientDAO.findAll();
    }
    
}
