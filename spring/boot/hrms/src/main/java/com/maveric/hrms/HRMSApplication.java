package com.maveric.hrms;

import com.maveric.hrms.frontend.FrontEnd;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

/*
@ComponentScan
@Configuration
@EnableAutoConfiguration
 */
@SpringBootApplication
public class HRMSApplication {



    public static void main(String[] args) {
        Set<String> languages1=new HashSet<>();
        languages1.add("java");
        Set<String>languages2=new HashSet<>();
        languages2.add("python");
        languages2.add("c#");
        ApplicationContext context= SpringApplication.run(HRMSApplication.class,args);
        FrontEnd frontEnd=context.getBean(FrontEnd.class);
        frontEnd.register("akshay","patil",28,languages1,2);
        frontEnd.register("srinath","s",26,languages2,1);
    }
}
