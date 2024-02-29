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
        list.add("divya");
        Predicate<String> predicate = element -> {
            //System.out.println("inside predicate " + element);
            char firstChar = element.charAt(0);
            boolean start = firstChar == 'a';
            return start;
        };
        Stream<String> stream1 = list.stream();
        Stream<String> stream2 = stream1.filter(predicate);
        Consumer<String>consumer= input->System.out.println(input);
        stream2.forEach(consumer);

        System.out.println("original src="+list);

    }
}
