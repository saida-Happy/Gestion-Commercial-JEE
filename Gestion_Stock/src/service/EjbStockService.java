package service;

import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.ProduitsStock;

@Stateless(name = "EjbStockService", mappedName = "tt/tt")
public class EjbStockService implements EjbStockServiceRemote {

// ********** Méthode à être consommée par EJB qui permet de retourner un tableau de tous les enregistrements existant dans la table ‘’Produits_Stock’’ (CodeStock, codePdt, qtePdt)**********
	
	public ProduitsStock[] traitement() {
		dao.ProduitsStockDAO dao = new dao.ProduitsStockDAO();
		Session ss = dao.getSession();
		Transaction tx = ss.beginTransaction();
		List<ProduitsStock> mylist = dao.findAll();
		ProduitsStock[] mytable = new ProduitsStock[mylist.size()];
		Iterator it = mylist.iterator();
		int i = 0;
		while (it.hasNext()) {
			ProduitsStock p1 = (ProduitsStock) it.next();
			mytable[i] = p1;
			i++;
		}

		return mytable;

	}

// ********** Methode consommée par EJB qui permet de recevoir deux paramètres (codePdt, qteCmd) et de Soustraire la quantité commandée de la table ‘’Produits_Stock’’. **********
	
	public int udpateStock(int code, int qte) {

		dao.ProduitsStockDAO dao = new dao.ProduitsStockDAO();
		Session ss = dao.getSession();
		Transaction tx = ss.beginTransaction();
		ProduitsStock p1 = dao.findById(code);
		int Nvqte = p1.getQtePdt() - qte;
		p1.setQtePdt(Nvqte);
		ss.save(p1);
		tx.commit();
		ss.refresh(p1);
		ss.clear();
		ss.close();

		return 1;
	}

}
