package com.fast.driller.p4.e2_Hash;

public class Student {
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public String toString() {
        return studentNum + ", " + studentName;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Student) {
            Student student = (Student) object; // downcasting
            if(this.studentNum == student.studentNum) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
