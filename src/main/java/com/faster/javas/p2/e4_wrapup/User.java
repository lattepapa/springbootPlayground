package com.faster.javas.p2.e4_wrapup;

public class User {
    // 속성(멤버변수)
    public String userName;
    public int userHeight;
    public int userWeight;
    public int userAge;

    // 매개변수 생성자
    public User(
            String userName,
            int userHeight,
            int userWeight,
            int userAge
    ) {
        this.userName = userName;
        this.userHeight = userHeight;
        this.userWeight = userWeight;
        this.userAge = userAge;
    }
    public User() {}

    // 메서드
    public void getUserInfo() {
        System.out.println("키가 " + userHeight + "cm이고 몸무게가 " + userWeight + "kg인 남성이 있다. 이름은 " + userName + ", 나이는 " + userAge + "세이다.");
    }
}
