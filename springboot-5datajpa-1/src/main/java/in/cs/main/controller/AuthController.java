package in.cs.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import in.cs.main.entities.Users;
import in.cs.main.services.UserService;

@RestController
public class AuthController {

	@Autowired
	private UserService service;
	
	@PostMapping("/reg")
	public Users createUser(@RequestBody Users user) {
		return service.create(user);
		
	}
	
	@GetMapping("/log")
	public Users loginUser(@RequestParam String email) {
		return service.getUser(email);
	}
	
}
