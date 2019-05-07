package com.vanina.gestionVanina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanina.gestionVanina.dao.IProduitDAO;
import com.vanina.gestionVanina.entities.Produit;

@Service
public class ProduitService implements IProduitService{

	@Autowired
	IProduitDAO produitDao;

	@Override
	public Produit save(Produit produit) {
		
		return produitDao.save(produit);
	}

	@Override
	public List<Produit> findAll() {
		
		return produitDao.findAll();
	}

	@Override
	public Produit update(Produit produit) {
		
		return produitDao.save(produit);
	}

	@Override
	public void delete(Long id) {
		produitDao.deleteById(id);
		
	}

	@Override
	public Produit findById(Long id) {
		
		return produitDao.getOne(id);
	}
}
