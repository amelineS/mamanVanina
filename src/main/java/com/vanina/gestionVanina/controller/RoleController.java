package com.vanina.gestionVanina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vanina.gestionVanina.entities.Role;
import com.vanina.gestionVanina.service.IRoleService;

@RestController
public class RoleController {
	
	@Autowired
	IRoleService roleService; 
	
	
	@PostMapping("role/save")
	public Role save(@RequestBody Role role) {
		return roleService.save(role);
	}

	@GetMapping("/roles")
	public List<Role> findAll() {
		return roleService.findAll();
	}

	@PostMapping("role/update")
	public Role update(@RequestBody Role role) {
		return roleService.update(role);
	}

	@DeleteMapping("role/delete/{id}")
	public void delete(@PathVariable Long id) {
		roleService.delete(id);
		
	}

	@GetMapping("role/{id}")
	public Role findById(@PathVariable Long id) {
		return roleService.findById(id);
	}

}
