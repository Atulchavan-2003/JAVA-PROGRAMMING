class Student {
    int rollno;
    String name;
    double marks;

    // Setters
    void setRoll(int r) {
        this.rollno = r;
    }
    void setName(String n) {
        this.name = n;
    }
    void setMarks(double m) {
        marks = m;
    }

    // Getters
    int getRoll() {
        return rollno;
    }
    String getName() {
        return name;
    }
    double getMarks() {
        return marks;
    }

    // Display Method
    void display() {
        System.out.println("Roll: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
} // Student class end here

class test {
    public static void main(String args[]) {
        Student s1 = new Student();
                // Using getters
        System.out.println("Roll : " + s1.getRoll());
        System.out.println("Name : " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());

        s1.setRoll(1);
        s1.setName("Atul");
        s1.setMarks(77);

        // Using display
        s1.display();

    }
}
