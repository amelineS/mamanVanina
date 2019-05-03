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
public class Produit implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1563129641322307003L;
	
	@Id @GeneratedValue
	private Long idProduit;
	private String fabricant;
	private String taille;
	private String couleur;
	private String modele;
	private float prix;
	
	
	
}
