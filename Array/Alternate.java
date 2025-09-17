class Alternate {
    int[] arr = {1, 2, 3, 4, 5, 6};

    void printAlternate() {
        for (int i = 0; i < arr.length; i += 2) { 
            System.out.println("Alternate number: " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Alternate a1 = new Alternate();
        a1.printAlternate();
    }
}
