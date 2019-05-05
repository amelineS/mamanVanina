package com.vanina.gestionVanina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanina.gestionVanina.dao.IClientDAO;
import com.vanina.gestionVanina.entities.Client;

@Service
public class ClientService implements IClientService {

	
	@Autowired
	IClientDAO dao;
	@Override
	public Client save(Client c) {
		// TODO Auto-generated method stub
		return dao.save(c);
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Client update(Client c) {
		// TODO Auto-generated method stub
		return dao.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public Client findById(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}
	

}
