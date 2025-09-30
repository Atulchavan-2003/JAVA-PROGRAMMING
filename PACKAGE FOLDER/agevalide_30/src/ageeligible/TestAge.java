package ageeligible;
class VoterAgeException extends Exception {
	
	public String toString(){
		return "not eligible for vote ";
	}
}
class Voter{
    int age;
    
	public Voter(int age) {
		this.age=age;
	}
	void validate() {
		try {
			if(this.age < 18) {
				throw new VoterAgeException();
			}
			else {
				System.out.println("Eligible for voting");
			}
		}
		catch(VoterAgeException ve) {
			System.out.println(ve);
		}
		
	}
}
public class TestAge {
     public static void main() {
    	 Voter v1 = new Voter(20);
    	 v1.validate();
     }
}
