package com.vanina.gestionVanina.service;

import javax.persistence.Id;

import com.vanina.gestionVanina.entities.Facture;

public interface IFactureService {
	
//	public float soldeDu(Facture f);
	public float totalHTRemise(Facture f);
	public float totalTVA(Facture f);
	public float totalHTnet(Facture f);
	public float totalTTC(Facture f);
//	public float accomptes(Facture f);
	public float netAPayer(Facture f);

}
