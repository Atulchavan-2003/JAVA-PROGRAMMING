package Shopping_Cart.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Shopping_Cart.entity.Cart;
import Shopping_Cart.service.CartService;

@RestController
public class CartController {
     
	private final CartService cartService;

	public CartController(CartService cartService) {
		this.cartService = cartService;
	}
	
	@PostMapping("/api/carts")
	public Cart addCart(@RequestBody Cart cart) {
		return cartService.addCart(cart);
	}
	
	@GetMapping("/api/carts")
	public List<Cart> getAllCarts() {
	    return cartService.getAllCarts();
	}
	
	@GetMapping("/api/carts/{id}")
	public Cart getCartById(@PathVariable int id) {
		return cartService.getCartById(id);
	}
	
	@PutMapping("/api/carts/{id}")
	public Cart updateCart(@PathVariable int id , @RequestBody Cart cart) {
		return  cartService.updateCart(id, cart);
	}
	
	@DeleteMapping("/api/carts/{id}")
	public String deleteCartById(@PathVariable int id ) {
		return cartService.deleteCartById(id);
	}
	
	
}
