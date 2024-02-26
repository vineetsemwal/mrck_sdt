package collectiondemos;

import java.util.Comparator;

public class KeyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.intValue()-o1.intValue();
    }
}
