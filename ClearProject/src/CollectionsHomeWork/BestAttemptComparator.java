package CollectionsHomeWork;

import java.util.Comparator;


public class BestAttemptComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman sportsman1, Sportsman sportsman2) {
        return Double.compare(sportsman1.getBestAttempt(), sportsman2.getBestAttempt());
    }
}