package com.bridgelabz.ioc.javaclass;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("context is loaded");

        Airtel air = (Airtel) context.getBean("airtel");
        air.calling();
        air.data();

        Airtel airtel = context.getBean("airtel", Airtel.class);
        airtel.calling();
        airtel.data();

    }

}
