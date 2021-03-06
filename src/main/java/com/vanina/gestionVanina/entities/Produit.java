package com.vanina.gestionVanina.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Produit  {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1563129641322307003L;
	
	@Id @GeneratedValue
	private Long idProduit;
	
	private String taille;
	private String couleur;
	
	private float prix;
	

	private int quantiteProduit;
	
	
}
