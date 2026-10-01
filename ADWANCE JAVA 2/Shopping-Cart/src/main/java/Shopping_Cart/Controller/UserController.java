package Shopping_Cart.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Shopping_Cart.entity.User;
import Shopping_Cart.service.UserService;

@RestController
public class UserController {
      private final UserService userservice;

	  public UserController(UserService userservice) {
		
		this.userservice = userservice;
	  }
	  
	  @PostMapping("/api/users")
	  public User addUser(@RequestBody User user) {
		  return userservice.addUser(user);
	  }
       
	  
	  @GetMapping("/api/users")
	  public List<User> getAllUsers(){
		  return userservice.getAllUsers();
	  }
	  
	  @GetMapping("/api/users/{id}")
	  public User getUserById(@PathVariable int id) {
		  return userservice.getUserById(id);
	  }
	   
	  
	  @PutMapping("/api/users/{id}")
	  public User updateUser(@PathVariable int id, @RequestBody User user) {
	      return userservice.updateUser(id, user);
	  }
	  
	  @DeleteMapping("/api/users/{id}")
	  public String deleteUser(@PathVariable int id) {
		 return  userservice.deleteUser(id);
	  }
}
