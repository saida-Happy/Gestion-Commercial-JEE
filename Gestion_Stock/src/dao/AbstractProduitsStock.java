package dao;

/**
 * AbstractProduitsStock entity provides the base persistence definition of the
 * ProduitsStock entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProduitsStock implements java.io.Serializable {

	// Fields

	private Integer codePdt;
	private Integer codeStock;
	private Integer qtePdt;

	// Constructors

	/** default constructor */
	public AbstractProduitsStock() {
	}

	/** full constructor */
	public AbstractProduitsStock(Integer codePdt, Integer codeStock,
			Integer qtePdt) {
		this.codePdt = codePdt;
		this.codeStock = codeStock;
		this.qtePdt = qtePdt;
	}

	// Property accessors

	public Integer getCodePdt() {
		return this.codePdt;
	}

	public void setCodePdt(Integer codePdt) {
		this.codePdt = codePdt;
	}

	public Integer getCodeStock() {
		return this.codeStock;
	}

	public void setCodeStock(Integer codeStock) {
		this.codeStock = codeStock;
	}

	public Integer getQtePdt() {
		return this.qtePdt;
	}

	public void setQtePdt(Integer qtePdt) {
		this.qtePdt = qtePdt;
	}

}