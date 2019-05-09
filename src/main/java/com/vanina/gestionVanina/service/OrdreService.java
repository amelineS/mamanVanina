package com.vanina.gestionVanina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanina.gestionVanina.dao.IOrdreDeCommandeDAO;
import com.vanina.gestionVanina.entities.OrdreDeCommande;
import com.vanina.gestionVanina.entities.Produit;

@Service
public class OrdreService implements IOrdreService {

	@Autowired
	IOrdreDeCommandeDAO ordredao;
	
	
	
	@Override
	public OrdreDeCommande save(OrdreDeCommande ordre) {
		
		return ordredao.save(ordre);
	}

	@Override
	public List<OrdreDeCommande> findAll() {
		
		return ordredao.findAll();
	}

	@Override
	public OrdreDeCommande update(OrdreDeCommande ordre) {
		
		return ordredao.save(ordre);
	}

	@Override
	public void delete(Long id) {
		
		ordredao.deleteById(id);
	}

	@Override
	public OrdreDeCommande findById(Long id) {
		
		return ordredao.getOne(id);
	}

	@Override
	public void ajoutProduit(Produit p, Long id) {
		findById(id).getListProduits().add(p);
		save(findById(id));
		
	}

}
