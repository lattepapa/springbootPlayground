package com.fast.driller.p3.wrapup1.test2Schedule;

public class LeastAllocation implements Scheduler {
    // 첫번째 콜 배정 방식 - 잉여 상담원에게 배정
    @Override
    public void getNextCall() {
        System.out.println("인입 콜들을 대기열에서 순서대로 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("현재 상담업무가 없거나 상담대기가 가장 적은 상담원에게 콜을 배정합니다");
    }
}
