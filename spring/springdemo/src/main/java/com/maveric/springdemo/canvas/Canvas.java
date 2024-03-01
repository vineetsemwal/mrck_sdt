package com.maveric.springdemo.canvas;

import com.maveric.springdemo.shapes.IShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Canvas {

    private IShape shape;

    public Canvas() {
    }

    public Canvas(IShape shape) {
        this.shape = shape;
    }

    @Autowired
    public void setShape(IShape shape){
        this.shape=shape;
    }

    public void drawShape() {
        double area = shape.area();
        System.out.println("drawing shape=" + area+" for shape"+shape.getClass().getName());
    }
}
