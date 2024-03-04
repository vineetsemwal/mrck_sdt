package com.maveric.demo;

public class Calculator {

    private Adder adder;
    public Calculator(Adder adder){
        this.adder=adder;
    }

    public int sum(int num1, int num2){
        System.out.println("***inside sum num1="+num1+" num2="+num2+" mock="+adder);
        int result=adder.add(num1,num2);
        System.out.println("result="+result);
        return result;
    }

    public int multiply(int num1, int num2){
        System.out.println("***inside multiply");
        return num1*num2;
    }
    public  int multiplyBy10(int num){
        System.out.println("***inside multiplyby10");
       int result= multiply(num,10);
        return result;
    }

}
