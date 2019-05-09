package com.vanina.gestionVanina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.vanina.gestionVanina.dao.IFactureDAO;
import com.vanina.gestionVanina.entities.Facture;
import com.vanina.gestionVanina.entities.Produit;

@Service
public class FactureService implements IFactureService {

	@Autowired
	private IFactureDAO dao;

	public IFactureDAO getDao() {
		return dao;
	}

	public void setDao(IFactureDAO dao) {
		this.dao = dao;
	}


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

		float total=0f;
		for(Produit p : f.getOrdredecommande().getListProduits()) {
			total+=p.getPrix()*p.getQuantiteProduit();
		}
		return total;
	//	return f.getPrixUnitaireHT()*f.getQuantite();
	}

	@Override
	public float totalTTC(Facture f) {
		// TODO Auto-generated method stub
		return totalHTnet(f)-totalHTRemise(f)+totalTVA(f);
	}


	@Override
	public float netAPayer(Facture f) {
		// TODO Auto-generated method stub
		return totalTTC(f)-f.getAcomptes();
	}

	@Override
	public List<Facture> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}


	@Override
	public Facture save(Facture f) {
		// TODO Auto-generated method stub
		return dao.save(f);
	}

	@Override
	public Facture update(Facture f) {
		// TODO Auto-generated method stub
		return dao.save(f);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public Facture findById(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}


	
	
	
}
