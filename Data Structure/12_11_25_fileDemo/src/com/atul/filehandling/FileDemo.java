package com.atul.filehandling;

import java.io.*;

public class FileDemo {


	
	    public static void main(String[] args) throws IOException {
	        
	        // Step 1: Read from a file
	        FileReader fr = new FileReader("F:\\ALL PROGRAMMING LANGUAGE\\JAVA PROGRAMMING\\Data Structure\\12_nove\\Data.txt");
	        BufferedReader br = new BufferedReader(fr);

	        String line;
	        System.out.println("Reading from Data.txt file:\n");
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }

	       
	        br.close();   

	        FileWriter fw = new FileWriter("F:\\ALL PROGRAMMING LANGUAGE\\JAVA PROGRAMMING\\Data Structure\\12_nove\\Data.txt");
	        fw.write("Hello, this is written using FileWriter in Java!");
	        fw.write("\nThis is the second line.");
	        fw.close();

	        System.out.println("\nData written successfully to output.txt!");
	    }

	public static void mainw(String[] args) {
		
			try {
				FileOutputStream fos = new FileOutputStream("F:\\ALL PROGRAMMING LANGUAGE\\JAVA PROGRAMMING\\Data Structure\\12_nove\\Data.txt");
				DataOutputStream dos = new DataOutputStream(fos);
			    ObjectOutputStream oos = new ObjectOutputStream(dos);
				oos.writeObject(new Student (10,"atul",26565));	
				System.out.println("written successfully ");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}
	public static void mainr(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("F:\\ALL PROGRAMMING LANGUAGE\\JAVA PROGRAMMING\\Data Structure\\12_nove\\Data.txt");
			DataInputStream dis = new DataInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(dis);
			Student s1 = (Student)ois.readObject();
			System.out.println(s1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
