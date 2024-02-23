package collectiondemos;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        Product product1 = new Product(1, "galaxy-phone", 20000);
        System.out.println("product1-hash=" + product1.hashCode());
        Product product2 = new Product(2, "iphone", 50000);
        Product product3 = new Product(1, "galaxy-phone", 20000);
        System.out.println("product3-hash=" + product3.hashCode());
        set.add(product1);
        set.add(product2);
        set.add(product3);
        System.out.println("size=" + set.size());

    }
}
