package in.cs.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.cs.main.entities.USers;

@Repository
public interface UserRepository extends JpaRepository<USers , Integer> {

}
