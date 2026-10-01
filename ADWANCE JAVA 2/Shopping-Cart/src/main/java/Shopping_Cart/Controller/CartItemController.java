package Shopping_Cart.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Shopping_Cart.entity.CartItem;
import Shopping_Cart.service.CartItemService;

@RestController
public class CartItemController {
      
	  private final CartItemService cartItemService;

	  public CartItemController(CartItemService cartItemService) {
		
		this.cartItemService = cartItemService;
	  }
	  
	  @PostMapping("/api/cart-items")
	  public CartItem addCartItem(@RequestBody CartItem cartItem) {
		  
		  return cartItemService.addCartItem(cartItem);
	  }
	  
	  @GetMapping("/api/cart-items")
	  public List<CartItem> getAllCartItems() {
	      return cartItemService.getAllCartItems();
	  }
	  
	  @GetMapping("/api/cart-items/{id}") 
	  public CartItem getCartItemById(@PathVariable int id ) {
		   return cartItemService.getCartItemById(id);
	  }
	  
	  @GetMapping("/api/cart-items/cart/{cartId}")
	  public List<CartItem> getCartItemsByCartId(@PathVariable int cartId) {
	      return cartItemService.getCartItemsByCartId(cartId);
	  }
	  
	  @DeleteMapping("/api/cart-items/{id}")
	  public String deleteCartItemById(@PathVariable int id) {
		  return cartItemService.deleteCartItemById(id);
	  }
	  
	  @PutMapping("/api/cart-items/{id}")
	  public CartItem updateCartItem(@PathVariable int id, @RequestBody CartItem cartItem) {
	      return cartItemService.updateCartItem(id, cartItem);
	  }
	  
	  @GetMapping("/api/cart-items/total/{cartId}")
	  public double calculateCartTotal(@PathVariable int cartId) {
		  return cartItemService.calculateCartTotal(cartId);
	  }
	 
	  
	  @PostMapping("/api/cart-items/add")
	  public CartItem addProductToCart(
	          @RequestParam int cartId,
	          @RequestParam int productId,
	          @RequestParam int quantity) {

	      return cartItemService.addProductToCart(cartId, productId, quantity);
	  }
	  
	  
}
