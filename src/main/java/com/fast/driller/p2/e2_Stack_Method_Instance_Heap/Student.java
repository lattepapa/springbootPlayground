package com.fast.driller.p2.e2_Stack_Method_Instance_Heap;

public class Student {
    // 이 클래스 안에서 main 함수를 만들 수도 있지만, OOP의 개념 그대로 가기 위해
    // StudentTest 클래스에 main 함수를 만들고, 이 Student 클래스의 인스턴스도 호출하도록 한다

    // 클래스의 속성은 멤버변수로 선언
    public int studentID;
    public String studentName;
    public String address;

    // 리턴값에 데이터타입을 정의하지 않는 함수
    public void showStudentInfo() {
        System.out.println(studentID + " 학번의 이름은 " + studentName + ", 주소는 " + address);
    }

    // 리턴값이 String인 함수
    public String getStudentName() {
        return studentName;
    }

    // 매개변수를 활용하여 주어진 클래스의 속성을 가공하고, 리턴값에 데이터타입을 정의하지 않는 함수
    // 이것이 바로 메서드
    public void setStudentName(String name) {
        studentName = name;
    }
}
