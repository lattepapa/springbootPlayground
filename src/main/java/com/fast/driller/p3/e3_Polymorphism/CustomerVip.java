package com.fast.driller.p3.e3_Polymorphism;

public class CustomerVip extends Customer{
    private int privateAgencyId;
    private double vipDiscountRatio;

    public CustomerVip(int customerId, String customerName) {
        super(customerId, customerName);
        level = "VIP";
        savingRatio = 0.02;
        vipDiscountRatio = 0.1;
    }

    @Override
    public int salePrice(int price) {
        mileage += price * savingRatio;
        price -= price * vipDiscountRatio;
        return price;
    }

    public int getPrivateAgencyId() {
        return privateAgencyId;
    }

    public void setPrivateAgencyId(int privateAgencyId) {
        this.privateAgencyId = privateAgencyId;
    }

    public double getVipDiscountRatio() {
        return vipDiscountRatio;
    }

    public void setVipDiscountRatio(double vipDiscountRatio) {
        this.vipDiscountRatio = vipDiscountRatio;
    }
}
