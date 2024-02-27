package misc;

public class Calculator {


    /*
     Calculat c=new Calculator()
     int nums[]={1,2,3};
     c.add(nums);

     */


    public  int add(int ...numbers){
        int result=0;
        for (int num:numbers ){
           result=result+num;
        }
        return result;
    }



    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        int result1=calculator.add(1,2);
        int result2=calculator.add(1,2,3);
        int result3=calculator.add();
        System.out.println("result1="+result1);
        System.out.println("result2="+result2);
        System.out.println("result3="+result3);

    }
}
