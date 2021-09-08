package com.faster.javas.p2.e6_Encapsulation;

public class MakeReport {
    // String을 이어서 쓰는 것은 메모리를 많이 차지하는 방법이므로 Buffer를 활용한다
    StringBuffer buffer = new StringBuffer();

    // 클래스의 이용자가 굳이 몰라도 되는 것들은 private 선언을 통해 Encapsulation한다
    private String line = "==========================================\n";
    private String title = "  이름\t      주소 \t\t     전화번호    \n";

    // 리포트 구성 메서드(1)
    private void makeHeader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    // 리포트 구성 메서드(2)
    private void makeFooter() {
        buffer.append(line);
    }

    // 리포트 구성 메서드(3)
    private void generateBody() {
        buffer.append("James    \t");
        buffer.append("Seoul Korea  \t");
        buffer.append("010-1111-2222    \n");

        buffer.append("Tomas    \t");
        buffer.append("NewYork US   \t");
        buffer.append("010-9999-8888    \n");
    }

    // 리포트 출력 메서드 - public
    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();

        return buffer.toString();
    }
}
