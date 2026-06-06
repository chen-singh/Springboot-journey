package in.cs.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.cs.main.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long> {
	
	

}
