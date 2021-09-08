package com.faster.javas.p2.wrapup1;

public class Order {
    // 속성(멤버변수)
    public String orderNumber;
    public String orderContact;
    public String orderAddress;
    public String orderDate;
    public String orderTime;
    public int orderAmount;
    public String orderProduct;

    // 매개변수 생성자
    public Order(
            String orderNumber,
            String orderContact,
            String orderAddress,
            String orderDate,
            String orderTime,
            int orderAmount,
            String orderProduct
    ) {
        this.orderNumber = orderNumber;
        this.orderContact = orderContact;
        this.orderAddress = orderAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderAmount = orderAmount;
        this.orderProduct = orderProduct;
    }
    public Order() {}

    // 메서드
    public String getOrderInfo() {
        return "주문번호: " + orderNumber + "\n주문연락처: " + orderContact + "\n주문집주소: " + orderAddress + "\n주문날짜: " + orderDate + "\n주문시간: " + orderTime + "\n주문가격: " + orderAmount + "\n주문메뉴: " + orderProduct;
    }
}
