package com.atul.springAop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
		
	
	@Bean
	 public ShowGreeting getObj() {
		 
		ShowGreeting sg = new ShowGreeting();
		sg.setMsg("Message : hello world");
		sg.setFrom("To : pune");
		
		return sg;
	 }
}
