package com.spring.day32_SpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller  {
	
	@Autowired 
	UserRepo repo;
	
	
	@GetMapping("/hello")
	public String showGreeting(){
		return "hello Boot";
	}
	

    @GetMapping("/hello2")
    public Student Greeting() {

        Student s = new Student();
        s.setId(101);
        s.setName("Atul Chavan");
        s.setAge(22);

        return s; 
    }
    

    
    @PostMapping("/student1")
    public String storeRecord(@RequestParam int studentId, @RequestParam String studentName, @RequestParam int studentAge) {

        Student s = new Student();
        
        s.setId(studentId);
        s.setName(studentName);
        s.setAge(studentAge);

        repo.save(s);
        return "Record Added";
    }
    @GetMapping("/student/{id}")
    public Student getallRecord (@PathVariable int id){
    	
    	
    		return repo.getOne(id);
		
//    		List<Student> list = repo.findAll();
//    		for (Student student: list) {
//    			  
//    	        int id = student.getId();
//    	       String name = student.getName();
//    	        int age = student.getAge();
//    			
//    			Student s = new Student(id,name,age);
//    			
//    			System.out.println(s);
//    			   
//			}
//			return list;
    		
    }
    
    

	    
}













