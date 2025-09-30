package em;
class IndvalideMarkExceptio extends Exception {
	
	public String toString() {
		return "invalid mark";
	}
}
class CheckMark{
	int mark;
	
	CheckMark(int mark) {
		super();
		this.mark = mark;
	}

	void validDate() throws IndvalideMarkExceptio {
		
				if(mark > 100 && mark < 0) {
					throw new IndvalideMarkExceptio();
				}
				else {
					System.out.println("mark is correct on business logic");
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
