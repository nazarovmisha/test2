import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String text = "Жили-были старик со старухой.\n" +
                "\n" +
                "Вот и говорит старик старухе:\n" +
                "\n" +
                "— Поди-ка, старуха, по коробу поскреби, по сусеку помети, не наскребешь ли муки на колобок.";
        {
            System.out.println("1. Убрать пробелы" +
                    "2.Все заглавными" +
                    "3. Длина строки" +
                    "0.Выход из программы");

            Scanner sc = new Scanner(System.in);
            boolean run = true;
            while (run) {
                int num = sc.nextInt();


                switch (num) {
                    case 1:
                        String replaced = text.replaceAll(" ", "");
                        System.out.println(replaced);
                        break;
                    case 2:
                        System.out.println(text.toUpperCase());
                        break;
                    case 3:
                        System.out.println(text.length());
                        break;
                    case 0:
                       run = false;



                    System.out.println("Exit");
                }


            }

        }
    }
}

