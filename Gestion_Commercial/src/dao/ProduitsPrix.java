package dao;


import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * ProduitsPrix entity. @author MyEclipse Persistence Tools
 */
public class ProduitsPrix extends AbstractProduitsPrix implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ProduitsPrix() {
	}

	/** full constructor */
	public ProduitsPrix(Integer codePdt, String nomPdt, String descPdt,
			Integer prixPdt) {
		super(codePdt, nomPdt, descPdt, prixPdt);
	}
	
}
