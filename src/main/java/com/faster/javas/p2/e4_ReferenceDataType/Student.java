package com.faster.javas.p2.e4_ReferenceDataType;

public class Student {
    // 기본속성(멤버변수)
    int studentId;
    String studentName;

    // 참조자료형 Subject로 선언하여 불러올 속성
    Subject english;
    Subject math;

    // 매개변수 생성자
    Student(int studentId, String studentName) {
        // 기본속성들은 클래스 안에서 그대로 this로 선언
        this.studentId = studentId;
        this.studentName = studentName;

        // 참조자료형으로 불러올 속성들은 해당 참조자료형의 인스턴스 형식으로 선언
        english = new Subject();
        math = new Subject();
    }

    // 참조자료형으로 불러올 속성들을 활용한 메서드
    public void setEnglishSubject(String subjectName, int subjectScore) {
        english.subjectName = subjectName;
        english.subjectScore = subjectScore;
    }
    public void setMathSubject(String subjectName, int subjectScore) {
        math.subjectName = subjectName;
        math.subjectScore = subjectScore;
    }

    // 클래스 전체에서 활용할 메서드
    public void showSubjectScores() {
        int total = english.subjectScore + math.subjectScore;
        System.out.println(studentName + " 학생의 총점: " + total);
    }
}

