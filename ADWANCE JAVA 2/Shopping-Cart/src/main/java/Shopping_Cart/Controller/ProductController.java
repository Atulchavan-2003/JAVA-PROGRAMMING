package Shopping_Cart.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Shopping_Cart.entity.Product;
import Shopping_Cart.service.ProductService;
@RestController
public class ProductController {
      
	private final ProductService productService;

	public ProductController(ProductService productService) {
		
		this.productService = productService;
	}
	
	@GetMapping("/api/products")
	public List<Product> getAllProducts(){
		
		return productService.getAllProduct();
		
	}
	
	@PostMapping("/api/products")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@PutMapping("/api/products/{id}")
	public Product updateProduct(@PathVariable int id , @RequestBody Product product) {
		return productService.updateProduct(id,product);
	}
	
	@DeleteMapping("/api/products/{id}")
	public String deleteProduct(@PathVariable int id) {
		return productService.deleteProduct(id); 
	}
}
