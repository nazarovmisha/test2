import java.util.Scanner;

public class summMass {
    public static void main(String[] args) {
        System.out.println("Введите число элементов");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Введите элемент");
            array[i] = scanner.nextInt();
        }
        int summ = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] % 4 == 0) {
                summ += array[i];

            }

        }
        System.out.println(summ);
    }
}
