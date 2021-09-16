package com.fast.driller.p2.e7_This;

public class Person {
    // 속성
    String name;
    int age;

    // 매개변수를 활용한 생성자에 this를 활용하여
    // 이 클래스로 만들어진 인스턴스에 디폴트로 들어갈 속성값 정의 가능
    public Person() {
        this("이름없음", 1);
    }

    // 매개변수를 활용한 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드
    public void showPerson() {
        System.out.println(name + ", " + age);
    }

    public Person getPerson() {
        return this;
    }

    // 메인함수
    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson(); // 이름없음, 1
        System.out.println(person); // com.faster.javas.p2.e8_This.Person@2a139a55

        Person person2 = person.getPerson();
        System.out.println(person2); // com.faster.javas.p2.e8_This.Person@2a139a55
    }
}
