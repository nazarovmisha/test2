package SF.IntupOutput;

public class StringEqualsIgnoreCase {
    public static void main(String[] args) {

        String s1 = "Vasilii Ivanov";
        String s2 = "vasilii ivanov";
        checkName(s1, s2);
    }

    public static void checkName(String firstName, String secondName) {

        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("Viberite drygoe imya");
        } else {
            System.out.println("Otlichnoe imya");
        }
    }
}