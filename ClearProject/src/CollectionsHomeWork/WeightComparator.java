package CollectionsHomeWork;

import java.util.Comparator;

public class WeightComparator implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman sportsman1, Sportsman sportsman2) {
        return Double.compare(sportsman1.getWeight(), sportsman2.getWeight());
    }
}
