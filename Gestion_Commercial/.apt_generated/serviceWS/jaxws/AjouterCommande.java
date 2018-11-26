
package serviceWS.jaxws;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AjouterCommande", namespace = "http://serviceWS/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AjouterCommande", namespace = "http://serviceWS/", propOrder = {
    "codeCmd",
    "client",
    "codePdt",
    "qteCmd",
    "dateCmd"
})
public class AjouterCommande {

    @XmlElement(name = "codeCmd", namespace = "")
    private int codeCmd;
    @XmlElement(name = "client", namespace = "")
    private String client;
    @XmlElement(name = "codePdt", namespace = "")
    private int codePdt;
    @XmlElement(name = "qteCmd", namespace = "")
    private int qteCmd;
    @XmlElement(name = "dateCmd", namespace = "")
    private Date dateCmd;

    /**
     * 
     * @return
     *     returns int
     */
    public int getCodeCmd() {
        return this.codeCmd;
    }

    /**
     * 
     * @param codeCmd
     *     the value for the codeCmd property
     */
    public void setCodeCmd(int codeCmd) {
        this.codeCmd = codeCmd;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getClient() {
        return this.client;
    }

    /**
     * 
     * @param client
     *     the value for the client property
     */
    public void setClient(String client) {
        this.client = client;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getCodePdt() {
        return this.codePdt;
    }

    /**
     * 
     * @param codePdt
     *     the value for the codePdt property
     */
    public void setCodePdt(int codePdt) {
        this.codePdt = codePdt;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getQteCmd() {
        return this.qteCmd;
    }

    /**
     * 
     * @param qteCmd
     *     the value for the qteCmd property
     */
    public void setQteCmd(int qteCmd) {
        this.qteCmd = qteCmd;
    }

    /**
     * 
     * @return
     *     returns Date
     */
    public Date getDateCmd() {
        return this.dateCmd;
    }

    /**
     * 
     * @param dateCmd
     *     the value for the dateCmd property
     */
    public void setDateCmd(Date dateCmd) {
        this.dateCmd = dateCmd;
    }

}
