class reversString {
    public static void main(String args[]) {
    	
        String str = "this is String fbs";
        System.out.println("Original: " + str);

        String str1[] = str.split(" ");

        System.out.println("Reversed");
        
        for (int i = str1.length - 1; i >= 0; i--) {
       
            	System.out.print(str1[i] + " ");
           
        }
    }
}
