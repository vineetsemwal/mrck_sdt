package collectiondemos;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ListEx3 {
    public static void main(String[] args) {


    //  experiemnt with implementations linked LinkedList,
          Deque<Product> queue = new LinkedBlockingDeque<>(1);
        // add at the start, if queue is full,then it  throws  IllegalStateException
        queue.addLast(new Product(1, "imac", 80000));
        // add at the start, if queue is full,then it  throws  IllegalStateException
//        queue.addFirst(new Product(2, "iphone-12", 50000));
        // add at the start, if queue is full,then it doesn't throw exception
        queue.offerFirst(new Product(3, "galaxy-g1", 40000));

        // fetch first element of Q
        Product first1 = queue.peekFirst();


        // fetch first element of Q and element will be removed from the Queue, if Q is empty null is returned
        Product first2 = queue.pollFirst();

        // fetches first element , if Q is empty, throws NoSuchElementException
        Product first3=queue.getFirst();

        Product p=new Product(1, "imac", 80000);


    }
}
