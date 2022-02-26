package SF.Collection.HomeWork;

import java.util.Comparator;

public class BestAttemptComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman o1, Sportsman o2) {
        return Double.compare(o1.getBestAttempt(), o2.getWeight());
    }
}
