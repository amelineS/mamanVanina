package com.vanina.gestionVanina.service;

import java.util.List;

import com.vanina.gestionVanina.entities.Client;

public interface IClientService {
	Client save(Client c);
	List<Client> findAll();
	Client update(Client c);
	void delete(Long id);
	Client findById(Long id);

}
