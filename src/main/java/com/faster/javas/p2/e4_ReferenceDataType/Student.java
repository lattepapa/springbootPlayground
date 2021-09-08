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

// 참조자료형(Reference data type) : 클래스와 같은 참조자료형도 변수의 자료형이다. 즉, 독립된 객체로써 얼마든지 정규화의 대상이 된다.
// 예를 들어 "학생"이라는 클래스는 학번, 학년, 이름, 수강과목이라는 속성들을 가지고 있으며,
// "성적"이라는 클래스는 영어성적, 수학성적이라는 속성들을 가지고 있다.
// 이 경우, 학생 클래스로부터 "과목"이라는 클래스를 더 정규화할 수 있다.
