package com.maveric.springdemo.shapes;

import com.maveric.springdemo.shapes.IShape;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class Square implements IShape {
    @Value("${square.side}")
    private double side;
    public Square(){}
    public Square(double side){
        this.side=side;
        System.out.println("***inside ctr square side="+side);
    }

    @Override
    public double area() {
        System.out.println("***inside area="+side);
        return side*side;
    }
    @PostConstruct
    public void setup(){
        System.out.println("***inside square setup="+side);
    }
}
