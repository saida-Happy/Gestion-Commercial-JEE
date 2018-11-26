
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractProduitsPrix complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractProduitsPrix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codePdt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descPdt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomPdt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prixPdt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractProduitsPrix", propOrder = { "codePdt", "descPdt", "nomPdt", "prixPdt" })
public abstract class AbstractProduitsPrix {

	protected Integer codePdt;
	protected String descPdt;
	protected String nomPdt;
	protected Integer prixPdt;

	/**
	 * Gets the value of the codePdt property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCodePdt() {
		return codePdt;
	}

	/**
	 * Sets the value of the codePdt property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCodePdt(Integer value) {
		this.codePdt = value;
	}

	/**
	 * Gets the value of the descPdt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescPdt() {
		return descPdt;
	}

	/**
	 * Sets the value of the descPdt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescPdt(String value) {
		this.descPdt = value;
	}

	/**
	 * Gets the value of the nomPdt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNomPdt() {
		return nomPdt;
	}

	/**
	 * Sets the value of the nomPdt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNomPdt(String value) {
		this.nomPdt = value;
	}

	/**
	 * Gets the value of the prixPdt property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPrixPdt() {
		return prixPdt;
	}

	/**
	 * Sets the value of the prixPdt property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPrixPdt(Integer value) {
		this.prixPdt = value;
	}

}
