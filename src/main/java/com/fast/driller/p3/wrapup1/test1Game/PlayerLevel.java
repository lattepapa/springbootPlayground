package com.fast.driller.p3.wrapup1.test1Game;

public abstract class PlayerLevel {
    // 기본 메서드
    public void init() {
        System.out.println("캐릭터 액션시작");
    }

    public void terminate() {
        System.out.println("캐릭터 액션종료");
    }

    // 제공되는 Abstract 메서드
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    // 제공되는 Hook 메서드
    public void attack() {}

    // 고정 시나리오
    final public void go(int count) {
        init();
        run();
        for(int i = 0; i < count; i++) {
            jump();
        }
        attack();
        turn();
        terminate();
    }
}
