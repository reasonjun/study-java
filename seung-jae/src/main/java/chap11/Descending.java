package chap11;

import java.util.Comparator;

public class Descending<String> implements Comparator<String> {

    @Override
    public int compare(final Object o1, final Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable<String> c1 = (Comparable<String>) o1;
            Comparable<String> c2 = (Comparable<String>) o2;
            return c1.compareTo((String) c2) * -1;
        }

        return -1;
    }

}
