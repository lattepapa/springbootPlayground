package com.fast.driller.p2.e5_AccessModifier_InformationHiding;

public class Birthday {
    // 속성은 private 키워드로 선언함으로써, 외부에서 해당 속성값을 오용하는 경우를 방지한다
    private int day;
    private int month;
    private int year;
    private boolean isValid;

    // 메서드(set)들을 통해 인스턴스가 자신의 속성값에 한하여 제어할 수 있게 한다
    public int getDay() { return day; }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() { return month; }
    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public void showDate() {
        if(isValid) { System.out.println(year + "년 " + month + "월 " + day + "일"); }
        else { System.out.println("유효하지 않은 날짜입니다"); }
    }
}
