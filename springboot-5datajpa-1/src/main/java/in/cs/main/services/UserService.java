package in.cs.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cs.main.entities.Users;
import in.cs.main.repository.UserRepository;

@Service
public class UserService {
     
	@Autowired
	private UserRepository userrepo;
	
	public Users create(Users user) {
		
	return userrepo.save(user);
		
	}
	
	public Users getUser(String email) {
		return userrepo.findByEmail(email);
		
	}
	
	

	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}
}
