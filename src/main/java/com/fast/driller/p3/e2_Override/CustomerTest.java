package com.fast.driller.p3.e2_Override;

public class CustomerTest {
    public static void main(String[] args) {
        Customer lee = new Customer(1001, "이순신");
        CustomerVip kim = new CustomerVip(1002, "김유신");

        lee.setMileage(1000);
        lee.salePrice(50000);

        kim.setMileage(1000);
        kim.salePrice(50000);

        System.out.println(lee.showMembershipInfo() + " -> 구매가능: " + lee.salePrice(50000) + "원" + "\n----------\n" + kim.showMembershipInfo() + " -> 구매가능: " + kim.salePrice(50000) + "원" );
    }
//    이순신 회원님: Silver(1500P) -> 구매가능: 50000원
//    ----------
//    김유신 회원님: VIP(2000P) -> 구매가능: 45000원
}
