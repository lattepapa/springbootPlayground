package com.faster.javas.p2.e5_ReferenceDataType;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        studentLee.setEnglishSubject("영어", 100);
        studentLee.setMathSubject("수학", 99);
        studentLee.showSubjectScores();

        Student studentKim = new Student(200, "Kim");
        studentKim.setEnglishSubject("영어", 80);
        studentKim.setMathSubject("수학", 70);
        studentKim.showSubjectScores();
    }
}
