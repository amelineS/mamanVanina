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

import com.vanina.gestionVanina.entities.OrdreDeCommande;
import com.vanina.gestionVanina.service.IOrdreService;

@CrossOrigin
@RestController
public class OrdreController {

	@Autowired
	IOrdreService ordreService;
	
	
	
	@PostMapping("/ordre/save")
	public OrdreDeCommande save (@RequestBody OrdreDeCommande ordre) {
		
		return ordreService.save(ordre);
	}
	
	@GetMapping("/ordre")
	public List <OrdreDeCommande> findAll() {
		
		return ordreService.findAll();
	}
	
	@PostMapping("/ordre/update")
	public OrdreDeCommande update (@RequestBody OrdreDeCommande ordre) {
		
		return ordreService.update(ordre);
	}
	
	@DeleteMapping("/ordre/delete/{id}")
	public void delete (@PathVariable Long id) {
		
		ordreService.delete(id);
	}
	
	@GetMapping("/ordre/{id}")
	public OrdreDeCommande findById (@PathVariable Long id) {
		
		return ordreService.findById(id);
	}
}
