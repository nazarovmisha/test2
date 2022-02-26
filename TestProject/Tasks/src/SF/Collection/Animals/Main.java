package SF.Collection.Animals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(new Animals("Cat", "Barsik", 5.2));
        animalsList.add(new Animals("Dog", "Baikal", 12.2));
        animalsList.add(new Animals("Mouse", "Minny", 0.5));
        animalsList.add(new Animals("Spider", "Willy", 0.01));
        animalsList.add(new Animals("Horse", "Bolliware", 250.0));
        animalsList.add(new Animals("Duck", "Mikle", 6.2));
        System.out.println(animalsList);

        System.out.println("\n Сортировка по длине клички");

        Collections.sort(animalsList,new ComparatorNameLength());

        System.out.println(animalsList);

        Set<Animals> animalsSet = new TreeSet<>(animalsList);
        System.out.println("\n Сортировка по весу");
        System.out.println(animalsSet);

    }
}
