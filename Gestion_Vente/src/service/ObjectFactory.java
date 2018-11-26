
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the service package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _AjouterCommandeResponse_QNAME = new QName("http://serviceWS/",
			"AjouterCommandeResponse");
	private final static QName _AjouterCommande_QNAME = new QName("http://serviceWS/", "AjouterCommande");
	private final static QName _ListProduit_QNAME = new QName("http://serviceWS/", "listProduit");
	private final static QName _ListProduitResponse_QNAME = new QName("http://serviceWS/", "listProduitResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: service
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ListProduit }
	 * 
	 */
	public ListProduit createListProduit() {
		return new ListProduit();
	}

	/**
	 * Create an instance of {@link AjouterCommande }
	 * 
	 */
	public AjouterCommande createAjouterCommande() {
		return new AjouterCommande();
	}

	/**
	 * Create an instance of {@link ProduitsPrix }
	 * 
	 */
	public ProduitsPrix createProduitsPrix() {
		return new ProduitsPrix();
	}

	/**
	 * Create an instance of {@link ListProduitResponse }
	 * 
	 */
	public ListProduitResponse createListProduitResponse() {
		return new ListProduitResponse();
	}

	/**
	 * Create an instance of {@link AjouterCommandeResponse }
	 * 
	 */
	public AjouterCommandeResponse createAjouterCommandeResponse() {
		return new AjouterCommandeResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link AjouterCommandeResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://serviceWS/", name = "AjouterCommandeResponse")
	public JAXBElement<AjouterCommandeResponse> createAjouterCommandeResponse(AjouterCommandeResponse value) {
		return new JAXBElement<AjouterCommandeResponse>(_AjouterCommandeResponse_QNAME, AjouterCommandeResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AjouterCommande
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://serviceWS/", name = "AjouterCommande")
	public JAXBElement<AjouterCommande> createAjouterCommande(AjouterCommande value) {
		return new JAXBElement<AjouterCommande>(_AjouterCommande_QNAME, AjouterCommande.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ListProduit
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://serviceWS/", name = "listProduit")
	public JAXBElement<ListProduit> createListProduit(ListProduit value) {
		return new JAXBElement<ListProduit>(_ListProduit_QNAME, ListProduit.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ListProduitResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://serviceWS/", name = "listProduitResponse")
	public JAXBElement<ListProduitResponse> createListProduitResponse(ListProduitResponse value) {
		return new JAXBElement<ListProduitResponse>(_ListProduitResponse_QNAME, ListProduitResponse.class, null, value);
	}

}
