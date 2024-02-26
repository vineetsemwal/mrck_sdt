package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(5);
        list.add(2);
      //  Collections.sort(list);
         list.sort(new DescendingNumberComparator());
        System.out.println(list);
    }
}
