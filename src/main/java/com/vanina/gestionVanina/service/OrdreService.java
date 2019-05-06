package com.vanina.gestionVanina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanina.gestionVanina.entities.OrdreDeCommande;

@Service
public class OrdreService implements IOrdreService {

	@Autowired
	IOrdreService ordredao;
	
	
	
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
		
		ordredao.delete(id);
	}

	@Override
	public OrdreDeCommande findById(Long id) {
		
		return ordredao.findById(id);
	}

}
