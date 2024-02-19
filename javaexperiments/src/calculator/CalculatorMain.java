package calculator;

import java.lang.*;

public class CalculatorMain {


    public static void main(String[] args) {


        ICalculator calcy = new SamsungCalculator();
        int result = calcy.add(1, 2);
        System.out.println("result is " + result);

        double area=calcy.circleArea(4);
        System.out.println("circle area="+area);
    }
}
