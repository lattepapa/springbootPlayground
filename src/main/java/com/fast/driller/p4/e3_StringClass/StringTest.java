package com.fast.driller.p4.e3_StringClass;

public class StringTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        //    960604060

        java = java.concat(android);
        System.out.println(java);
        //    javaandroid

        System.out.println(System.identityHashCode(java));
        //    1349393271
    }
}
