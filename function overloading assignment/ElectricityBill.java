class ElectricityBill{
   int b_id;
   String name;
   int unit;
   static double rate;
	static {
	    rate = 10;	
	}

        ElectricityBill(){
	     this.b_id = 1;
	     this.name ="atul";
	     this.unit = 15;
	}
	ElectricityBill(int i,String n, int u){
		this.b_id = i;
		this.name = n;
		this.unit = u;
	}

        //setter
	
        void setBid(int i){
	    this.b_id= i;
	}
	void setName(String n ){
	    this.name = n;
	}
	void setUnit(int u){
	    this.unit = u;
	}
	static void setRate(double r){
	      rate = r;
	}

	//getters
	 int getBid(){
	    return this.b_id;
	}
	String getName(){
	    return this.name;
	}
	int getUnit(int u){
	    return this.unit;
	}
	double getRate(){
	    return rate;
	}
        void calculater(){
            System.out.println("total rate is "+ rate * this.unit);
	}
     	
	void display(){
		System.out.println(" bill id :"+ this.b_id);
		System.out.println(" bill name :"+ this.name);
		System.out.println(" bill unit :"+ this.unit);
		System.out.println(" bill rate :"+ rate);

	}

}
class Test {
     	public static void main (String args[]){
		
		 ElectricityBill e1 = new ElectricityBill();
        	 e1.display();
        	 e1.calculater();

      		 ElectricityBill.setRate(30.0);

      	 	 ElectricityBill e2 = new ElectricityBill(2, "Ravi", 30);
        	 e2.display();
        	 e2.calculater();		
       		

	}

}