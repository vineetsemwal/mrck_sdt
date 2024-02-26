package collectiondemos;

import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        SortedSet<Product> set = new TreeSet<>(new IDComparatorAsc());

        Product product1 = new Product(1, "galaxy-phone", 20000);
        Product product2 = new Product(2, "iphone", 50000);
        Product product3 = new Product(3, "imac", 30000);
        Product product4=new Product(4, "lg", 15000);
        Product product5=new Product(5, "htc", 20000);
        set.add(product3);
        set.add(product1);
        set.add(product2);
        set.add(product2);
        set.add(product4);
        set.add(product5);
        System.out.println("size=" + set.size());
        System.out.println(set);


        Product last=set.last();
        Product first= set.first();
        Set<Product>headSet=set.headSet(product4);
        System.out.println("headsert "+headSet);
        Set<Product>tailSet=set.tailSet(product2);
        System.out.println("tail set="+tailSet);
    }
}
