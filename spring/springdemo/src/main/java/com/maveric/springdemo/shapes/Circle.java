package com.maveric.springdemo.shapes;

import org.springframework.stereotype.Component;

@Component
public class Circle implements IShape {
    private double radius;
    public Circle(){
    }
    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}
