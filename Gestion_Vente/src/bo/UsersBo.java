package bo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.HibernateSessionFactory;

import dao.UsersDAO;

import beans.Users;

public class UsersBo {

	private UsersDAO usersDAO;

	public UsersDAO getUsersDAO() {
		return usersDAO;
	}

	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}

	// ********** Ajouter un utilisateur � la base de donn�es **********

	public void addUser(Users users) {

		UsersDAO s = new UsersDAO();
		Session ss = s.getSession();
		Transaction tx = ss.beginTransaction();
		usersDAO.save(users);
		tx.commit();
	}

	// ********** Chercher un utilisateur par son "id" de la base de donn�es **********

	public Users findUserById(Integer id) {
		return usersDAO.findById(id);
	}
	
	// ********** Mettre � jour les inforamtions d'un utilisateur de la base de donn�es **********

	public void updateUser(Users user) {
		UsersDAO s = new UsersDAO();
		Session ss = s.getSession();
		Transaction tx = ss.beginTransaction();
		usersDAO.merge(user);
		tx.commit();
		ss.refresh(user);
		ss.clear();
		ss.close();

	}

	// ********** Supprimer un utilisateur dans la base de donn�es **********

	public void deleteUser(Users user) {
		usersDAO.delete(user);
	}

	// ********** Chercher un utilisateur par son "login" de la base de donn�es **********

	public List findByLogin(Object login) {
		return usersDAO.findByLogin(login);
	}

}
