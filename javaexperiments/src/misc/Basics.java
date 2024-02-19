package misc;

import calculator.SamsungCalculator;

/*
-128  to 127 // byte
 */
public class Basics {
    public static void main(String[] args) {
        SamsungCalculator calculator=new SamsungCalculator();
        int result=calculator.add(1,2);
        int var2=128;
        byte var1=(byte)var2;
        System.out.println(var1);

        int i=10;
        Integer intObj=i; // auto boxing


        Integer myobj=null;
        int i2=myobj; //auto unboxing

        //String, Long, Integer, Boolean,Double
        Integer obj=new Integer(30);
        String textInt=obj.toString();// "30"
        double doubleVal=obj.doubleValue();


        int j=10;
        String str="hello";
        String str2=str+"bangalore";
        String str3=""+j;


    }


}
