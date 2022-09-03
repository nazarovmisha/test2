package SF.IntupOutput;

public class Troll {
    public static void main(String[] args) {
        String input ="No offense but,\nYour writing is among the worst I've ever read";
        disemvowel(input);
    }
    public static String disemvowel(String str) {
    str = str.replaceAll("[euoiaEUOIA]","");
        return str;

    }
}
