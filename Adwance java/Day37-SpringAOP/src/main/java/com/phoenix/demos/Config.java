package com.phoenix.demos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Student stud()
	{
		return new Student();		
	}
}
