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

import com.vanina.gestionVanina.entities.Facture;
import com.vanina.gestionVanina.entities.Produit;
import com.vanina.gestionVanina.service.IFactureService;


@CrossOrigin
@RestController
public class FactureController {

	
	@Autowired
	private IFactureService factureService;
	
//	@GetMapping("/facture/soldedu")
//	public float soldeDu(@RequestBody Facture f) {
//		// TODO Auto-generated method stub
//		return factureService.soldeDu(f);
//	}

	@GetMapping("/facture/totalhtremise")
	public float totalHTRemise(@RequestBody Facture f) {
		// TODO Auto-generated method stub
		return factureService.totalHTRemise(f);
	}

	@GetMapping("/facture/totaltva")
	public float totalTVA(@RequestBody Facture f) {
		// TODO Auto-generated method stub
		return factureService.totalTVA(f);
	}

	@GetMapping("/facture/totalhtnet")
	public float totalHTnet(@RequestBody Facture f) {
		// TODO Auto-generated method stub
		return factureService.totalHTnet(f);
	}

	@GetMapping("/facture/totalttc")
	public float totalTTC(@RequestBody Facture f) {
		// TODO Auto-generated method stub
		return factureService.totalTTC(f);
	}

//	@GetMapping("/facture/accomptes")
//	public float accomptes(@RequestBody Facture f) {
//		// TODO Auto-generated method stub
//		return factureService.accomptes(f);
//	}

	@GetMapping("/netapayer")
	public float netAPayer(@RequestBody Facture f) {
		// TODO Auto-generated method stub
		return factureService.netAPayer(f);
	}
	

	@PostMapping("/facture/save")
	public Facture save (@RequestBody Facture facture) {
		
		return factureService.save(facture);
	}
	
	@GetMapping("/facture")
	public List <Facture> findAll() {
		
		return factureService.findAll();
	}
	
	@PostMapping("/facture/update")
	public Facture update (@RequestBody Facture facture) {
		
		return factureService.update(facture);
	}
	
	@DeleteMapping("/facture/delete/{id}")
	public void delete (@PathVariable Long id) {
		
		factureService.delete(id);
	}
	
	@GetMapping("/facture/{id}")
	public Facture findById (@PathVariable Long id) {
		
		return factureService.findById(id);
	}
	
	
}
