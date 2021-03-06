package com.fast.driller.p2.e4_ReferenceDataType;

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

        Student2 studentPark = new Student2(300, "Park");
        studentPark.setGeology("지리", 60);
        studentPark.setScience("과학", 100);
        studentPark.showGPA();
    }
}
