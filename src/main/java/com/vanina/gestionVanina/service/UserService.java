package com.vanina.gestionVanina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanina.gestionVanina.dao.IUserDAO;
import com.vanina.gestionVanina.entities.User;

@Service
public class UserService implements IUserService{
	
	@Autowired
	IUserDAO userDao; 

	@Override
	public User save(User user) {
		
		return userDao.save(user);
	}

	@Override
	public List<User> findAll() {
		
		return userDao.findAll();
	}

	@Override
	public User update(User user) {
		
		return userDao.save(user);
	}

	@Override
	public void delete(Long id) {
		userDao.deleteById(id);
		
	}

	@Override
	public User findById(Long id) {
		
		return userDao.getOne(id);
	}

}
