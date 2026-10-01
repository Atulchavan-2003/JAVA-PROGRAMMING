package Shopping_Cart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import Shopping_Cart.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
	CartItem findByCart_IdAndProduct_Id(int cartId, int productId);
	List<CartItem> findByCart_Id(int cartId);
}
