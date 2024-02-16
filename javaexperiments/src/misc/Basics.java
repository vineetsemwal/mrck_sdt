package misc;

import calculator.Calculator;

/*
-128  to 127 // byte
 */
public class Basics {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        int result=calculator.add(1,2);
        int var2=128;
        byte var1=(byte)var2;
        System.out.println(var1);

        int i=10;
        Integer intObj=i; // auto boxing


        Integer myobj=null;
        int i2=myobj; //auto unboxing


    }


}
