package com.atul.SpringExeption;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
		@GetMapping("/student/{roll}")
		public String handelError(@PathVariable int roll) throws Exception {
			if(roll == 10) {
				throw new Exception();
			}else {
				return "All ok";
			}
		}
}
