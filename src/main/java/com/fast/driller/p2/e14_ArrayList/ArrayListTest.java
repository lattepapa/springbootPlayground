package com.fast.driller.p2.e14_ArrayList;

import com.fast.driller.p2.e12_ObjectArray_ShallowCopy.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // 기 생성한 Book 클래스와 ArrayList 클래스를 import
        ArrayList<Book> library = new ArrayList<>();

        // ArrayList 클래스의 add 메서드를 사용할 경우 반드시 클래스 생성자를 인자에 포함시켜야 한다.
        library.add(new Book("스프링 마이크로서비스 코딩 공작소", "존 카넬"));
        library.add(new Book("토비의 스프링 3.1", "이일민"));
        library.add(new Book("스위프트 프로그래밍", "야곰"));
        library.add(new Book("프로그래밍 대회에서 배우는 알고리즘 문제 해결 전략 세트", "구종만"));

        // ArrayList 클래스의 size 메서드, get 메서드를 사용
        for(int i = 0; i < library.size(); i++) {
            library.get(i).showInfo();
        }
    }

//    스프링 마이크로서비스 코딩 공작소, 존 카넬
//    토비의 스프링 3.1, 이일민
//    스위프트 프로그래밍, 야곰
//    프로그래밍 대회에서 배우는 알고리즘 문제 해결 전략 세트, 구종만
}
