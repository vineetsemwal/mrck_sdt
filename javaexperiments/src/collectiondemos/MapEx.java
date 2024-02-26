package collectiondemos;

import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        SortedMap<Integer, Product> map = new TreeMap<>(new KeyComparator());
        map.put(2, new Product(2, "moto", 30000));
        map.put(1, new Product(1, "samsung", 20000));
        map.put(3, new Product(3, "iphone10", 50000));
        map.put(3, new Product(3, "iphone12", 60000));
        System.out.println("map size=" + map.size());
        System.out.println(map);
        Set<Integer> keys = map.keySet();

        System.out.println("****iterating on keys and fetching values by keys");
        for (Integer key : keys) {
            Product value = map.get(key);
            System.out.println(value);
        }
        System.out.println("*****iterating on values");
        Collection<Product> values = map.values();
        for (Product value : values) {
            System.out.println(value);
        }

        System.out.println("****iterating on entries");
        Set<Map.Entry<Integer, Product>> entries = map.entrySet();
        for (Map.Entry<Integer, Product> iterated : entries) {
            Integer key = iterated.getKey();
            Product product = iterated.getValue();
            System.out.println("key=" + key);
            System.out.println("product=" + product);
        }

        int firstKey=map.firstKey();
        Product firstValue=map.get(firstKey);
        System.out.println("firstkey="+firstKey+","+firstValue);
        Map<Integer,Product>headMap=map.headMap(3);
        Map<Integer,Product>tailMap=map.tailMap(2);
    }
}
