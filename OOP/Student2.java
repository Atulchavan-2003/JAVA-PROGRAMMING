class Student {
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
            this.fbs_id = i;
	    this.s_name = n;
	    this.dis_travelled =dt;
	}


	 
	// setters
	void setFbsId(int i){
	    this.fbs_id = i;
	}
	void setSname(String sn){
	    this.s_name = sn;
	}
	void setDistance(double dt){
	    this.dis_travelled= dt;
	}
	
		//getter	
	int getFbsId(){
	    return this.fbs_id;
	}
	String getSname(){
	    return this.s_name;
	}
	double getDistance(){
	    return this.dis_travelled;
	}
	static int getStudentCount(){
	    return student_count;
	}

	//display
	void display(){
	    System.out.println("Fbs id is :"+ this.fbs_id);
	     System.out.println("name  is :"+ this.s_name);
	     System.out.println("distance  is :"+ this.dis_travelled);
	     System.out.println("student_count is:"+student_count);
	}	
}
class Test {
	public static void main(String args[]){
	      Student s1 = new Student();
	      s1.display();
	      Student s2 = new Student (2,"sham",2);
	      s2.display();
	      System.out.println("Student count is :" + Student.getStudentCount());		
	}
}