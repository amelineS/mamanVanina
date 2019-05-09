package com.vanina.gestionVanina.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Facture implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -5423359394957223709L;
	
	@Id @GeneratedValue
	private Long numCommande;
//	private int codeClient;
	private String modeReglement;
	private int numTVA;
	private Date dateLivraison;
//	private int codeProduit;
//	private String description;
//	private int quantite;
//	private float prixUnitaireHT;
	private float tva;
	private Date dateEcheance;
	private float remise;
	private float acomptes;
	private Date date;
	private float escompte;
	private float montantEcheance;
	
	
	@OneToOne
	private OrdreDeCommande ordredecommande;


	
	
	
	
}