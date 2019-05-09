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
	private String modele;
	private String fabricant;
	private Date date;
	
	@OneToMany
	private List<Produit> ListProduits;

	


	
}