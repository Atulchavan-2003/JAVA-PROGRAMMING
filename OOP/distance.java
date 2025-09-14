class Distance {
    int feet;
    int inch;

    // Setters
    void setFeet(int f) {
        this.feet = f;
    }
    void setInch(int i) {
        this.inch = i;
    }

    // Getters
    int getFeet() {
        return feet;
    }
    int getInch() {
        return inch;
    }

    // Display Method
    void display() {
        System.out.println("Feet: " + feet);
        System.out.println("Inch: " + inch);
    }
} // Distance class end here

class test {
    public static void main(String args[]) {
        Distance d1 = new Distance();

        // Set values
        d1.setFeet(5);
        d1.setInch(8);

        // Display using method
        d1.display();

        // Display using getters
        System.out.println("Feet   : " + d1.getFeet());
        System.out.println("Inch   : " + d1.getInch());
    }
}
