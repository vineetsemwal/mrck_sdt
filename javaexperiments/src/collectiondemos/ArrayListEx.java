package collectiondemos;

import employeems.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Product>oldList=new LinkedList<>();
        oldList.add(new Product(1,"galaxy-g1",20000));
        oldList.add(new Product(2,"galaxy-g2",30000));

        List<Product> list=new ArrayList<>(3);
        list.add(new Product(3,"iphone-12",50000));
        list.add(new Product(4,"iphone-13",60000));

        list.addAll(oldList);
        System.out.println("list"+list);

        list.set(0, new Product(5,"lg-1",30000));
        System.out.println("size="+list.size());
        list.remove(0);
      //  Collections.sort(list);
        list.sort(new IDComparatorAsc());
        System.out.println("****after sorting by id");
        for (Product product :list){
            System.out.println("product="+product.getId()+"-"+product.getName());
        }
        list.sort(new ProductNameComparator());
        System.out.println("******after sorting by name");
        for (Product product :list){
            System.out.println("product="+product.getId()+"-"+product.getName());
        }
        System.out.println("size after removing element="+list.size());
        Product searchFor=new Product(2,"galaxy-g2",30000);
        boolean contains= list.contains(searchFor);
        System.out.println("contains="+contains);
        System.out.println("employee="+searchFor);
    }
}
