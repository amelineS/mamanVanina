package com.vanina.gestionVanina.service;



import java.util.List;


import com.vanina.gestionVanina.entities.Facture;


public interface IFactureService {
	
//	public float soldeDu(Facture f);
	public float totalHTRemise(Facture f);
	public float totalTVA(Facture f);
	public float totalHTnet(Facture f);
	public float totalTTC(Facture f);

	public float netAPayer(Facture f);

	Facture save (Facture f);
	List <Facture> findAll();
	Facture update (Facture f);
	void delete (Long id);
	Facture findById (Long id);
}
