package SF.IntupOutput;

public class StringEqualsIgnoreCase {
    public static void main(String[] args) {

        String s2 = "John";
        String s1 = "Alexy Laiho Second";
        checkName(s1, s2);
    }

    public static void checkName(String firstName, String secondName) {

        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("Change name");
        } else {
            System.out.println("Good name");
            System.out.println(firstName +  " length -" + " " + firstName.length());
            System.out.println("Name length without spaces" + " " + firstName.replaceAll(" ", "").length());
        }
    }
}