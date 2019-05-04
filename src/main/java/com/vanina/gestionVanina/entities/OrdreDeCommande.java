package com.vanina.gestionVanina.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class OrdreDeCommande {
	
	@Id @GeneratedValue
	private Long codeClient;

}
