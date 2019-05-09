package com.vanina.gestionVanina.entities;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client implements Serializable {
	
	@Id @GeneratedValue
	private Long idClient; 
	private String prenomClient;
	private String nomClient;
	private Date dateNaissance;
	private String adresse;
	private String ville;
	private String zipcode;
	private String nomSociete;
	private String numTel;
	private String fax;
	private String mail;
	
	@OneToMany
	private List<OrdreDeCommande> listeCommande;


	
	
}
