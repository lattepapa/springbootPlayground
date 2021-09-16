package com.fast.driller.p2.e9_StaticVariable;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");
        System.out.println(employeeLee.getSerialNum()); // 1001

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeId()); // 1001
        System.out.println(employeeKim.getEmployeeId()); // 1002
    }
}
