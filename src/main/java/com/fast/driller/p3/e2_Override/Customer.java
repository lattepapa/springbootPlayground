package com.fast.driller.p3.e2_Override;

public class Customer {
    protected int customerId;
    protected String customerName;
    protected int mileage;
    protected String level;
    protected double savingRatio;

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        level = "Silver";
        savingRatio = 0.01;
    }

    public int salePrice(int price) {
        mileage += price * savingRatio;
        return price;
    }

    public String showMembershipInfo() {
        return customerName + " 회원님: " + level + "(" + mileage + "P)";
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getSavingRatio() {
        return savingRatio;
    }

    public void setSavingRatio(double savingRatio) {
        this.savingRatio = savingRatio;
    }
}
