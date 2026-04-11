package com.example.NewApp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="userSpring")
public class User {
	
		@Id
	 	@Column(name ="name")
		String name ;
		@Column(name="password")
		String password;
		
		public User(String name, String password) {
			super();
			this.name = name;
			this.password = password;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
}
