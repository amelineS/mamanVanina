package com.vanina.gestionVanina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vanina.gestionVanina.dao.IClientDAO;
import com.vanina.gestionVanina.entities.Client;

@SpringBootApplication
public class GestionVaninaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GestionVaninaApplication.class, args);
		
		IClientDAO serviceClient = ctx.getBean(com.vanina.gestionVanina.dao.IClientDAO.class);
		
		
		Client c1= new Client("Robert",null,"Adresse","Societe","00000","00000","email@gmail.com",null);
		
		serviceClient.save(c1);
		
		
		
	}

}
