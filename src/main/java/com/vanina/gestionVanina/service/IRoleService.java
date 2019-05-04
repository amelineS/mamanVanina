package com.vanina.gestionVanina.service;

import java.util.List;

import com.vanina.gestionVanina.entities.Role;

public interface IRoleService {
	
	Role save(Role role); 
	List<Role> findAll(); 
	Role update(Role role); 
	void delete(Long id); 
	Role findById(Long id); 

}
