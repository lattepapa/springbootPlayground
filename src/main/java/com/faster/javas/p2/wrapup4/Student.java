package com.faster.javas.p2.wrapup4;

import java.util.ArrayList;

public class Student {
    // 속성
    public int studentId;
    public String studentName;

    // 수강과목 속성은 Subject 클래스의 인스턴스들을 그 엘리먼트로 하는 배열이다
    public ArrayList<Subject> subjectList;

    // 매개변수를 활용한 생성자
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        // 학생이 수강하는 과목리스트를 ArrayList로 생성
        subjectList = new ArrayList<>();
    }

    // 메서드
    public void addSubject(String subjectName, int subjectScore) {
        // 과목 인스턴스를 만들어서 바로 매개변수 정보들로 인스턴스 속성 결정
        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectScore(subjectScore);

        // 위에서 만들어진 과목 인스턴스를 이 학생의 과목리스트의 엘리먼트로 추가
        subjectList.add(subject);
    }

    public void showScoreInfo() {
        int total = 0;
        for(Subject subject : subjectList) {
            total += subject.getSubjectScore();
            System.out.println(studentName + " 학생의 " + subject.getSubjectName() + " 성적: " + subject.getSubjectScore() + "점");
        }
        System.out.println(studentName + "학생의 총점: " + total + "점\n" + "-------------------");
    }
}
