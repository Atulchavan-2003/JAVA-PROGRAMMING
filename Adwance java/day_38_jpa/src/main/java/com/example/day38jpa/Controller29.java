package com.example.day38jpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller29 {
	
	 @GetMapping("/service/{id}")
	    public Student getsingleStudent(@PathVariable int id){
		 
		 String url = "http://localhost:8080/student/" + id;

		    RestTemplate template = new RestTemplate();
		    Student obj = template.getForEntity(url, Student.class).getBody();
		    return obj;
		 
	 	}
}
