//        Напишите программу,которая создает лист и заполняет его последовательно числами в порядке от 0до 99.
//        Затем,не создавая новый лист,сделайте так,чтобы эти же числа располагались в обратом порядке
//        — от 99до 0(не используя Collections.sort()).
import java.util.LinkedList;

public class Coll {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        for (int i = 0, j = 99; i < 50 && j > 50; i++, j--) {
            int start = list.get(i);
            int finish = list.get(j);
            list.set(j, start);
            list.set(i, finish);
        }
        System.out.println(list);
    }
}