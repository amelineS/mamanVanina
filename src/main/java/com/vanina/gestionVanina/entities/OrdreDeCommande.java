package com.vanina.gestionVanina.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class OrdreDeCommande implements Serializable {
	
	@Id @GeneratedValue
	private long id;	
	
	private boolean coupeEnBout;
	private boolean thermo;
	private boolean empdbl;
	private String thermoType;
	private String faconnier;
	private String societe;
	private String receptionneur;	
	private int quantiteProduit;
	

	private String fabricant;
	private String taille;
	private String couleur;
	private String modele;
	private float prix;

	
}