package service;

import javax.ejb.Remote;

import dao.ProduitsStock;

@Remote
public interface EjbStockServiceRemote {
	public ProduitsStock[] traitement();
	public int udpateStock(int code,int qte);

}
