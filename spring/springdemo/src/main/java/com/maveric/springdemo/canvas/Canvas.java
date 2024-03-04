package com.maveric.springdemo.canvas;

import com.maveric.springdemo.shapes.IShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@Scope("prototype")
public class Canvas {

    @Qualifier("square")
    @Autowired
    private IShape shape;
    public Canvas() {

    }

    public Canvas(IShape shape) {
        this.shape = shape;
    }

    //@Autowired
    public void setShape(IShape shape){
        this.shape=shape;
    }

    public void drawShape() {
        double area = shape.area();
        System.out.println("drawing shape=" + area+" for shape"+shape.getClass().getName());
    }

    @PostConstruct
    public void init(){
        System.out.println("***inside Canvas init shape object type="+shape.getClass().getName()+" area="+shape.area());
    }
}
