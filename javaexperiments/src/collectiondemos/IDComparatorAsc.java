package collectiondemos;

import java.util.Comparator;

public class IDComparatorAsc implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int compare=o1.getId()-o2.getId();
        return compare;
    }
}
