package com.fast.driller.p3.e1_Extends;

public class CustomerVip extends Customer{
    // 속성(일반고객)
    // extends 키워드를 통해 Customer 클래스로부터 일반고객의 속성은 일괄적으로 상속됨

    // 속성(VIP고객 전용)
    public double vipDiscountRatio;
    private int vipCSAgentId;

    // 생성자(VIP고객)
    public CustomerVip() {
        // super(); 가 자동으로 호출됨
        bonusRatio = 0.05;
        vipDiscountRatio = 0.1;
        customerGrade = "VIP";
    }

    // 메서드
    // extends 키워드를 통해 Customer 클래스로부터 일반고객의 메서드는 일괄적으로 상속됨
    public int getVipCSAgentID() {
        return vipCSAgentId;
    }

    // Getter & Setter
    public int getVipCSAgentId() {
        return vipCSAgentId;
    }

    public void setVipCSAgentId(int vipCSAgentId) {
        this.vipCSAgentId = vipCSAgentId;
    }
}
