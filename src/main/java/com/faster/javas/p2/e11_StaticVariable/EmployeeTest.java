package com.faster.javas.p2.e11_StaticVariable;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");
        System.out.println(employeeLee.serialNum); // 1000

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        employeeKim.serialNum++;
        System.out.println(employeeLee.getEmployeeId()); // 1001
        System.out.println(employeeKim.getEmployeeId()); // 1002
    }
}

// 메모리 사용 와꾸
// 데이터영역                스택                          힙
// serialNum        studentLee(메인함수가 호출)    studentLee(인스턴스)
//                  studentKim(메인함수가 호출)    studentKim(인스턴스)
