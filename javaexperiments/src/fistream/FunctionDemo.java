package fistream;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        ILength calculator = (input) -> input.length();
        int len1 = calculator.length("hello");
        System.out.println("len1=" + len1);

        Function<String, Integer> function1 = (input) -> input.length();
        int len2=function1.apply("hi");
        System.out.println("len2="+len2);

        BiFunction<String,Integer,String>function2=(input,num)->{
          String result="";
          for (int i=0;i<num;i++){
              result=result+input;
          }
          return result;
        };
        String result2=function2.apply("hi",3);
        System.out.println("result2="+result2);



    }
}
