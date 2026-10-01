package Shopping_Cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import Shopping_Cart.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
			
}
