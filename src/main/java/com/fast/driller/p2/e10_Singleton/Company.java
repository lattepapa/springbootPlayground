package com.fast.driller.p2.e10_Singleton;

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
