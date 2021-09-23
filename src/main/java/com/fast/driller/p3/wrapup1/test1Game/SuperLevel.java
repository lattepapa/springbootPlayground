package com.fast.driller.p3.wrapup1.test1Game;

public class SuperLevel extends PlayerLevel {
    // PlayerLevel에서 제공하는 Abstract 메서드 가공
    @Override
    public void run() {
        System.out.println("[패시브]달리기3");
    }

    @Override
    public void jump() {
        System.out.println("[패시브]점프3");
    }

    @Override
    public void turn() {
        System.out.println("[패시브]방향전환3");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 고급레벨입니다. ******");
    }

    // PlayerLevel에서 제공하는 Hook 메서드 가공
    @Override
    public void attack() {
        System.out.println("[스킬]공격");
    }
}
