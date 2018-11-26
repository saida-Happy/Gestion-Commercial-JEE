package dao;

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
