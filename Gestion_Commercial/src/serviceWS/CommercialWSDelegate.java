package serviceWS;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import dao.ProduitsPrix;
import dao.ProduitsPrixDAO;
import dao.TousCommandes;
import dao.TousCommandesDAO;
import javax.jws.WebParam;

@javax.jws.WebService(targetNamespace = "http://serviceWS/", serviceName = "CommercialWSService", portName = "CommercialWSPort", wsdlLocation = "WEB-INF/wsdl/CommercialWSService.wsdl")

public class CommercialWSDelegate {

	serviceWS.CommercialWS commercialWS = new serviceWS.CommercialWS();

	public ProduitsPrix[] listProduit() {
		return commercialWS.listProduit();
	}

	public int AjouterCommande(@WebParam(name = "codeCmd") int codeCmd, @WebParam(name = "client") String client,
			@WebParam(name = "codePdt") int codePdt, @WebParam(name = "qteCmd") int qteCmd,
			@WebParam(name = "dateCmd") Date dateCmd) {
		return commercialWS.AjouterCommande(codeCmd, client, codePdt, qteCmd, dateCmd);
	}

}