package com.atul.coinCollection;


import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class coinManagement {
	   int tcid;
	    String tcountry;
	    int tdenomination;
	    int tyom;
	    double tcurrentValue;
	    LocalDate taqDate;
	    
	static int count=0;
	Map<Integer,Coin> list = new HashMap<Integer,Coin>();
	
	
	private static coinManagement ref = new coinManagement();
	
	private coinManagement() {
		super();
		// TODO Auto-generated constructor stub
	}
   public void SearchData(String country) {
//	      if(coins.containsKey(id)) {
//	    	  Coin c = coins.get(id);
//	    	  
//	    	  if (c.getCountry().equalsIgnoreCase(country)) {
//	              System.out.println("coin Found : " + c);
//	          } else {
//	              System.out.println("country mismatched for ID: " + id);
//	          }
//	      }
//	      else{
//	    	  System.out.println("not found id : "+id+" country :"+country);
//	      }
	 
	   		List<Coin> slist = list.values().stream().filter(c -> c.getCountry()!=null && c.getCountry().equalsIgnoreCase(country)).collect(Collectors.toList());
	   		
	   		if(slist.isEmpty()) {
	   			System.out.println("list is Empty");
	   		}
	   		for (Coin coin : slist) {
				System.out.println(coin);
			}
   }
   
   public void delete() {
	   
   }
   public void addDataIntoDatabase() {
	   
	    Scanner sc = new Scanner(System.in);
	    	

	    System.out.println("Enter Coin ID:");
	    int tcid = sc.nextInt();

	    System.out.println("Enter Country:");
	    String tcountry = sc.next();

	    System.out.println("Enter Denomination:");
	    int tdenomination = sc.nextInt();

	    System.out.println("Enter Year Of Minting:");
	    int tyom = sc.nextInt();

	    System.out.println("Enter Current Value:");
	    double tcurrentValue = sc.nextDouble();

	    System.out.println("Enter Acquire Date yyyy-mm-dd :");
	    LocalDate taqDate = LocalDate.parse(sc.next());
	   
	    
		 list.put(tcid,new Coin(tcid,tcountry,tdenomination,tyom,tcurrentValue,taqDate));
		 try {
			Connection con = Connectivity.getObject().getConnecton();
			 String query = "insert into coins (coinId ,country, yearOfMinting, currentValue, denomination, acquireDate ) values (?,?,?,?,?,?)";
			 
			 PreparedStatement pstmt = con.prepareStatement(query);

			 pstmt.setInt(1, tcid);
			 pstmt.setString(2, tcountry);
			 pstmt.setInt(3, tdenomination);
			 pstmt.setInt(4, tyom);
			 pstmt.setDouble(5, tcurrentValue);
			 pstmt.setDate(6, java.sql.Date.valueOf(taqDate));
			 
			 if(pstmt.executeUpdate()>0) {
				 System.out.println("data insert Sucusessfully");
			 }
			 else{
				 System.out.println("data is not add into data base");
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	    
   }
   
   public void update(int id) {
	  
	   if(list.containsKey(id)) {
		   
		  Coin c = list.get(id);
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println(" What do you want to update"
		  		+ " (country, yearOfMinting, currentValue,"
		  		+ " denomination, acquireDate)");
		  
		  String choise = sc.next();
		  
		  
		 switch(choise) {
		 	case "country":{
		 		System.out.println("Enter the country name what do you want");
		 		
		 		 String newCountry = sc.next();
		 		 
		 		 c.setCountry(newCountry);
		 		 
		 		 String query ="update coins set country = ? where coinId = ? ";
		 		 
		 		
				if(UpdateClass.executeUpdatequery(query,newCountry,id)>0) {
					System.out.println("country update sucusessfully");
				}
				else {
					System.out.println("country is not update");
				}
		 		
		 		break;
		 		
		 	}
		 	case "yearOfMinting" : {
		 		
		 	}
		 	case "currentValue" :{
		 		
		 	}
		 	case "denomination":{
		 		
		 	}
		 	case "acquireDate" :{
		 		
		 	}
		 }
		  
		  
	   }else {
		   System.out.println("id is misMatch :"+ id);
	   }
   }

	public void addReadFile() {
		File file = new File("coins.txt");
		try {
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()) {
				String line = sc.nextLine();
				
				String[] str = line.split(" ");
				
				 tcid = Integer.parseInt(str[0]);
				 tcountry = str[1];
				 tdenomination = Integer.parseInt(str[2]);
				 tyom =Integer.parseInt(str[3]);
				 tcurrentValue = Double.parseDouble(str[4]);
				 taqDate = LocalDate.parse(str[5]);
				
				 list.put(tcid,new Coin(tcid,tcountry,tdenomination,tyom,tcurrentValue,taqDate));
				 count++;
				 System.out.println(" data Add succussesfully!"+tcid +" "+tcountry+" "+tdenomination+" "+tyom+" "+tcurrentValue+" "+taqDate);

			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 
	
	public void addDatabase()  {
			
			String query = "select * from coins";
			Connection con = Connectivity.getObject().getConnecton();
			
			try {
				Statement stmt = con.createStatement();
				
				ResultSet rs = stmt.executeQuery(query);
				
				while(rs.next()) {
					tcid = rs.getInt(1);
					tcountry = rs.getString(2);
					tdenomination = rs.getInt(3);
					tyom = rs.getInt(4);
					tcurrentValue = rs.getDouble(5);
					taqDate = rs.getDate(6).toLocalDate();
					list.put(tcid,new Coin(tcid,tcountry,tdenomination,tyom,tcurrentValue,taqDate));
					count++;
					System.out.println("data Add succussesfully!"+tcid +" "+tcountry+" "+tdenomination+" "+tyom+" "+tcurrentValue+" "+taqDate);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	void display() {
		System.out.println(list);
	}
	

	int getCount(){
		return count;
	}
	public static coinManagement getObject() {
		return ref;
	}
			
}
	
