package com.faster.javas.p2.e9_StaticVariable;

public class Employee {
    // 클래스변수
    private static int serialNum = 1000;

    // 속성
    private int employeeId;
    private String employeeName;
    private String department;

    // 생성자
    // -> 인스턴스가 생성될 때마다 클래스변수를 활용하여 속성값 employeeId을 최신화
    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }

    // Getter and Setter
    public static int getSerialNum() {
        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
