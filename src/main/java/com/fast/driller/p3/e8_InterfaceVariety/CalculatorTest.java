package com.fast.driller.p3.e8_InterfaceVariety;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
        //    12
        //    8
        //    20
        //    5

        calc.description();
        //    CompleteCalc overriding

        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));
        //    15
    }
}
