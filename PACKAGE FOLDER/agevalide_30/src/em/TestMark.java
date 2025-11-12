package em;

class IndvalideMarkExceptio extends Exception {
	
	public String toString() {
		return "invalid mark";
	}
} //exeption class end here 

class CheckMark{
	int marks;
	
	CheckMark(int mark) {
		super();
		this.marks = mark;
	}

	void validDate() throws IndvalideMarkExceptio {
		
				if(marks > 100 && marks < 0) {
					throw new IndvalideMarkExceptio();
				}
				else {
					if (marks >= 75){
					 	System.out.println("Distinction");
					 }
					 else if (marks >= 65){
					 	System.out.println("First class");
					 }
					 else if (marks >= 55){
					 	System.out.println("second class");
					 }
					 else if (marks >= 40){
					 	System.out.println("Pass class");
					 }
					 else if (marks <= 40 ){
					 	System.out.println("Fail");
					 }
				}
		
	}
}
public class TestMark {
	public static void main(String[] args) {
		CheckMark cm = new CheckMark(40);
		try {
			cm.validDate();
		}
		catch(IndvalideMarkExceptio im) {
			System.out.println(im);
		}
		
	}
}
