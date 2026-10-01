package com.atul.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	 @Column(name = "city")
    String address;
	 
	 public Address() {   // VERY IMPORTANT — public हवा
	   }
	public Address(String adr) {
		this.address =adr;
	}
	
}
