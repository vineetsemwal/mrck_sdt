package com.maveric.restdemo;

public class CustomerNotFoundException extends Exception{
    public CustomerNotFoundException(String msg){
        super(msg);
    }
}
