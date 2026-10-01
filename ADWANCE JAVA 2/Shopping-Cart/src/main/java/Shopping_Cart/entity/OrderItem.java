package Shopping_Cart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id ;
	
	 private int quantity;
	 
	 private double price ;
	 
	 @ManyToOne
	 private Order order;
	 
	 @ManyToOne
	 private Product product;

	  public OrderItem() {
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

	 public double getPrice() {
		 return price;
	 }

	 public void setPrice(double d) {
		 this.price = d;
	 }

	 public Order getOrder() {
		 return order;
	 }

	 public void setOrder(Order order) {
		 this.order = order;
	 }

	 public Product getProduct() {
		 return product;
	 }

	 public void setProduct(Product product) {
		 this.product = product;
	 }
	 
	 
}
