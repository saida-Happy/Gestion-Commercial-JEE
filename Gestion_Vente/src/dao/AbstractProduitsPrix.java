package dao;

/**
 * AbstractProduitsPrix entity provides the base persistence definition of the
 * ProduitsPrix entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProduitsPrix implements java.io.Serializable {

	// Fields

	private Integer codePdt;
	private String nomPdt;
	private String descPdt;
	private Integer prixPdt;

	// Constructors

	/** default constructor */
	public AbstractProduitsPrix() {
	}

	/** full constructor */
	public AbstractProduitsPrix(Integer codePdt, String nomPdt, String descPdt,
			Integer prixPdt) {
		this.codePdt = codePdt;
		this.nomPdt = nomPdt;
		this.descPdt = descPdt;
		this.prixPdt = prixPdt;
	}

	// Property accessors

	public Integer getCodePdt() {
		return this.codePdt;
	}

	public void setCodePdt(Integer codePdt) {
		this.codePdt = codePdt;
	}

	public String getNomPdt() {
		return this.nomPdt;
	}

	public void setNomPdt(String nomPdt) {
		this.nomPdt = nomPdt;
	}

	public String getDescPdt() {
		return this.descPdt;
	}

	public void setDescPdt(String descPdt) {
		this.descPdt = descPdt;
	}

	public Integer getPrixPdt() {
		return this.prixPdt;
	}

	public void setPrixPdt(Integer prixPdt) {
		this.prixPdt = prixPdt;
	}

}