package com.faster.javas.p3.e2_Override;

public class CustomerVip extends Customer {
    private int privateAgencyId;
    private double vipDiscountRatio;

    public CustomerVip(int customerId, String customerName) {
        super(customerId, customerName);
        level = "VIP";
        savingRatio = 0.02;
        vipDiscountRatio = 0.1;
    }

    // VIP용 할인가를 적용해주는 overriding
    @Override
    public int salePrice(int price) {
        mileage += price * savingRatio;
        price -= price * vipDiscountRatio;
        return price;
//        return super.salePrice(price);
    }
}

// Override(메서드 재정의) : 상위 클래스에 정의된 메서드 내용이 하위 클래스에는 맞지 않는 경우, 내용을 재정의할 수 있게 하는 어노테이션


// annotation : 컴파일러에게 특별한 정보를 제공해주는 주석
//      1) @Override : 재정의된 메서드라는 정보를 제공
//      2) @FunctionalInterface : 함수형 인터페이스라는 정보를 제공
//      3) @Deprecated : 이후 버전에서 사용되지 않을 변수라는 정보를 제공
//      4) @SuppressWarnings : 특정 경고가 나타나지 않도록 함
//                          (ex) @SuppressWarnings("deprecation") : @Deprecated 경고를 감춰줌
