package com.fast.driller.p3.e9_InterfaceInherritance;

public interface Sell {
    // 기본 메서드
    void sell();

    // Default 메서드
    default void order() {
        System.out.println("Sell It!!!");
    }
}
