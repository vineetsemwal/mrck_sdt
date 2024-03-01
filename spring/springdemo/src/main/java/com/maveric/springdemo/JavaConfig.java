package com.maveric.springdemo;

import com.maveric.springdemo.shapes.IShape;
import com.maveric.springdemo.shapes.Square;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.maveric.springdemo")
@Configuration
public class JavaConfig {
    @Bean
    public Square square() {
        Square square = new Square(10);
        return square;
    }

}
