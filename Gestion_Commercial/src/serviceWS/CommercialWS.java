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

public class CommercialWS {
	// ********** Méthode qui permet de retourner un tableau de tous les enregistrements existant dans la table ‘’Produits_Prix’’ (codePdt, nomPdt, descPdt, prixPdt) **********
	
		public ProduitsPrix[] listProduit() {

			ProduitsPrixDAO dao = new ProduitsPrixDAO();
			List<ProduitsPrix> l = dao.findAll();
			ProduitsPrix[] mytable = new ProduitsPrix[l.size()];

			Iterator it = l.iterator();
			int i = 0;
			while (it.hasNext()) {
				ProduitsPrix p1 = (ProduitsPrix) it.next();
				mytable[i] = p1;
				i++;
			}

			return mytable;
		}
		
		
	 // ********** Methode qui reçoit cinq paramètres (codeCmd, client, codePdt, qteCmd,dateCmd) et les ajoute dans la table ‘’Tous_commandes’’ **********
		public int AjouterCommande(int codeCmd, String client, int codePdt, int qteCmd, Date dateCmd) {

			TousCommandesDAO dao = new TousCommandesDAO();
			Session ss = dao.getSession();

			Transaction tx = ss.beginTransaction();

			TousCommandes commandes = new TousCommandes(codeCmd, client, codePdt,
					qteCmd, dateCmd);
			ss.save(commandes);
			tx.commit();
			ss.refresh(commandes);
			ss.clear();
			ss.close();
			return 1;
		}

}
