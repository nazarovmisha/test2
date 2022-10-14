package Animal;

import java.util.Comparator;

public class ComparatorNameLength implements Comparator<Animal>{


    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().length()-o2.getName().length();

    }
}
