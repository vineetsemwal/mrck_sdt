package fistream;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        IEven checker1=(num)->num%2==0;
        boolean result1=checker1.isEven(10);
        System.out.println("result1="+result1);
        Predicate<Integer> checker2=(num)->num%2==0;;
        boolean result2=checker2.test(20);
        System.out.println("result2="+result2);

    }
}
