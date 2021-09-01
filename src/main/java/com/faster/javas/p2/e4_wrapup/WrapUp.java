package com.faster.javas.p2.e4_wrapup;

public class WrapUp {
    public static void main(String[] args) {
        // User 인스턴스(참조변수) 생성
        User user1 = new User("Tomas", 180, 70, 37);
        user1.getUserInfo();

        // Order 인스턴스(참조변수) 생성
        Order order1 = new Order("202109010001", "01011112222", "서울 강남구 역삼동 111-222", "20210901", "213600", 35000, "0003");
        System.out.println(order1.getOrderInfo());
    }
}
