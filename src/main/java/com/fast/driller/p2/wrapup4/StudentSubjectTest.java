package com.fast.driller.p2.wrapup4;

public class StudentSubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("국어", 70);
        studentKim.addSubject("수학", 85);
        studentKim.addSubject("영어", 100);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }

//    Lee 학생의 국어 성적: 100점
//    Lee 학생의 수학 성적: 50점
//    Lee학생의 총점: 150점
//    -------------------
//    Kim 학생의 국어 성적: 70점
//    Kim 학생의 수학 성적: 85점
//    Kim 학생의 영어 성적: 100점
//    Kim학생의 총점: 255점
//    -------------------
}
