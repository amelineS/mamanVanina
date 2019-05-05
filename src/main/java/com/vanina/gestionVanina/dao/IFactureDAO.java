package com.vanina.gestionVanina.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vanina.gestionVanina.entities.Facture;


@RepositoryRestResource
public interface IFactureDAO extends JpaRepository<Facture, Long> {

}
