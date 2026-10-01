package Shopping_Cart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Shopping_Cart.entity.Cart;
import Shopping_Cart.repository.CartRepository;

@Service
public class CartService {
	private final CartRepository cartRepository;

	public CartService(CartRepository cartRepository) {
		
		this.cartRepository = cartRepository;
	}
	
	public Cart addCart(Cart cart) {
		return cartRepository.save(cart);
	}
	
	public List<Cart> getAllCarts() {
	    return cartRepository.findAll();
	}
	
	public Cart getCartById(int id) {
	    return cartRepository.findById(id).orElse(null);
	}
	
	public Cart updateCart(int id, Cart cart) {
	    cart.setId(id);
	    return cartRepository.save(cart);
	}
	
	public String deleteCartById(int id) {
	    cartRepository.deleteById(id);
	    return "Cart deleted successfully";
	}
}
