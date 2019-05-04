package com.vanina.gestionVanina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vanina.gestionVanina.dao.IRoleDAO;
import com.vanina.gestionVanina.dao.IUserDAO;
import com.vanina.gestionVanina.entities.Role;
import com.vanina.gestionVanina.entities.User;

@SpringBootApplication
public class GestionVaninaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GestionVaninaApplication.class, args);
		IUserDAO udao = ctx.getBean(com.vanina.gestionVanina.dao.IUserDAO.class); 
		User u = new User(null, "user", "user123", true, null); 
		udao.save(u);
		
		IRoleDAO rdao = ctx.getBean(com.vanina.gestionVanina.dao.IRoleDAO.class); 
		Role r = new Role(null, "role1"); 
		rdao.save(r);
	}

}
