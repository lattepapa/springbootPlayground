package com.fast.driller.p4.e3_StringClass;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));
        //    960604060

        buffer.append(android);
        System.out.println(System.identityHashCode(buffer));
        //    960604060

        String javaBuffered = buffer.toString();
        System.out.println(javaBuffered);
        //    javaandroid
    }
}
