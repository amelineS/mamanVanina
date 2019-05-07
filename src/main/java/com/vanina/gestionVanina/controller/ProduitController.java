package com.vanina.gestionVanina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vanina.gestionVanina.entities.Produit;
import com.vanina.gestionVanina.service.IProduitService;

@CrossOrigin
@RestController
public class ProduitController {

	@Autowired
	IProduitService produitService;
	
	
	
	@PostMapping("/produit/save")
	public Produit save (@RequestBody Produit produit) {
		
		return produitService.save(produit);
	}
	
	@GetMapping("/produit")
	public List <Produit> findAll() {
		
		return produitService.findAll();
	}
	
	@PostMapping("/produit/update")
	public Produit update (@RequestBody Produit produit) {
		
		return produitService.update(produit);
	}
	
	@DeleteMapping("/produit/delete/{id}")
	public void delete (@PathVariable Long id) {
		
		produitService.delete(id);
	}
	
	@GetMapping("/produit/{id}")
	public Produit findById (@PathVariable Long id) {
		
		return produitService.findById(id);
	}
}
