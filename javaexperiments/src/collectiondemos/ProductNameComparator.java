package collectiondemos;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        String name1=o1.getName();
        String name2=o2.getName();
        int compare=name1.compareTo(name2);
        return  compare;
    }
}
