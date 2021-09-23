package com.fast.driller.p3.e9_InterfaceInherritance;

public class CustomerTest {
    public static void main(String[] args) {
        // customer 인스턴스는 그 클래스가 구현에 활용한 모든 인터페이스의 메서드를 사용할 수 있다.
        Customer customer = new Customer();
        customer.buy();
        //    Customer has bought
        customer.sell();
        //    Customer has sold
        customer.order();
        //    Buy Order!
        //    Sell It!!!
        //    재정의
        customer.hello();
        //    Customer 메서드 지옥으로¡

        // Buy 타입으로 선언한 customer 인스턴스일 경우,
        // Default 메서드는 Buy 인터페이스의 것만 사용할 수 있다.
        Buy buyer = customer;
        buyer.buy();
        //    Customer has bought
        buyer.order();
        //    Buy Order!
        //    Sell It!!!
        //    재정의

        // Sell 타입으로 선언한 customer 인스턴스일 경우,
        // Default 메서드는 Sell 인터페이스의 것만 사용할 수 있다.
        Sell seller = customer;
        seller.sell();
        //    Customer has sold
        seller.order();
        //    Buy Order!
        //    Sell It!!!
        //    재정의
    }
}
