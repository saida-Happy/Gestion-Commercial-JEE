package beans;

import java.util.Date;

/**
 * AbstractCommandes entity provides the base persistence definition of the
 * Commandes entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCommandes implements java.io.Serializable {

	// Fields

	private Integer codeCmd;
	private String nomClt;
	private Integer codePdt;
	private Integer qteCmd;
	private Date dateCmd;

	// Constructors

	/** default constructor */
	public AbstractCommandes() {
	}

	/** full constructor */
	public AbstractCommandes(Integer codeCmd, String nomClt, Integer codePdt,
			Integer qteCmd, Date dateCmd) {
		this.codeCmd = codeCmd;
		this.nomClt = nomClt;
		this.codePdt = codePdt;
		this.qteCmd = qteCmd;
		this.dateCmd = dateCmd;
	}

	// Property accessors

	public Integer getCodeCmd() {
		return this.codeCmd;
	}

	public void setCodeCmd(Integer codeCmd) {
		this.codeCmd = codeCmd;
	}

	public String getNomClt() {
		return this.nomClt;
	}

	public void setNomClt(String nomClt) {
		this.nomClt = nomClt;
	}

	public Integer getCodePdt() {
		return this.codePdt;
	}

	public void setCodePdt(Integer codePdt) {
		this.codePdt = codePdt;
	}

	public Integer getQteCmd() {
		return this.qteCmd;
	}

	public void setQteCmd(Integer qteCmd) {
		this.qteCmd = qteCmd;
	}

	public Date getDateCmd() {
		return this.dateCmd;
	}

	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}

}