package com.fast.driller.p3.e9_InterfaceInherritance;

// 인터페이스 다중상속(타입상속)
public class Customer implements Buy, Sell {
    @Override
    public void buy() {
        System.out.println("Customer has bought");
    }

    @Override
    public void order() {
        Buy.super.order(); // Buy 인터페이스의 Default 메서드를 쓸 경우
        Sell.super.order(); // Sell 인터페이스의 Default 메서드를 쓸 경우
        System.out.println("재정의"); // Buy, Sell 인터페이스 어떤 것도 쓰지 않고 새롭게 Default 메서드를 재정의할 경우
    }

    @Override
    public void sell() {
        System.out.println("Customer has sold");
    }

    public void hello() {
        System.out.println("Customer 메서드 지옥으로¡");
    }
}
