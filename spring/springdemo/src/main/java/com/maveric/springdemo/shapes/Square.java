package com.maveric.springdemo.shapes;

import com.maveric.springdemo.shapes.IShape;
import org.springframework.stereotype.Component;

//@Component
public class Square implements IShape {
    private double side;
    public Square(){}
    public Square(double side){
        this.side=side;
    }

    @Override
    public double area() {
        return side*side;
    }
}
