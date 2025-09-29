
class Student2 {
	int fbs_id;
	String s_name;
	double dis_travelled;
	
	static int student_count; 	
	
	static {
	     student_count = 0; 
	}
	
	Student2(){
	    student_count++;
        this.fbs_id = 0;
	    this.s_name = "not given";
	    this.dis_travelled = 0;
	}
	Student2(int i,String n,double dt){
            student_count++;
        this.fbs_id = 1;
	    this.s_name = "atul";
	    this.dis_travelled = 9;
	}


	 
	// setters
	void setFbsId(int i){
	    this.fbs_id = i;
	}
	void setSname(String  sn){
	    this.s_name = sn;
	}
	void setDistance(int dt){
	    this.dis_travelled= dt;
	}
	
	static void  setStudentCount(int sc){
	     student_count = sc;
	}
	//getter	
	int getFbsId(int i){
	    return this.fbs_id;
	}
	String getSname(){
	    return this.s_name;
	}
    double getDistance(){
	    return this.dis_travelled;
	}
	
	//display
	void display(){
	     System.out.println("Fbs id is :"+ this.fbs_id);
	     System.out.println("name  is :"+ this.s_name);
	     System.out.println("distance  is :"+ this.dis_travelled);
	     System.out.println("student_count is:"+student_count);
	}	
}
class PlaceStudent extends Student2 {
	String companyName;
	String desgn;
	
	PlaceStudent() {
	       this.companyName = "not given ";
	       this.desgn = "not given";
	}

	PlaceStudent(int fbsId, String s_name,double dis_travelled,String companyName, String desgn) {
		super(fbsId,s_name,dis_travelled);
		this.companyName = companyName;
		this.desgn = desgn;
	}

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	String getDesgn() {
		return desgn;
	}

	void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	void display(){
		super.display();
		System.out.println("companyName is :"+this.companyName);
		System.out.println("designation is :"+this.desgn);
	}
}
class TestStudent {
	public static void main(String args[]){
	     Student2 s2 = new Student2();
	     s2.display();
	     
	     s2 = new PlaceStudent(1,"atul",6,"xyz","psq");
	     s2.display();
	}
}
