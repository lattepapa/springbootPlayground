package com.faster.javas.p3.e1_Extends;

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

// this : 클래스 내부에서 호출할 수 있게 함(클래스 내부에 없다면 상위 클래스 참조)
// super() : 하위 클래스가 상위 클래스의 인스턴스를 참조값으로 호출할 수 있게 함
//          -> 마치 생성자가 없다면 클래스 내부에서 default 생성자를 자동으로 만들어주는 것처럼,
//             상속관계에서 하위 클래스 생성자 안에 상위 클래스 생성자에 대한 명시가 없으면
//             이 super() 를 하위 클래스 생성자 안에 자동으로 만들어준다.


// super() 응용
// 만약 상위 클래스 생성자가 매개변수를 활용한 것이라면, 하위 클래스 생성자에서 이를 바로 받아쓰기 위해선 변주가 필요하다.

// 예를 들어 상위 클래스 생성자가
//      public Customer(int customerId, String customerName) {
//                              ...
//      }
// 와 같이 customerId, customerName을 매개변수로 활용하는 모습이라면,

// 하위 클래스 생성자에서는 다음과 같이 상위 클래스 생성자를 참조할 수 있다.
//  옵션 1) customerId = 0, customerName = "John Doe"로 고정된 속성으로 하위 클래스의 인스턴스 생성
//      public CustomerVip() {
//          super(0, "John Doe");
//          ...
//      }
//  옵션 2) 하위 클래스에서도 customerId와 customerName을 자유롭게 속성에 명시하여 인스턴스 생성
//      public CustomerVip(int customerId, String customerName) {
//          super(customerId, customerName);
//          ...
//      }

// 옵션 1의 방식으로 하위 클래스의 인스턴스를 만들 경우, 생성자의 매개변수는 필요없고 default 생성자 방식을 쓰면 된다.
// 옵션 2의 방식으로 하위 클래스의 인스턴스를 만들 경우, 생성자의 매개변수에 customerId와 customerName을 지정해야 한다.


// ----------------------------------------------------------------------------------------------


// 하위 클래스의 인스턴스를 생성하려고 한다면, 상위 클래스의 인스턴스가 먼저 호출되어 힙 메모리에 생성된다.
//      -> 이 말의 의미는, 상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성하는 것이 자유롭다는 의미이다.
//      -> 이를 "up-casting" 또는 "형 변환"이라고 한다.
// 단, 이렇게 형 변환을 통해 인스턴스가 만들어진다면,
// 하위 클래스의 고유속성(vipDiscountRatio, vipCSAgentId)이나 기능은 해당 인스턴스에서 더이상 사용할 수 없게 된다.

// (ex) CustomerVip 클래스에서 생성자를 호출할 때 메모리에 속성이 생성되는 순서
//   [힙 메모리]
//  1 -- customerId
//  2 -- customerName
//  3 -- customerGrade
//  4 -- bonusPoint
//  5 -- bonusRatio
//  - - - - - - -
//  6 -- vipDiscountRatio
//  7 -- vipCSAgentId


// 따라서 이와 같은 형 변환 특성을 활용하여 다음과 같은 인스턴스 생성이나 변수 대입도 가능하다.
//  Customer lee = new CustomerVip();

//  CustomerVip kim = new CustomerVip();
//  addCustomer(kim);
//  int addCustomer(Customer park);