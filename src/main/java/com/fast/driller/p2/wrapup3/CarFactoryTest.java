package com.fast.driller.p2.wrapup3;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car myTrailblazer = factory.createCar();
        Car yourTrailblazer = factory.createCar();

        System.out.println(myTrailblazer.getCarNum()); // 10001
        System.out.println(yourTrailblazer.getCarNum()); // 10002
    }
}
