package com.fast.driller.p3.wrapup1.test1Game;

public class Player {
    // 속성
    // -> Abstract 클래스인 PlayerLevel을 타입으로 하여 생성
    // -> 이를 통해 이 PlayerLevel을 상속받는 클래스들의 각 메서드 활용 가능해짐
    private PlayerLevel level;

    // 생성자
    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    // 메서드
    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }
}
