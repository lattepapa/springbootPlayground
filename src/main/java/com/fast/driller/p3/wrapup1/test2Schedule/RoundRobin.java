package com.fast.driller.p3.wrapup1.test2Schedule;

public class RoundRobin implements Scheduler {
    // FIFO(Queue) 방식의 스케쥴링을 위한 기본세팅
    @Override
    public void getNextCall() {
        System.out.println("인입 콜들을 대기열에서 순서대로 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서의 대기상담원에게 콜을 배정합니다.");
    }
}
