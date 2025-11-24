package p1;

public class Student {
	int rollNo;
	String studName;
	float marks;
	String gender;
	
	
	public Student(int rollNo, String studName, float marks, String gender) {
		this.rollNo = rollNo;
		this.studName = studName;
		this.marks = marks;
		this.gender = gender;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
