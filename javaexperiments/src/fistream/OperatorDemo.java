package fistream;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo {
    public static void main(String[] args) {
        ISquare calcy1=(num)->num*num;
        int result1=calcy1.square(10);
        System.out.println("result1="+result1);

        UnaryOperator<Integer>operator=(num)->num*num;
        int result2=operator.apply(4);
        System.out.println("result2="+result2);

        BinaryOperator<Integer> adder=(num1, num2)->num1+num2;
        int result3=adder.apply(3,6);
        System.out.println("result3="+result3);
    }
}
