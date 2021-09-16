package com.fast.driller.p3.e5_TemplateMethod;

public abstract class Car {
    // 추상 클래스 추상 메서드 : 하위 클래스에서 자유 활용
    public abstract void drive();
    public abstract void stop();

    // 추상 클래스 기본제공 메서드
    public void engineStart() {
        System.out.println("엔진 Start!");
    }
    public void engineStop() {
        System.out.println("엔진 Stop.");
    }

    // 추상 클래스 훅(Hook) 메서드 : 하위 클래스에서 필요 시 활용
    public void blackBoxInit() {}

    // 고정 시나리오 : 하위 클래스 모두 동일패턴
    final public void run() {
        engineStart();
        drive();
        stop();
        engineStop();
        blackBoxInit();
    }
}
