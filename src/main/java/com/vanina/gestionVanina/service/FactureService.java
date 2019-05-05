package com.vanina.gestionVanina.service;

import org.springframework.stereotype.Service;

import com.vanina.gestionVanina.dao.IFactureDAO;
import com.vanina.gestionVanina.entities.Facture;

@Service
public class FactureService implements IFactureService {

	private IFactureDAO dao;

	public IFactureDAO getDao() {
		return dao;
	}

	public void setDao(IFactureDAO dao) {
		this.dao = dao;
	}
	

//	@Override
//	public float soldeDu(Facture f) {
//		// TODO Auto-generated method stub
//		//return f.getPrixUnitaireHT()*f.getOrdredecommande().getQuantiteProduit();
//		return f.getPrixUnitaireHT()*f.getQuantite();
//	}

	@Override
	public float totalHTRemise(Facture f) {
		// TODO Auto-generated method stub	
		return totalHTnet(f)*f.getRemise();
	}

	@Override
	public float totalTVA(Facture f) {
		// TODO Auto-generated method stub
		return totalHTRemise(f)*f.getTva();
	}

	@Override
	public float totalHTnet(Facture f) {
		// TODO Auto-generated method stub
		//return f.getPrixUnitaireHT()*f.getOrdredecommande().getQuantiteProduit();
		return f.getPrixUnitaireHT()*f.getQuantite();
	}

	@Override
	public float totalTTC(Facture f) {
		// TODO Auto-generated method stub
		return totalHTnet(f)-totalHTRemise(f)+totalTVA(f);
	}

//	@Override
//	public float accomptes(Facture f) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public float netAPayer(Facture f) {
		// TODO Auto-generated method stub
		return totalTTC(f)-f.getAccomptes();
	}
	
	
	
}
