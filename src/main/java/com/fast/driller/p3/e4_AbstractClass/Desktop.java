package com.fast.driller.p3.e4_AbstractClass;

public class Desktop extends Computer {
    @Override
    public void display() {
        System.out.println("데스크탑 화면");
    }

    @Override
    public void typing() {
        System.out.println("데스크탑 키보드 타이핑");
    }

    @Override
    public void turnOff() {
        System.out.println("데스크탑 전원 off");
    }
}
