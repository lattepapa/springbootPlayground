package com.fast.driller.p3.e4_AbstractClass;

public class ComputerTest {
    public static void main(String[] args) {
        Computer desktop = new Desktop();
        // 추상 클래스는 new 키워드로 인스턴스를 생성할 수 없다.
        // 추상 클래스는 오직 상속을 위해 존재한다.
        // Computer computer = new Computer();
    }
}
