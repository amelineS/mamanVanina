package com.vanina.gestionVanina.service;

import java.util.List;

import com.vanina.gestionVanina.entities.User;

public interface IUserService {
	
	User save(User user); 
	List<User> findAll(); 
	User update(User user); 
	void delete(Long id); 
	User findById(Long id); 
	

}
