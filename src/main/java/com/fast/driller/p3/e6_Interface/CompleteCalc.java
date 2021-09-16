package com.fast.driller.p3.e6_Interface;

public class CompleteCalc extends Calculator {
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 == 0) {
            return ERRPR;
        }
        return num1 / num2;
    }

    public String showInfo() {
        return "모두 구현했습니다.";
    }
}
