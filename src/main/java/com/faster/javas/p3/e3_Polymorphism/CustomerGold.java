package com.faster.javas.p3.e3_Polymorphism;

public class CustomerGold extends Customer {
    private double vipDiscountRatio;

    public CustomerGold(int customerId, String customerName) {
        super(customerId, customerName);
        vipDiscountRatio = 0.05;
        savingRatio = 0.015;
        level = "Gold";
    }

    public int salePrice(int price) {
        mileage += price * savingRatio;
        return price - (int)(price * vipDiscountRatio);
    }
}
