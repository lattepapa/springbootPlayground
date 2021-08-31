package com.faster.javas.p2.e1_OOP_Class;

public class Student {
    int studentNumber;
    String studentName;
    int majorCode;
    String majorName;
    int grade;
}

// 객체(Object) : "학생", "주문" 등과 같이 구체적 또는 추상적으로 상정하는 데이터 단위
// 객체지향프로그램(Java) : 객체를 정의하고, 그 속성을 멤벼변수로 선언한 후, 객체의 역할을 메서드로 구현하여 각 객체 간의 협력을 구현하는 것
//                      "학생" 객체 -("먹는다")- "밥" 객체
//                        |
//                     ("탄다")
//                        |
//                      "버스" 객체
// 절차지향프로그램(C) : "밥을 먹는다" -> "버스를 탄다" -> "요금을 지불한다" -> ...


// 클래스(Class) : 객체의 청사진(blueprint)이다. 이때 객체의 속성(property)은 멤버변수(member variable)로 선언해야 한다.
//      public class Student {
//          int studentNumber;  -> 멤버변수
//          String studentName; -> 멤버변수
//          ...                 -> 멤버변수
//      }