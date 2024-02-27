package calculator;

/*
           AbstractCalculator impllements Calculator{

           int add(int num1, int num2){
        return num1+num2;
    }
           }

           CasioCalulator extends AbstractCalculator{

           }
 */
public interface ICalculator {
    double pi=3.14;// static and constant

    default int add(int num1, int num2){
        int result=internalAdd(num1,num2);
        return result;
    }


    double circleArea(double radius);

    private int internalAdd(int num1, int num2){
        return num1+num2;
    }


}
