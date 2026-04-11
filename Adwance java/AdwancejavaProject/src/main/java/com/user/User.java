package com.user;

public class User {
	    int id;
		
		String userName ;
		String password;
		String email;
		String mobileNO;
		
		public User(String userName, String password, String email, String mobileNO) {
			super();
			this.userName = userName;
			this.password = password;
			this.email = email;
			this.mobileNO = mobileNO;
		}
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobileNO() {
			return mobileNO;
		}
		public void setMobileNO(String mobileNO) {
			this.mobileNO = mobileNO;
		}
	
		
}
