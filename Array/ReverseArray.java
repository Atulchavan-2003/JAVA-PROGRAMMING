class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Reversed Array: {");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("}");
    }
}
