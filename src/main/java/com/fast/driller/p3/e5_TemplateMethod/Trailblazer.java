package com.fast.driller.p3.e5_TemplateMethod;

public class Trailblazer extends Car {
    @Override
    public void drive() {
        System.out.println("기어 D에서 자동변속 후 가속");
        System.out.println("전방 교차로가 보인다");
    }

    @Override
    public void stop() {
        System.out.println("브레이크 패들을 밟아 정지");
    }

    @Override
    public void blackBoxInit() {
        System.out.println("아이나비 2ch 블랙박스를 시작합니다.");
    }
}
