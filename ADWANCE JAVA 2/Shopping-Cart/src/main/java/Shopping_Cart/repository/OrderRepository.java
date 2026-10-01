package Shopping_Cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Shopping_Cart.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
