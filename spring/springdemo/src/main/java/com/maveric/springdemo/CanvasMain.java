package com.maveric.springdemo;

import com.maveric.springdemo.canvas.Canvas;
import com.maveric.springdemo.shapes.IShape;
import com.maveric.springdemo.shapes.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CanvasMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        IShape shape = context.getBean(IShape.class);
        System.out.println("shape=" + shape.getClass().getName() + " area=" + shape.area());

        Canvas canvas = context.getBean(Canvas.class);
        canvas.drawShape();

    }
}
