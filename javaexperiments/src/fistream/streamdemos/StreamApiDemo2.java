package fistream.streamdemos;

import fistream.Product;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiDemo2 {
    public static void main(String[] args) {
        StreamApiDemo2 demo=new StreamApiDemo2();
        List<String> list = new ArrayList<>();
        list.add("ajay");
        list.add("akshay");
        list.add("ajay");
        list.add("anjali");
        list.add("divya");
        list.add("deepika");
        demo.printFetchLengthOfUniqueStrings(list);
        demo.printAllStringsStartingFromLetterA(list);

        List<Product>productsInput=new ArrayList<>();
        productsInput.add(new Product(2,"samsung"));
        productsInput.add(new Product(1,"moto"));
        productsInput.add(new Product(3,"iphone"));
        demo.printSumOfAllIDs(productsInput);

        demo.printIdsOfAllProducts1(productsInput);

    }

    /*
       fetch all Strings starting from a
     */
    public void printAllStringsStartingFromLetterA(Collection<String> input) {
        System.out.println("****prints all strings starting from letter a");
        Stream<String> stream1 = input.stream();
        Predicate<String> predicate = element -> {
            char ch = element.charAt(0);
            boolean valid = (ch == 'a' || ch == 'A');
            return valid;
        };
        Stream<String> stream2 = stream1.filter(predicate);
        List<String> list = stream2.toList();
        System.out.println("list=" + list);
    }

    /*
      prints lengths of  all unique strings
     */
    public void printFetchLengthOfUniqueStrings(Collection<String> input) {
        System.out.println("***prints length of all unique string");
        Stream<String> stream1 = input.stream();
        Stream<String> stream2 = stream1.distinct();
        Function<String, Integer> function = element -> element.length();
        Stream<Integer> stream3 = stream2.map(function);
        List<Integer> list = stream3.toList();
        System.out.println("list=" + list);
    }

    /*
     prints ids of all products in descending order
     */
    public void printIdsOfAllProducts1(Collection<Product> input) {
        System.out.println("*****print ids of all products in descending order");
        Stream<Product> stream1 = input.stream();
        Function<Product, Integer> function = product -> product.getId();
        Stream<Integer> stream2 = stream1.map(function);
        Comparator<Integer> comparator = (arg1, arg2) -> arg2 - arg1;
        Stream<Integer> stream3 = stream2.sorted(comparator);
        List<Integer> list = stream3.toList();
        System.out.println(" ids of all products=" + list);
    }

    /*
     reduce functionality demo
     */
    public void printSumOfAllIDs(Collection<Product> input) {
        System.out.println("*****print sum of all ids of products");
        Stream<Product> stream1 = input.stream();
        Function<Product, Integer> function = product -> product.getId();
        Stream<Integer> stream2 = stream1.map(function);
        BinaryOperator<Integer> operator = (e1, e2) -> e1 + e2;
        Optional<Integer> totalOptional = stream2.reduce(operator);
        if (totalOptional.isPresent()) {
            int total = totalOptional.get();
            System.out.println("total ids=" + total);
            return;
        }
        System.out.println("collection is empty");

    }

    public void printFetchIdsOfAllProducts2(Collection<Product> input) {
        List<Integer> list = input.stream()
                .map(product -> product.getId())
                .sorted((arg1, arg2) -> arg2 - arg1)
                .toList();
        System.out.println("ids=" + list);
    }

    /*
     fetching unique elements
     */
    public List<String> findUniqueStrings(Collection<String> input) {
        Stream<String> stream1 = input.stream();
        Stream<String> stream2 = stream1.distinct();
        List<String> list = stream2.toList();
        return list;
    }


}
