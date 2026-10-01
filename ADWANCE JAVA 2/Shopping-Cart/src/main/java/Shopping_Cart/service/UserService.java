package Shopping_Cart.service;



import java.util.List;

import org.springframework.stereotype.Service;

import Shopping_Cart.entity.User;
import Shopping_Cart.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
    
    public List<User> getAllUsers(){
    	    return userRepository.findAll();
    }
    
    public User getUserById(int id) {
    	     return userRepository.findById(id).orElse(null);
    }
    
    public User updateUser(int id , User user) {
    			user.setId(id);
    			return userRepository.save(user);
    }
    
    public String deleteUser(int id ) {
    	    userRepository.deleteById(id);
    		return "User deleted succesfully ";
    }
}
