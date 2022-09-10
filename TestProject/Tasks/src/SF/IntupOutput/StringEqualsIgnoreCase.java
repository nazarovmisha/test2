package SF.IntupOutput;

public class StringEqualsIgnoreCase {
    public static void main(String[] args) {

        String s1 = "John";
        String s2 = "vasilii ivanov";
        checkName(s1, s2);
    }

    public static void checkName(String firstName, String secondName) {

        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("Change name");
        } else {
            System.out.println("Good name");
            System.out.println("Your name leigth -" + " " + firstName.length());
        }
    }
}