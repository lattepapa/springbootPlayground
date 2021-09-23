package com.fast.driller.p3.wrapup1.test2Schedule;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담원 할당 방식을 입력하세요.\n* R: 한명씩 차례대로\n* L: 여유상담원 우선\n* V: 고객등급 우선\n==>");

        // 입력값을 ASCII로 받는다
        int option = System.in.read();
        Scheduler scheduler = null;

        // char를 ASCII로 자동 캐스트하려면 Single Quote를 사용해야 한다
        switch (option) {
            case 'R' :
            case 'r' :
                scheduler = new RoundRobin();
                break;
            case 'L' :
            case 'l' :
                scheduler = new LeastAllocation();
                break;
            case 'V' :
            case 'v' :
                scheduler = new VIPAllocation();
                break;
            default :
                System.out.println("지원하지 않는 기능입니다.");
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
