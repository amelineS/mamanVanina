package com.vanina.gestionVanina.service;

import java.util.List;

import com.vanina.gestionVanina.entities.Produit;

public interface IProduitService {

	Produit save(Produit produit);
	List<Produit> findAll();
	Produit update(Produit produit);
	void delete(Long id);
	Produit findById(Long id);
}
