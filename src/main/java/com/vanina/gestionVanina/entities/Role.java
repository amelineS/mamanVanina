package com.vanina.gestionVanina.entities;

import java.io.Serializable;

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
public class Role implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2223076399337892424L;
	
	@Id @GeneratedValue
	private Long idRole; 
	private String roleName; 

	
}
