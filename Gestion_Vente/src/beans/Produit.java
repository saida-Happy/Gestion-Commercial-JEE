package beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpSession;


import dao.ProduitsStock;
import service.ProduitsPrix;

import service.EjbStockServiceRemote;
import service.CommercialWSService;
import service.Commercial;
import service.CommercialWSDelegate;

public class Produit {
	private int codePdt;
	private String nomPdt;
	private int qtePdt;
	private int prixPdt;
	private ArrayList<Produit> liste = new ArrayList<Produit>();

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(int codePdt, String nomPdt, int qtePdt, int prixPdt) {
		super();
		this.codePdt = codePdt;
		this.nomPdt = nomPdt;
		this.qtePdt = qtePdt;
		this.prixPdt = prixPdt;
	}

	public int getCodePdt() {
		return codePdt;
	}

	public void setCodePdt(int codePdt) {
		this.codePdt = codePdt;
	}

	public int getQtePdt() {
		return qtePdt;
	}

	public void setQtePdt(int qtePdt) {
		this.qtePdt = qtePdt;
	}

	public String getNomPdt() {
		return nomPdt;
	}

	public void setNomPdt(String nomPdt) {
		this.nomPdt = nomPdt;
	}

	public int getPrixPdt() {
		return prixPdt;
	}

	public void setPrixPdt(int prixPdt) {
		this.prixPdt = prixPdt;
	}

	public ArrayList<Produit> getListe() {
		return afficher();
	}

	public void setListe(ArrayList<Produit> liste) {
		this.liste = liste;
	}

	
	// ********** Afficher les informations des produits qui existent en stock **********

	public ArrayList afficher() {

		liste.clear();
		liste.removeAll(liste);

		InitialContext ctx;
		ProduitsStock[] stock = null;
		CommercialWSService client = new CommercialWSService();

		CommercialWSDelegate service = client
				.getCommercialWSPort();
		List<ProduitsPrix> listProduitPrix=null;
		listProduitPrix=service.listProduit();
		
		
		
		
		

		try {

			ctx = new InitialContext();
			EjbStockServiceRemote bol = (EjbStockServiceRemote) ctx
					.lookup("tt/tt");
			stock = bol.traitement();

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int k = 0;
		for (int j = 0; j < stock.length; j++) {
			Produit p = new Produit();
			p.setCodePdt(stock[j].getCodePdt());
			p.setQtePdt(stock[j].getQtePdt());
			int n = stock[j].getCodePdt();
			for (int i = 0; i < listProduitPrix.size(); i++) {

				if (listProduitPrix.get(i).getCodePdt() == n) {
					p.setNomPdt(listProduitPrix.get(i).getNomPdt());
					p.setPrixPdt(listProduitPrix.get(i).getPrixPdt());
					k = 1;
					break;
				}
			}

			if (k == 1) {
				liste.add(p);
			}

		}

		return liste;
	}

}
