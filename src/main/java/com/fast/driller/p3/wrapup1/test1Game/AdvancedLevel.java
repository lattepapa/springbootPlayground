package com.fast.driller.p3.wrapup1.test1Game;

public class AdvancedLevel extends PlayerLevel {
    // PlayerLevel에서 제공하는 Abstract 메서드 가공
    @Override
    public void run() {
        System.out.println("[패시브]달리기2");
    }

    @Override
    public void jump() {
        System.out.println("[패시브]점프2");
    }

    @Override
    public void turn() {
        System.out.println("[패시브]방향전환2");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 중급레벨입니다. ******");
    }
}
