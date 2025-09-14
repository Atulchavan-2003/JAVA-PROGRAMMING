class date{
       int day,month,year;
	String dow;
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

}//date class end here 

class test {
	public static void main(String args[]){
		
		date d1 = new date();                
                d1.setday(3);
		d1.setmonth(8);
		d1.setyear(2003);
		d1.setdow("wed");
              
		System.out.println(d1.day);
 		System.out.println(d1.month);
		System.out.println(d1.year);

		System.out.println(d1.dow);

	}
}