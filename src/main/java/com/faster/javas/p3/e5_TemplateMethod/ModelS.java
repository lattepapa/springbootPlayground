package com.faster.javas.p3.e5_TemplateMethod;

public class ModelS extends Car{
    @Override
    public void drive() {
        System.out.println("Tesla AI Self Driving start");
        System.out.println("Found 2 ways");
    }

    @Override
    public void stop() {
        System.out.println("Found pedestrian!!");
    }
}
