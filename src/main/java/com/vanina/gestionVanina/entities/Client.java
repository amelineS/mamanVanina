package com.vanina.gestionVanina.entities;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Entity
public class Client implements Serializable {
	
	@Id @GeneratedValue
	private Long idClient; 
	private String prenomClient;
	private Date dateNaissance;
	private String adresse;
	private String nomSociete;
	private String numTel;
	private String fax;
	private String mail;
	
	@OneToMany
	private List<OrdreDeCommande> listeCommande;
	
	public Client(String prenomClient, Date dateNaissance, String adresse, String nomSociete, String numTel, String fax,
			String mail, List<OrdreDeCommande> listeCommande) {
		super();
		this.prenomClient = prenomClient;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.nomSociete = nomSociete;
		this.numTel = numTel;
		this.fax = fax;
		this.mail = mail;
		this.listeCommande = listeCommande;
	}
	
	
}
