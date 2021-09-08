package com.faster.javas.p2.e12_Singleton;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        // getInstance()라는 문의채널로만 회사의 속사정(instance) 정보를 열람했으므로
        // JVM이 할당한 힙 주소는 둘다 동일할 수 밖에 없다.
        System.out.println(company1); // com.faster.javas.p2.e12_Singleton.Company@2a139a55
        System.out.println(company2); // com.faster.javas.p2.e12_Singleton.Company@2a139a55
    }
}
