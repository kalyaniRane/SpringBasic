package com.bridgelabz.ioc.javaclass;


import com.bridgelabz.ioc.interfaces.Sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("context is loaded");

        Sim sim = context.getBean("sim", Sim.class);
        sim.calling();
        sim.data();

    }

}
