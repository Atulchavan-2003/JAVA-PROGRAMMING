package Shopping_Cart.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Shopping_Cart.entity.Order;
import Shopping_Cart.service.OrderService;

@RestController
public class OrderController {
		private final OrderService orderService;

		public OrderController(OrderService orderService) {
			
			this.orderService = orderService;
		}
		
		@PostMapping("/api/orders")
		public Order addOrder(@RequestBody Order order) {
			return orderService.addOrder(order);
			
		}
		
		@GetMapping("/api/orders")
		public List<Order> getAllOrder(){
			return orderService.getAllOrder();
		}
		
		@GetMapping("/api/orders/{id}")
		public Order getOrderById(@PathVariable int id ){
			return orderService.getOrderById(id);
		}
		
		@PutMapping("/api/orders/{id}")
		public Order updateOrder(@PathVariable int id, @RequestBody Order order ) {
		     return orderService.updateOrder(id, order);
		}
		
		@DeleteMapping("/api/orders/{id}")
		public String deleteOrderById(@PathVariable int id ) {
			return orderService.deleteById(id);
		}
		
		@PostMapping("/api/orders/place/{cartId}")
		public Order placeOrder(@PathVariable int cartId) {
		    return orderService.placeOrder(cartId);
		}
		
}
