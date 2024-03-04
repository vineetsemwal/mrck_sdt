package com.maveric.hrms;

import com.maveric.hrms.frontend.FrontEnd;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class HRMSApplication {
    public static void main(String[] args) {
        Set<String> languages1=new HashSet<>();
        languages1.add("java");
        Set<String>languages2=new HashSet<>();
        languages2.add("python");
        languages2.add("c#");
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        FrontEnd frontEnd=context.getBean(FrontEnd.class);
        frontEnd.register("akshay","patil",28,languages1,2);
        frontEnd.register("srinath","s",26,languages2,1);
    }
}
