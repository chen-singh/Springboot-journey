package in.cs.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cs.main.entities.USers;
import in.cs.main.service.UserService;

@RestController
public class AuthController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/register")
	public USers register(@RequestBody USers user) {
		return service.createUser(user);
		
	}

}
