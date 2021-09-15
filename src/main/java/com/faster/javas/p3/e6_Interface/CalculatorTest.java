package com.faster.javas.p3.e6_Interface;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10, num2 = 2;
        Calc calc = new CompleteCalc();
        System.out.println("** Calc 인터페이스로 구현한 경우 **" + "\ncalc.add = " + calc.add(num1, num2) + "\ncalc.substract = " + calc.substract(num1, num2) + "\ncalc.times = " + calc.times(num1, num2) + "\ncalc.divide = " + calc.divide(num1, num2));
        //    ** Calc 인터페이스로 구현한 경우 **
        //    calc.add = 12
        //    calc.substract = 8
        //    calc.times = 20
        //    calc.divide = 5

        CompleteCalc msg = new CompleteCalc();
        System.out.println("** CompleteCalc 클래스로 상속한 경우 **" + "\nmsg.add = " + msg.add(num1, num2) + "\nmsg.substract = " + msg.substract(num1, num2) + "\nmsg.times = " + msg.times(num1, num2) + "\nmsg.divide = " + msg.divide(num1, num2) + "\n" + msg.showInfo());
        //    ** CompleteCalc 클래스로 상속한 경우 **
        //    msg.add = 12
        //    msg.substract = 8
        //    msg.times = 20
        //    msg.divide = 5
        //    모두 구현했습니다.
    }
}
