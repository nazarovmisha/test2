package CollectionsHomeWork;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Sportsman> sportsmanSet = new TreeSet<>(new BestAttemptComparator());
        Set<Sportsman> sportsmanSet1 = new TreeSet<>(new WeightComparator());
        sportsmanSet.add(new Sportsman("Ivan", 1.85, 85.5, 0));
        sportsmanSet.add(new Sportsman("Ilya", 2.12, 106.6, 100.23));
        sportsmanSet.add(new Sportsman("Alexey", 1.60, 62.3, 65.5));
        sportsmanSet.add(new Sportsman("Alexandr", 1.90, 81, 103.3));
        sportsmanSet.add(new Sportsman("Denis", 1.99, 126.7, 122.0));
        sportsmanSet.add(new Sportsman("Ryslan", 1.72, 89.3, 85));
        sportsmanSet.add(new Sportsman("Dmitryi", 1.77, 79.9, 99));
        sportsmanSet.add(new Sportsman("Zahar", 1.78, 86.4, 0));

        System.out.println("\n Сортировка по лучшему показателю");
        for (Sportsman sportsman: sportsmanSet){
            System.out.println(sportsman.getBestAttempt());
        }

        sportsmanSet1.addAll(sportsmanSet);
        System.out.println("\n Сортировка по весу");
        for (Sportsman sportsman: sportsmanSet1){
            System.out.println(sportsman.getWeight());
        }

    }
}