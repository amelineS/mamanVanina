package com.vanina.gestionVanina;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.vanina.gestionVanina.dao.IOrdreDeCommandeDAO;
import com.vanina.gestionVanina.dao.IProduitDAO;
import com.vanina.gestionVanina.entities.OrdreDeCommande;
import com.vanina.gestionVanina.entities.Produit;


@SpringBootApplication
public class GestionVaninaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GestionVaninaApplication.class, args);
		IOrdreDeCommandeDAO cdao = ctx.getBean(com.vanina.gestionVanina.dao.IOrdreDeCommandeDAO.class);
		IProduitDAO pdao = ctx.getBean(com.vanina.gestionVanina.dao.IProduitDAO.class);
//		OrdreDeCommande o = new OrdreDeCommande(5, true, true, true, "thermoType", "faconnier", "societe", "receptionneur", "modele", "fabricant", "date", new ArrayList<Produit>());
//		
//		cdao.save(o);
//		cdao.deleteById(2L);;
//		
		System.out.println(pdao.findAll());
		
		
//		
	}

}
