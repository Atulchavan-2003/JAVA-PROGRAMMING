package Shopping_Cart.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CartItem {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;
	  
	  private int quantity;
	  
	  @ManyToOne
	  private Cart cart;
	  
	  @ManyToOne
	  private Product product;

	  public CartItem() {
	  }
	  
	  public int getId() {
		  return id;
	  }

	  public void setId(int id) {
		  this.id = id;
	  }

	  public int getQuantity() {
		  return quantity;
	  }

	  public void setQuantity(int quantity) {
		  this.quantity = quantity;
	  }

	  public Cart getCart() {
		  return cart;
	  }

	  public void setCart(Cart cart) {
		  this.cart = cart;
	  }

	  public Product getProduct() {
		  return product;
	  }

	  public void setProduct(Product product) {
		  this.product = product;
	  }
	  
	  
}
