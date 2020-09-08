package com.bridgelabz.ioc.javaclass;

import com.bridgelabz.ioc.interfaces.Sim;

public class Airtel implements Sim {

    public Airtel() {
        System.out.println("Called airtel");
    }

    @Override
    public void calling() {
        System.out.println("Calling from Airtel sim");
    }

    @Override
    public void data() {
        System.out.println("Browsing from Airtel sim");
    }
}
