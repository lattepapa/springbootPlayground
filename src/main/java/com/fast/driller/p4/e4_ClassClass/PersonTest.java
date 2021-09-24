package com.fast.driller.p4.e4_ClassClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // (1) forName()을 활용하여 클래스를 동적 로드
        Class c1 = Class.forName("com.fast.driller.p4.e4_ClassClass.Person");
        Person person = (Person)c1.newInstance();
        person.setPersonName("Lee");
        System.out.println(person + " --> " + person.getPersonName());
        //    com.fast.driller.p4.e4_ClassClass.Person@3941a79c --> Lee

        // (2) 클래스 동적 로드 방식을 활용하여 new 키워드 인스턴스 생성방식 따라하기
        Class[] parameterTypes = {String.class};
        Constructor cons = c1.getConstructor(parameterTypes);
        Object[] initargs = {"Lee"};
        Person personLee = (Person)cons.newInstance(initargs);
        System.out.println(personLee + " --> " + personLee.getPersonName());
        //    com.fast.driller.p4.e4_ClassClass.Person@506e1b77 --> Lee

        Person personLee2 = new Person();
        personLee2.setPersonName("Lee");
        System.out.println(personLee2 + " --> " + personLee2.getPersonName());
        //    com.fast.driller.p4.e4_ClassClass.Person@4fca772d --> Lee
    }
}
