package beans;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bo.UsersBo;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */
public class Users extends AbstractUsers implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String login, String password) {
		super(login, password);
	}

	
	// ********** Méthode d'authentification **********
	
	public String Login() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		UsersBo userBO = (UsersBo) ctx.getBean("usersBo");

		if (getPassword() != null && getLogin() != null) {

			ArrayList<Users> userl = (ArrayList<Users>) userBO.findByLogin(getLogin());
			for (Users user : userl) {
				if (user != null
						&& user.getPassword().equalsIgnoreCase(getPassword())) {
					HttpSession session = (HttpSession) FacesContext
							.getCurrentInstance().getExternalContext()
							.getSession(false);
					;
					session.setAttribute("login", getLogin());
					session.setAttribute("id", user.getCodeUser());
					setPassword("");
					return "login";
				}
			}
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Nom ou mot de passe incorrect !!",
							"Vérifier vos informations !"));

			return "failure";

		} else {

			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							" Votre nom ou mot de passe est incorrect !!! ",
							" Vérifier vos informations ! "));

			return "failure";
		}

	}

	
	// ********** Méthode pour changer le mot de passe **********

	public String ModifierPassword() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UsersBo userBO = (UsersBo) ctx.getBean("usersBo");

		FacesContext fc = FacesContext.getCurrentInstance();
		FacesMessage fm = new FacesMessage("Vérifier vos informations !");
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		int id = Integer.parseInt(session.getAttribute("id").toString());

		if (getLogin() != null && getPassword() != null) {
			Users user = userBO.findUserById(id);
			if (user != null) {

				user.setPassword(getPassword());
				userBO.updateUser(user);
			}

		} else {

			fc.addMessage("editPasswordForm", fm);
		}
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_WARN,
						" Mot de passe modifié avec success !",
						" Vérifier vos informations !"));
		return "modifierSuccess";
	}

	// ********** Methode qui permet de se déconnecter **********
	
	public String Deconnexion() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		;
		session.invalidate();
		return "logout";
	}

	
	public String annulerModif() {

		return "pageAccueil";
	}
}
