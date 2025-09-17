class SecondMax {
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 2, 9, 1};

        int max = arr[0];
        int smax = arr[0]; 

        // Find max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Find second max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] < max) {
                smax = arr[i];
            }
        }

        System.out.println("Maximum element     : " + max);
        System.out.println("Second maximum elem : " + smax);
    }
}
