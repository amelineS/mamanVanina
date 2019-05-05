package com.vanina.gestionVanina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vanina.gestionVanina.entities.User;
import com.vanina.gestionVanina.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	IUserService userService; 
	
	@PostMapping("/user/save")
	public User save(@RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping("/users")
	public List<User> findAll() {
		return userService.findAll();
	}

	@PostMapping("user/update")
	public User update(@RequestBody User user) {
		return userService.update(user);
	}

	@DeleteMapping("user/delete/{id}")
	public void delete(@PathVariable Long id) {
		userService.delete(id);
		
	}

	@GetMapping("user/{id}")
	public User findById(@PathVariable Long id) {
		return userService.findById(id);
	}

}
