package CollectionsHomeWork;

import java.util.Objects;

public class Sportsman {
    private final String name;
    private final double height;
    private double weight;
    private double bestAttempt;

    public Sportsman(String name, double height, double weight, double bestAttempt) {
        if(name == null||height<=0||weight<=0||bestAttempt<0){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.bestAttempt = bestAttempt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sportsman sportsman = (Sportsman) o;
        return Double.compare(sportsman.height, height) == 0 && name.equals(sportsman.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBestAttempt() {
        return bestAttempt;
    }

    public void setBestAttempt(double bestAttempt) {
        this.bestAttempt = bestAttempt;
    }
}


