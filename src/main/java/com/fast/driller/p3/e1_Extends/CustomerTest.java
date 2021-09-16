package com.fast.driller.p3.e1_Extends;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerId(12345);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        CustomerVip customerKim = new CustomerVip();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerId(54321);
        customerKim.bonusPoint = 5000;
        System.out.println(customerKim.showCustomerInfo());
    }

//    이순신님의 등급은 SILVER(1000P)
//    김유신님의 등급은 VIP(5000P)
}