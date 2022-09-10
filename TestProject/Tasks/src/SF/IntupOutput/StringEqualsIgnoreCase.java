package SF.IntupOutput;

public class StringEqualsIgnoreCase {
    public static void main(String[] args) {

        String s1 = "Vasilii Ivanov";
        String s2 = "vasilii ivanov";

        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Viberite drygoe imya");
        } else {
            System.out.println("Otlichnoe imya");

        }
    }
}