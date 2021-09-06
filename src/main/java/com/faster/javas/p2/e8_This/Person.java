package com.faster.javas.p2.e8_This;

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

// this : 생성된 인스턴스 자신의 메모리(= 참조변수 = 힙 주소값)를 가리키는 것
//      (1) 생성자에서 또 다른 생성자를 호출할 때 사용할 수 있음
//      (2) 자신의 주소(= 참조변수)를 반환할 수 있음
