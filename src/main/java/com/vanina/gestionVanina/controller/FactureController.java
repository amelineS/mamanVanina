package com.vanina.gestionVanina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vanina.gestionVanina.entities.Facture;
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
	

	
	
	
}
