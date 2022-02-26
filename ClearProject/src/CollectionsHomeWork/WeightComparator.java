package CollectionsHomeWork;

import java.util.Comparator;

public class WeightComparator implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman o1, Sportsman o2) {
        return Double.compare(o1.getWeight(),o2.getWeight());
    }
}
