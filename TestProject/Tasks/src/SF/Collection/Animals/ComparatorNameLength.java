package SF.Collection.Animals;

import java.util.Comparator;

public class ComparatorNameLength implements Comparator<Animals> {
    @Override
    public int compare(Animals o1, Animals o2) {
        return o2.getName().length() - o1.getName().length();
    }
}
