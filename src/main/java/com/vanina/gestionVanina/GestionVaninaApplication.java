package com.vanina.gestionVanina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vanina.gestionVanina.dao.IProduitDAO;
import com.vanina.gestionVanina.entities.Produit;

@SpringBootApplication
public class GestionVaninaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GestionVaninaApplication.class, args);
		IProduitDAO produitRepo = ctx.getBean(com.vanina.gestionVanina.dao.IProduitDAO.class);
		
		
		Produit produit1=new Produit(null, "vanina", "L", "rouge", "T-shirt", 45f);
		
		produit1=produitRepo.save(produit1);
	}

}
