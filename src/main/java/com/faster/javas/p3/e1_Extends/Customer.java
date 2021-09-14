package com.faster.javas.p3.e1_Extends;

public class Customer {
    // 속성(일반고객)
    // protected 키워드는 오직 상속관계의 하위 클래스에게만 접근을 허용할 경우 그 속성들에 대해 사용
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    public int bonusPoint;
    public double bonusRatio;

    // 생성자(일반고객)
    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    // 메서드
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "(" + bonusPoint + "P)";
    }

    // Getter & Setter
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

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}

