package com.vanina.gestionVanina.service;

import java.util.List;

import com.vanina.gestionVanina.entities.OrdreDeCommande;
import com.vanina.gestionVanina.entities.Produit;

public interface IOrdreService {

	OrdreDeCommande save (OrdreDeCommande ordre);
	List <OrdreDeCommande> findAll();
	OrdreDeCommande update (OrdreDeCommande ordre);
	void delete (Long id);
	OrdreDeCommande findById (Long id);
	void ajoutProduit (Produit p, Long id);
}
