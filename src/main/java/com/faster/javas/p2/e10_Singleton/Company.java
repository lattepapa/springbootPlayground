package com.faster.javas.p2.e10_Singleton;

public class Company {
    // 유일하게 클래스 본연 그대로를 담은 "instance" 인스턴스만 존재해야 한다.
    // 클래스 안에서만 그 실체("instance") 속사정을 알 수 있어야 하므로 private
    // 추후 생성될 수 있는 것이 아닌, 메모리에 처음부터 있어야 하므로 static
    private static Company instance = new Company();

    // 클래스를 함부로 외부에서 그 실체를 본딸 수 없도록 생성자는 private
    private Company() {}

    // 회사의 실체("instance")는 오직 하나의 채널(메서드)로만 외부인사가 볼 수 있어야 한다.
    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}

// 싱글톤패턴(Singleton) : 프로그램에서 인스턴스가 단 한개(즉, 유일객체)만 생성되어야 하는 경우 사용되는 디자인패턴
//                      (1) 생성자는 private으로 선언
//                      (2) 클래스 내부에 유일한 private 인스턴스 생성
//                      (3) 클래스 외부에서 유일한 인스턴스를 참조할 수 있는 public 메서드 제공
//  (ex) 싱글톤패턴의 예 : 회사에 대한 클래스 -> 계열사는 여러 다양한 법인이 존재할 수 있어도, 지주사(클래스)는 단 한개만 존재해야 한다
