
package dao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dao package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProduitsPrixPrixPdt_QNAME = new QName("http://dao", "prixPdt");
    private final static QName _ProduitsPrixCodePdt_QNAME = new QName("http://dao", "codePdt");
    private final static QName _ProduitsPrixNomPdt_QNAME = new QName("http://dao", "nomPdt");
    private final static QName _ProduitsPrixDescPdt_QNAME = new QName("http://dao", "descPdt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfProduitsPrix }
     * 
     */
    public ArrayOfProduitsPrix createArrayOfProduitsPrix() {
        return new ArrayOfProduitsPrix();
    }

    /**
     * Create an instance of {@link ProduitsPrix }
     * 
     */
    public ProduitsPrix createProduitsPrix() {
        return new ProduitsPrix();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao", name = "prixPdt", scope = ProduitsPrix.class)
    public JAXBElement<Integer> createProduitsPrixPrixPdt(Integer value) {
        return new JAXBElement<Integer>(_ProduitsPrixPrixPdt_QNAME, Integer.class, ProduitsPrix.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao", name = "codePdt", scope = ProduitsPrix.class)
    public JAXBElement<Integer> createProduitsPrixCodePdt(Integer value) {
        return new JAXBElement<Integer>(_ProduitsPrixCodePdt_QNAME, Integer.class, ProduitsPrix.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao", name = "nomPdt", scope = ProduitsPrix.class)
    public JAXBElement<String> createProduitsPrixNomPdt(String value) {
        return new JAXBElement<String>(_ProduitsPrixNomPdt_QNAME, String.class, ProduitsPrix.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao", name = "descPdt", scope = ProduitsPrix.class)
    public JAXBElement<String> createProduitsPrixDescPdt(String value) {
        return new JAXBElement<String>(_ProduitsPrixDescPdt_QNAME, String.class, ProduitsPrix.class, value);
    }

}
