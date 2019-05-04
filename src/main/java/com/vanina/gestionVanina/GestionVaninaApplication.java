package com.vanina.gestionVanina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vanina.gestionVanina.dao.IFactureDAO;
import com.vanina.gestionVanina.entities.Facture;
import com.vanina.gestionVanina.service.IFactureService;

@SpringBootApplication
public class GestionVaninaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GestionVaninaApplication.class, args);
		
		IFactureDAO dao = ctx.getBean(com.vanina.gestionVanina.dao.IFactureDAO.class);
		
		IFactureService service =  ctx.getBean(com.vanina.gestionVanina.service.IFactureService.class);
	
		Facture f = new Facture(12, null, null, 13f, 0.52f, null, 0.25f, 200);
		f.setQuantite(12);
		dao.save(f);
		System.out.println(service.totalHTnet(f));
	
	}

}
