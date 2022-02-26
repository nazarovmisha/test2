package SF.Collection.Animals;

import java.util.Comparator;
import java.util.Objects;

public class Animals implements Comparable<Animals> {
    public final String animalBreed;
    public final String name;
    public double weight;

    public Animals(String animalBreed, String name, double weight) {
        this.animalBreed = animalBreed;
        this.name = name;
        this.weight = weight;
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

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return animalBreed.equals(animals.animalBreed) && name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalBreed, name);
    }

    @Override
    public String toString() {
        return "Animals{" +
               "animalBreed='" + animalBreed + '\'' +
               ", name='" + name + '\'' +
               ", weight=" + weight +
               '}';
    }

    @Override
    public int compareTo(Animals o) {
        return (int) (this.weight - o.weight);
    }
}
