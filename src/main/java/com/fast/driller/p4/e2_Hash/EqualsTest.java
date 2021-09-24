package com.fast.driller.p4.e2_Hash;

public class EqualsTest {
    public static void main(String[] args) {
        Student student1 = new Student(1001, "이순신");
        Student student2 = new Student(1002, "김유신");

        System.out.println(student1 == student2);
        //    false

        System.out.println(student1.equals(student2));
        //    false

        Student student3 = new Student(1002, "김유신");

        System.out.println(student2 == student3);
        //    false

        System.out.println(student2.equals(student3));
        //    true

        System.out.println(student1.hashCode());
        //    960604060

        System.out.println(student2.hashCode());
        //    1349393271

        System.out.println(student3.hashCode());
        //    1338668845
    }
}
