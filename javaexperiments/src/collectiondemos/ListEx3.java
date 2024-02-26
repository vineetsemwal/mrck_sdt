package collectiondemos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) {
        List<Product>list=new LinkedList<>();
        list.add(new Product(1, "imac", 80000));
        list.add(new Product(2, "iphone-12", 50000));
        list.add(new Product(3, "iphone-13", 60000));
        list.add(new Product(4, "htc", 30000));

    }
}
