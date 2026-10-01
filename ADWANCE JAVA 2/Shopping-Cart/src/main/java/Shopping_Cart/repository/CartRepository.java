package Shopping_Cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Shopping_Cart.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
   
}
