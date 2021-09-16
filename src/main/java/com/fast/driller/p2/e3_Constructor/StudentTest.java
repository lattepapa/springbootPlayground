package com.fast.driller.p2.e3_Constructor;

public class StudentTest {
    public static void main(String[] args) {
        // 생성자로 만들어진 인스턴스의 속성은 초기화가 되어 있다
        Student studentLee = new Student();
        System.out.println(studentLee.showStudentInfo());

        // new 키워드를 활용한 생성자
        Student studentKim = new Student();
        studentKim.studentName = "Kim";
        studentKim.studentNumber = 12345;
        studentKim.grade = 6;
        System.out.println(studentKim.showStudentInfo());

        // 클래스 내 매개변수 생성자와 연계하여 new 키워드를 활용한 생성자
        Student studentPark = new Student(54321, "Park", 5);
        System.out.println(studentPark.showStudentInfo());
    }
}
