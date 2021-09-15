package com.faster.javas.p3.e5_TemplateMethod;

public class CarTest {
    public static void main(String[] args) {
        Car modelS = new ModelS();
        modelS.run();
        //    엔진 Start!
        //    Tesla AI Self Driving start
        //    Found 2 ways
        //    Found pedestrian!!
        //    엔진 Stop.

        Car trailblazer = new Trailblazer();
        trailblazer.run();
        //    엔진 Start!
        //    기어 D에서 자동변속 후 가속
        //    전방 교차로가 보인다
        //    브레이크 패들을 밟아 정지
        //    엔진 Stop.
        //    아이나비 2ch 블랙박스를 시작합니다.
    }
}
