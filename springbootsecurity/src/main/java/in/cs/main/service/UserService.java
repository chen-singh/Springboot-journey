package in.cs.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cs.main.entities.USers;
import in.cs.main.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public USers createUser(USers user) {
		return userRepo.save(user);
		
	}
	
	public USers getUSer(String email) {
		return userRepo.findByEmail(email);
		
	}
	
	public List<USers> getAll(){
		return userRepo.findAll();
		
	}
}
