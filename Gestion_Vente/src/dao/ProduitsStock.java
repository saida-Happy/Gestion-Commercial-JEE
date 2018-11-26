package dao;

/**
 * ProduitsStock entity. @author MyEclipse Persistence Tools
 */
public class ProduitsStock extends AbstractProduitsStock implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ProduitsStock() {
	}

	/** full constructor */
	public ProduitsStock(Integer codePdt, Integer codeStock, Integer qtePdt) {
		super(codePdt, codeStock, qtePdt);
	}

}
