package fistream.streamdemos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ajay");
        list.add("akshay");
        list.add("ajay");
        list.add("anjali");
        list.add("divya");
        list.add("deepika");
        Predicate<String> predicate = element -> {
            //System.out.println("inside predicate " + element);
            char firstChar = element.charAt(0);
            boolean start = firstChar == 'a';
            return start;
        };
        Stream<String> stream1 = list.stream();

        Stream<String> stream2 = stream1.filter(predicate);

        Stream<String> stream3 = stream2.limit(3);
        Stream<String> stream4 = stream3.distinct();

     //   Consumer<String> consumer = input -> System.out.println(input);
        //stream4.forEach(consumer);
       long count=stream4.count();
       System.out.println("count="+count);

        System.out.println("original src=" + list);

    }
}
