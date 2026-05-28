package in.cs.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.cs.main.entities.Users;
@Repository
public interface UserRepository extends JpaRepository<Users ,Integer> {

	

	 Users findByEmail(String email);
	
}
