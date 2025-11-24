package p1;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		List<Student> allStudent = new ArrayList();
		allStudent.add(new Student(1,"soham",80,"m"));
		allStudent.add(new Student(2,"gopal",50,"m"));
		allStudent.add(new Student(3,"sandeep",88,"m"));
		allStudent.add(new Student(4,"atul",91,"m"));
		
		//Iteration
		// foEach()
		
		allStudent.stream().forEach();
	}
}

