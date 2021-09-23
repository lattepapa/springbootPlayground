package com.fast.driller.p3.wrapup1.test2Schedule;

public class VIPAllocation implements Scheduler {
    // 두번째 콜 배정 방식 - VIP 콜일 경우 숙련자에게 배정
    @Override
    public void getNextCall() {
        System.out.println("등급이 높은 고객의 콜을 먼저 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 숙련도가 높은 상담원에게 먼저 배정합니다.");
    }
}
