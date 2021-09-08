package com.faster.javas.p2.e4_ReferenceDataType;

public class Student2 {
    // 속성(멤버변수 및 참조자료형 변수)
    public int studentId;
    public String studentName;
    public Subject science;
    public Subject geology;

    // 매개변수 생성자
    public Student2(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        science = new Subject();
        geology = new Subject();
    }

    // 메서드
    public void setScience(String subjectName, int subjectScore) {
        science.subjectName = subjectName;
        science.subjectScore = subjectScore;
    }
    public void setGeology(String subjectName, int subjectScore) {
        geology.subjectName = subjectName;
        geology.subjectScore = subjectScore;
    }
    public void showGPA() {
        System.out.println(studentName + " 학생의 평균점수: " + (science.subjectScore + geology.subjectScore)/2);
    }
}
