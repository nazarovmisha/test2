import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DrygestvennieChisla {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        String st1 = scanner.nextLine();
        System.out.println("Ведите второе число");
        String str2 = scanner.nextLine();
        char array1[] = st1.toCharArray();
        char array2[] = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        String s1 = Arrays.toString(array1);
        String s2 = Arrays.toString(array2);
        if (s1.equals(s2))
            System.out.println("Числа дружественные");
        else System.out.println("Числа не дружественные");

    }
}


