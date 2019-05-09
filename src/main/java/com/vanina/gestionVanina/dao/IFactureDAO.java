package com.vanina.gestionVanina.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vanina.gestionVanina.entities.Facture;

@CrossOrigin
@RepositoryRestResource
public interface IFactureDAO extends JpaRepository<Facture, Long> {

}
