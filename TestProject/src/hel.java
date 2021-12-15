public class hel {
    public static String string = "helloworld";

    public static void main(String[] args) {
        // code here...
        System.out.println(string);

        while (string.length() > 2) {
            string = string.substring(1, string.length() - 1);
            System.out.println(string);
        }
    }
}
