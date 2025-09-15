class Student2 {
	int fbs_id;
	String s_name;
	double dis_travelled;
	
	static int student_count; 	
	
	static {
	     student_count = 0; 
	}
	Student(){
	    student_count++;
            this.fbs_id = 1;
	    this.s_name = "atul";
	    this.dis_travelled = 9;
	}
	Student(int i,String n,double dt){
            student_count++;
            this.fbs_id = 1;
	    this.s_name = "atul";
	    this.dis_travelled = 9;
	}


	 
	// setters
	setFbsId(int i){
	    this.fbs_id = i;
	}
	setSname(int sn){
	    this.s_name = sn;
	}
	setDistance(int i){
	    this.dis_travelled= dt;
	}
	
	static int setStudentCount(int sc){
	     student_count = sc;
	}
	//getter	
	getFbsId(int i){
	    this.fbs_id = i;
	}
	getSname(int sn){
	    this.s_name = sn;
	}
	getDistance(int i){
	    this.dis_travelled= dt;
	}
	
	//display
	display(){
	    System.out.println("Fbs id is :"+ this.fbs_id);
	     System.out.println("name  is :"+ this.s_name);
	     System.out.println("distance  is :"+ this.dis_travelled);
	     System.out.println("student_count is:"+student_count);
	}	
}
class Test {
	public static void main(String args[]){
	      Student s1 = new Student();
	      Student s2 = new Student (2,"sham",2);
	      s1.display();	
	}
}