public class stringbuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("atul");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'A');
        System.out.println(sb);

        sb.insert(0, 'a');
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);

        System.out.println(sb.reverse());
    }
}

