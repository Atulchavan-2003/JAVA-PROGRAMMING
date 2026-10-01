package Shopping_Cart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Shopping_Cart.entity.CartItem;
import Shopping_Cart.entity.Order;
import Shopping_Cart.entity.OrderItem;
import Shopping_Cart.entity.Product;
import Shopping_Cart.repository.CartItemRepository;
import Shopping_Cart.repository.OrderItemRepository;
import Shopping_Cart.repository.OrderRepository;
import Shopping_Cart.repository.ProductRepository;

@Service
public class OrderService {

	private final OrderRepository orderRepository;
    
	private final CartItemRepository cartItemRepository;
	
	private final ProductRepository productRepository;
	
	private final CartItemService cartItemService;
	
	private final OrderItemRepository orderItemRepository;
	
	public OrderService(
			OrderRepository orderRepository,
			ProductRepository productRepository,
			CartItemRepository cartItemRepository,
			CartItemService cartItemService,
			
			OrderItemRepository orderItemRepository
			) {
		
		this.orderRepository = orderRepository;
		this.productRepository= productRepository;
		this.cartItemRepository=cartItemRepository;
		this.cartItemService = cartItemService;
		this.orderItemRepository = orderItemRepository;
	}
	
	public Order addOrder(Order order) {
		return orderRepository.save(order);
	}
	
	public List<Order> getAllOrder(){
		return orderRepository.findAll();
	}
	
	public Order getOrderById(int id ) {
		return orderRepository.findById(id).orElse(null);
	}
	
	public Order updateOrder(int id , Order order) {
		      order.setId(id);
		      return orderRepository.save(order);
	}
	
	public String deleteById(int id ) {
		orderRepository.deleteById(id);
		return "Order deleted successfully";
	}
	
	public Order placeOrder(int cartId) {
		
		List<CartItem> cartItems = cartItemRepository.findByCart_Id(cartId);
		
		if (cartItems.isEmpty()) {
			throw new RuntimeException("Cart Items is Empty");
		}
		
		Order order = new Order();
		order.setStatus("PLACED");
		
		 order = orderRepository.save(order);
		 
		   double totalAmount = 0;
		
		   for (CartItem item : cartItems) {

			    Product product = item.getProduct();

			    int newStock = product.getStock() - item.getQuantity();

			    if (newStock < 0) {
			        throw new RuntimeException("Not enough stock");
			    }

			    totalAmount =
			            totalAmount
			            + (product.getPrice() * item.getQuantity());

			    product.setStock(newStock);

			    productRepository.save(product);

			    OrderItem orderItem = new OrderItem();

			    orderItem.setOrder(order);
		        orderItem.setProduct(product);
		        orderItem.setQuantity(item.getQuantity());
		        orderItem.setPrice(product.getPrice());

			    orderItemRepository.save(orderItem);
			}
		   
		
		

		    order.setTotalAmount(totalAmount);
	
		    
		    Order savedOrder = orderRepository.save(order);

		    cartItemService.clearCart(cartId);

		    return savedOrder;
		    
		
	}
	
}
