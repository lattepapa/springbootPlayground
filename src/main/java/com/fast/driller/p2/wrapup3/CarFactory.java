package com.fast.driller.p2.wrapup3;

public class CarFactory {
    // 유일객체이므로 싱글톤패턴일 것
    // 인스턴스를 클래스 내부에서 은닉생성
    private static CarFactory factory = new CarFactory();

    // 생성자를 클래스 내부에서 은닉
    private CarFactory() {}

    // 접근메서드를 클래스 외부에 허용
    public static CarFactory getInstance() {
        if(factory == null) {
            factory = new CarFactory();
        }
        return factory;
    }

    // 차량 생산 메서드는 말 그대로 Car 클래스 생성자로 인스턴스 만드는 역할
    public Car createCar() {
        return new Car();
    }
}
