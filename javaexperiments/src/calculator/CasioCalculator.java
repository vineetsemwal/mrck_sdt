package calculator;

public class CasioCalculator implements ICalculator{

    private String name;

    public CasioCalculator(){
        name="CasioCalclator";
    }
    /*
       CasioCalculator calcy=new Calculator("cal1");
     */
    public CasioCalculator(String name){
        this.name=name;
    }

    public  String getName(){
        return name;
    }


    private int memory;

    @Override
    public int add(int num1, int num2) {
        int result = num1+num2;
        return result;
    }

    @Override
    public double circleArea(double radius) {
      double pi=  CasioCalculator.pi;
      double area=pi*radius*radius;
      return area;
    }

    public void clear() {
        memory = 0;
    }


}
