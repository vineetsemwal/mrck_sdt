public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator1=new Calculator();
         calculator1.add(1,2);
         calculator1.addSingle(5);
         int calcy1Result=calculator1.memory;

         Calculator calculator2=new Calculator();
         calculator2.addSingle(4);
         int calcy2Result=calculator2.memory;

        System.out.println("cacly1 result="+calcy1Result);
        System.out.println("calcy2 result="+calcy2Result);

    }
}
