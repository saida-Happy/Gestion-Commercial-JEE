package dao;

/**
 * AbstractClient entity provides the base persistence definition of the Client
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractClient implements java.io.Serializable {

	// Fields

	private Integer codeClient;
	private String nomClient;
	private String adresseClient;
	private String teleClient;
	private String emailClient;

	// Constructors

	/** default constructor */
	public AbstractClient() {
	}

	/** full constructor */
	public AbstractClient(String nomClient, String adresseClient,
			String teleClient, String emailClient) {
		this.nomClient = nomClient;
		this.adresseClient = adresseClient;
		this.teleClient = teleClient;
		this.emailClient = emailClient;
	}

	// Property accessors

	public Integer getCodeClient() {
		return this.codeClient;
	}

	public void setCodeClient(Integer codeClient) {
		this.codeClient = codeClient;
	}

	public String getNomClient() {
		return this.nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getAdresseClient() {
		return this.adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	public String getTeleClient() {
		return this.teleClient;
	}

	public void setTeleClient(String teleClient) {
		this.teleClient = teleClient;
	}

	public String getEmailClient() {
		return this.emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

}