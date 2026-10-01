package Shopping_Cart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Shopping_Cart.repository.ProductRepository;

import Shopping_Cart.entity.Product;

@Service
public class ProductService {
	 private final ProductRepository productRepository;

	 public ProductService(ProductRepository productRepository) {
			this.productRepository = productRepository;
	
	 }
	 
	 public List<Product> getAllProduct(){
		 
		 return productRepository.findAll();
	 }

	 public Product addProduct(Product product) {
		
		 return productRepository.save(product); 
		 
	 }

	 public Product updateProduct(int id, Product product) {
		  product.setId(id);
		 return productRepository.save(product);
	 }

	 public String deleteProduct(int id) {
	
	    productRepository.deleteById(id);
	    return " product delete successfully";
	 }
	 
 	 
}
