package WrapperClasses;

public class Test {

	public static void main(String[] args) {
	 
//		System.out.println(Integer.toBinaryString(10));
//		System.out.println(Integer.max(10, 2));
//		System.out.println(Integer.min(10, 2));
//		String str = "56";
//		Integer i = Integer.valueOf(str);
//		System.out.println(i);
		
		Student x = new Student();
		x.id = 10;
		fun(x);
		
	}

	   static void fun(Student x) {
		Student st = new Student();
		st.id = 2;
		x = st;
	 }

}
class Student{
	int id;
	
}
