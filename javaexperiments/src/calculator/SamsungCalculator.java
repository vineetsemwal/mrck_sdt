package calculator;

public class SamsungCalculator implements ICalculator{

    private int memory;

    @Override
    public int add(int num1, int num2) {
        int result = internalAdd(num1,num2);
        return result;
    }
    @Override
    public double circleArea(double radius) {
        double pi=  CasioCalculator.pi;
        double area=pi*radius*radius;
        return area;
    }
    private int internalAdd(int num1, int num2) {
        int result = num1+num2;
        return result;
    }


    public void clear() {
        memory = 0;
    }


}
