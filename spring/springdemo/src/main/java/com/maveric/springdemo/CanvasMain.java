package com.maveric.springdemo;

import com.maveric.springdemo.canvas.Canvas;
import com.maveric.springdemo.shapes.IShape;
import com.maveric.springdemo.shapes.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CanvasMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);


        Canvas canvas1 = context.getBean(Canvas.class);
        canvas1.drawShape();

        Canvas canvas2=context.getBean(Canvas.class);

        boolean same=canvas1==canvas2;
        System.out.println("is same same ? "+same);


        IShape shape1 = context.getBean("circle",IShape.class);
        System.out.println("shape=" + shape1.getClass().getName() + " area=" + shape1.area());

    }
}
