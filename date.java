import java.util.Scanner;

class date{
       int day,month,year;
	String dow;
	
	// default constructor 

        date(){

           System.out.println("Default Constructor ");
	   this.day=7;
	   this.month=1;
	   this.year = 2023;
	   this.dow = "sunday";

	}      

        // parameterize constructor 
        date(int d,int m,int y,String dow){

            System.out.println("parameterize Constructor ");

	    this.day = d;
            this.month = m;
            this.year = y;
            this.dow = dow;
	}

         date(String dow,int d,int m,int y){

            System.out.println("sequence of data type of parameter Constructor ");

	    this.day = d;
            this.month = m;
            this.year = y;
            this.dow = dow;
	}

	void setday(int a){
	      this.day=a;
	} // setday end here 

        void setmonth(int a){
	      this.month=a;
	}// month end here 

	void setyear(int a){
	      this.year=a;
	} 

	void setdow(String str){
	     dow = str;
	} // setday end here 

         //getter
	int getday(){
            return this.day;
        }
	 int getmonth(){
            return this.month;
        }
	 int getyear(){
            return this.year;
        }
        void display(){

            System.out.println(this.day);
 	    System.out.println(this.month);
            System.out.println(this.year);
            System.out.println(this.dow);
        }
       	

}//date class end here 

class test {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		date d1 = new date();

  		System.out.println("Enter the day :");
		int d = sc.nextInt();
		System.out.println("Enter the month :");
		int m = sc.nextInt();
		System.out.println("Enter the day :");
		int y = sc.nextInt();
                System.out.println("Enter the dow :");
		String str = sc.nextLine();

                date d2 = new date(d,m,y,str);
                
                d1.setday(3);
		d1.setmonth(8);
		d1.setyear(2003);
		d1.setdow("wed");

                d1.display();
               
                if(d1.getday() > d2.getday()){
		     System.out.println("d1 is younger"+d1.getday()+"/"+"/"+d1.getmonth()+"/"+d1.getyear());
		}
		else
		{
		      System.out.println("d2 is younger"+d2.getday()+"/"+"/"+d2.getmonth()+"/"+d2.getyear());
		}
		
	}
}