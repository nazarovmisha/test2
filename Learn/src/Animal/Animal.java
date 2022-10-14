package Animal;

import java.util.*;

//Написать класс домашних животных с полями animalBreed, name, weight, реализовать сортировку по значению weight.
//В отдельном классе реализовать сортировку по длине клички.
public class Animal implements Comparable<Animal> {
    private String animalBreed;
    private String name;
    private double weight;

    public Animal(String animalBreed, String name, double weight) {
        this.animalBreed = animalBreed;
        this.name = name;
        this.weight = weight;
    }

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Cat", "Barsik", 5.8));
        animalList.add(new Animal("Dog", "Rex", 22));
        animalList.add(new Animal("Mouse", "Rudolphe", 0.12));
        animalList.add(new Animal("Horse", "Bolliware", 250.3));
        animalList.add(new Animal("Elephant", "Little", 8952));
        animalList.add(new Animal("Crocodile", "Alex", 72.12));
        animalList.add(new Animal("Pig", "Hrew", 9.4));
        animalList.add(new Animal("Spider", "William", 0.06));
        System.out.println(animalList);
        System.out.println("\nСортировка по длине клички:");
        Collections.sort(animalList, new ComparatorNameLength());
        System.out.println(animalList);
        Set<Animal> petSet = new TreeSet<>(animalList);
        System.out.println("\nСортировка по весу:");
        System.out.println(petSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalBreed, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(animalBreed, animal.animalBreed) && Objects.equals(name, animal.name);
    }

    @Override
    public int compareTo(Animal o) {
        return (int) (this.weight - o.weight);
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
               "animalBreed='" + animalBreed + '\'' +
               ", name='" + name + '\'' +
               ", weight=" + weight +
               '}';
    }
}
