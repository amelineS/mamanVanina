package com.vanina.gestionVanina.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrdreDeCommande {
	
	@Id @GeneratedValue
	private Long idCommande;

}
