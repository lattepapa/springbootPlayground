package com.faster.javas.p2.e11_StaticVariable;

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

// static 변수 : 인스턴스가 생성될 때가 아닌, 처음 프로그램이 메모리에 로딩(=on thread)될 때 메모리에 할당되는 변수(=클래스변수 또는 정적변수)
//              -> 인스턴스 생성과 상관없이 사용가능하므로 보통 클래스 이름으로 직접 참조한다.
//                  (ex) {클래스명}.{static 변수} 꼴로 바로 해당 변수값 호출 가능
//              -> 여러 인스턴스들이 공유할 수 있는 기준값으로 쓸 때 유용하다.
//                  (ex) 학생마다 신규학번 생성, 카드회사마다 신규카드번호 생성 등
//                      -> 새 인스턴스를 생성하면서 학번(속성)이 새로 발급되었다면,
//                          다음 새 인스턴스는 이 학번을 기준으로 새로 학번을 발급해야 함