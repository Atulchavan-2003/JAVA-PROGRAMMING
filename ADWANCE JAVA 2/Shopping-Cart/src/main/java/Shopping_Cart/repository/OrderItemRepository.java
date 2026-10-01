package Shopping_Cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Shopping_Cart.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
