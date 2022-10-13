/* Исключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
*/
public class StringEx {
    public static void main(String[] args) {
        try {
            String s = null;
            String s2 = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}