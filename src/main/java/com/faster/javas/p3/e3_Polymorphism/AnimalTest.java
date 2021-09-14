package com.faster.javas.p3.e3_Polymorphism;

import java.util.ArrayList;

// 상위 클래스
class Animal {
    public void move() { System.out.println("동물이 움직입니다"); }
}

// 하위 클래스 1(휴먼)
class Human extends Animal {
    @Override
    public void move() { System.out.println("사람이 두 발로 걷습니다"); }
    public void readBook() { System.out.println("사람이 책을 읽어요"); }
}

// 하위 클래스 2(고랑이)
class Tiger extends Animal {
    @Override
    public void move() { System.out.println("호랑이가 네 발로 걷습니다"); }
    public void hunt() { System.out.println("호랑이가 사냥을 해요"); }
}

// 하위 클래스 3(수리수리)
class Eagle extends Animal {
    @Override
    public void move() { System.out.println("독수리가 날개짓을 합니다"); }
    public void dive() { System.out.println("독수리가 활강을 해요"); }
}

// main함수
public class AnimalTest {
    public static void main(String[] args) {
        // 형 변환(up-casting)을 활용한 인스턴스 생성
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        // 다형성 테스트
        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);

        // 다형성 테스트 결과증명
        // 상속(extends) 및 재정의(override)한 각 인스턴스의 메서드들과 결과 동일할까?
        // Yes!
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);
        for(Animal animal : animalList) {
            animal.move();
        }
    }

    // 여러 하위 클래스들이 함께 사용할, 다형성(polymorphism) 구현 메서드
    public void moveAnimal(Animal animal) {
        animal.move();
    }

//    사람이 두 발로 걷습니다
//    호랑이가 네 발로 걷습니다
//    독수리가 날개짓을 합니다
}