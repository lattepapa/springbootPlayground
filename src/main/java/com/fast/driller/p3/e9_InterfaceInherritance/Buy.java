package com.fast.driller.p3.e9_InterfaceInherritance;

public interface Buy {
    // 기본 메서드
    void buy();

    // Default 메서드
    default void order() {
        System.out.println("Buy Order!");
    }
}
