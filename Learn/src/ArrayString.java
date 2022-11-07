//Необходимо список строк перевести в список чисел и произвести их умножение. Решите задачу,
// сначала используя обычный подход, а затем попробуйте написать тот же код на стримах.

public class ArrayString {
    public static void main(String[] args) {
        String[] arrayString = {"2", "4", "6"};
        int[] arrayInt = new int[3];
        int result = 1;

        for (int i = 0; i < arrayString.length; i++) {
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }

        for (int i = 0; i < arrayInt.length; i++) {
            result *= arrayInt[i];
        }
        System.out.println(result);
    }
}