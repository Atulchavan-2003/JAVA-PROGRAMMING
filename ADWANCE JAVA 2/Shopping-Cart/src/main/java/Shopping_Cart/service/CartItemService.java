package Shopping_Cart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Shopping_Cart.entity.Cart;
import Shopping_Cart.entity.CartItem;
import Shopping_Cart.entity.Product;
import Shopping_Cart.repository.CartItemRepository;
import Shopping_Cart.repository.CartRepository;
import Shopping_Cart.repository.ProductRepository;

@Service
public class CartItemService {
     private final CartItemRepository cartItemRepository;
     
     private final CartRepository cartRepository;
     private final ProductRepository productRepository;
     
     public CartItemService(
    	        CartItemRepository cartItemRepository,
    	        CartRepository cartRepository,
    	        ProductRepository productRepository) {

    	    this.cartItemRepository = cartItemRepository;
    	    this.cartRepository = cartRepository;
    	    this.productRepository = productRepository;
    	}
     
     public CartItem addCartItem(CartItem cartItem) {
    	     
    	 	return cartItemRepository.save(cartItem);  
    	
     }
     
     public List<CartItem> getAllCartItems() {
    	    return cartItemRepository.findAll();
    	}
     
     public CartItem getCartItemById(int id) {
    	 
    	 	return cartItemRepository.findById(id).orElse(null);
    	 	
     }
     
     public List<CartItem> getCartItemsByCartId(int cartId) {
    	    return cartItemRepository.findByCart_Id(cartId);
    	}
     
     public String deleteCartItemById(int id ) {
    	      cartItemRepository.deleteById(id);
    	 	return "delete CartItem Successfully";
     }
     
     public CartItem updateCartItem(int id, CartItem cartItem) {
    	    cartItem.setId(id);
    	    return cartItemRepository.save(cartItem);
    	}
     
     public CartItem addProductToCart(int cartId, int productId, int quantity) {

    	    CartItem existingItem =
    	    		cartItemRepository.findByCart_IdAndProduct_Id(cartId, productId);

    	    if (existingItem != null) {
    	        existingItem.setQuantity(existingItem.getQuantity() + quantity);
    	        return cartItemRepository.save(existingItem);
    	    }

    	    Cart cart = cartRepository.findById(cartId)
    	            .orElseThrow(() -> new RuntimeException("Cart not found"));

    	    Product product = productRepository.findById(productId)
    	            .orElseThrow(() -> new RuntimeException("Product not found"));
    	   
    	    if (quantity > product.getStock()) {
    	        throw new RuntimeException("Not enough stock");
    	    }
    	    
    	    CartItem cartItem = new CartItem();

    	    cartItem.setCart(cart);
    	    cartItem.setProduct(product);
    	    cartItem.setQuantity(quantity);

    	    return cartItemRepository.save(cartItem);
    	}
     
     
     public double calculateCartTotal(int cartId) {

    	    List<CartItem> cartItems = cartItemRepository.findAll();

    	    double total = 0;

    	    for (CartItem item : cartItems) {

    	        if (item.getCart().getId() == cartId) {
    	            total = total + (item.getProduct().getPrice() * item.getQuantity());
    	        }
    	    }

    	    return total;
    	} 
     
     public void clearCart(int cartId) {
    	    List<CartItem> cartItems = cartItemRepository.findByCart_Id(cartId);

    	    cartItemRepository.deleteAll(cartItems);
    	}
     
}
