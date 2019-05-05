package com.vanina.gestionVanina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanina.gestionVanina.dao.IRoleDAO;
import com.vanina.gestionVanina.entities.Role;

@Service
public class RoleService implements IRoleService{
	
	@Autowired
	IRoleDAO roleDao; 

	@Override
	public Role save(Role role) {
		
		return roleDao.save(role);
	}

	@Override
	public List<Role> findAll() {
		return roleDao.findAll();
	}

	@Override
	public Role update(Role role) {
		return roleDao.save(role);
	}

	@Override
	public void delete(Long id) {
		roleDao.deleteById(id);
		
	}

	@Override
	public Role findById(Long id) {
		return roleDao.getOne(id);
	}

}
