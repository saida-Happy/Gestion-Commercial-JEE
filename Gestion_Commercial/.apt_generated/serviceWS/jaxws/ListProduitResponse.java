
package serviceWS.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "listProduitResponse", namespace = "http://serviceWS/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listProduitResponse", namespace = "http://serviceWS/")
public class ListProduitResponse {

    @XmlElement(name = "return", namespace = "", nillable = true)
    private dao.ProduitsPrix[] _return;

    /**
     * 
     * @return
     *     returns ProduitsPrix[]
     */
    public dao.ProduitsPrix[] getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(dao.ProduitsPrix[] _return) {
        this._return = _return;
    }

}
