package com.fast.driller.p3.e3_Polymorphism;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        // 인스턴스들을 한번에 다루기 쉽게 ArrayList에 담는다.
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer lee = new Customer(1001, "이순신");
        Customer kim = new Customer(1002, "김유신");
        Customer park = new CustomerGold(1003, "박 키");
        Customer baek = new CustomerGold(1004, "백두산");
        Customer song = new CustomerVip(1005, "송여시");

        customerList.add(lee);
        customerList.add(kim);
        customerList.add(park);
        customerList.add(baek);
        customerList.add(song);

        // 다형성을 활용한 salePrice 메소드 호출
        int price = 50000;
        for(Customer customer : customerList) {
            int cost = customer.salePrice(price);
            System.out.println(customer.showMembershipInfo() + "\t-> 지불금액: " + customer.salePrice(50000) + "원\t::: " + customer.mileage + "P 적립 중");
        }
    }

//    이순신	회원님: Sivler(500P)	-> 지불금액: 50000원	::: 1000P 적립 중
//    김유신	회원님: Sivler(500P)	-> 지불금액: 50000원	::: 1000P 적립 중
//    박 키	회원님: Gold(750P)	-> 지불금액: 47500원	::: 1500P 적립 중
//    백두산	회원님: Gold(750P)	-> 지불금액: 47500원	::: 1500P 적립 중
//    송여시	회원님: VIP(1000P)	-> 지불금액: 45000원	::: 2000P 적립 중
}
