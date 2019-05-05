package com.vanina.gestionVanina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.vanina.gestionVanina.entities.Client;
import com.vanina.gestionVanina.service.IClientService;

@RestController
public class ServiceController {

	@Autowired
	IClientService clientService; 
	
	
	@PostMapping("Client/save")
	public Client save(@RequestBody Client Client) {
		return clientService.save(Client);
	}

	@GetMapping("/Clients")
	public List<Client> findAll() {
		return clientService.findAll();
	}

	@PostMapping("Client/update")
	public Client update(@RequestBody Client Client) {
		return clientService.update(Client);
	}

	@DeleteMapping("Client/delete/{id}")
	public void delete(@PathVariable Long id) {
		clientService.delete(id);
		
	}

	@GetMapping("Client/{id}")
	public Client findById(@PathVariable Long id) {
		return clientService.findById(id);
	}

}
