package com.faster.javas.p2.e3_Constructor;

public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;

    public String showStudentInfo() {
        return studentName + " 학생의 학번은 " + studentNumber + ", " + grade + "학년";
    }

    // 매개변수를 활용한 생성자
    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    // 매개변수를 활용한 생성자 작성 시 한 묶음으로 기본생성자도 같이 작성해준다
    public Student() {}
}
