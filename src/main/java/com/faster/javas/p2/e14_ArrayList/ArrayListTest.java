package com.faster.javas.p2.e14_ArrayList;

import com.faster.javas.p2.e12_ObjectArray_ShallowCopy.Book;

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


// ArrayList : 객체 배열을 좀 더 효율적으로 관리하기 위해 java.util에서 제공하는 클래스
//      -> 기존 배열 선언과 사용방식 : 배열의 길이를 정하고 엘리먼트의 개수가 배열의 길이보다 커지면 배열을 재할당 및 복사
//                              따라서 엘리먼트를 추가하거나 삭제 시, 이를 반영하여 다른 엘리먼트들의 이동이 필요했음
//      -> ArrayList의 사용방식 : 다음의 주요 메서드를 통해 손쉽게 최적 알고리즘으로 엘리먼트들을 제어
//                              1) boolean add(E e) : 엘리먼트 하나를 배열에 추가(E는 자료형)
//                              2) int size() : 배열 내 엘리먼트 전체 개수 반환
//                              3) E get(int index) : 배열 내 index 위치의 엘리먼트 반환
//                              4) E remove(int index) : 배열 내 index 위치의 엘리먼트 제거 맟 해당값 반환
//                              5) boolean isEmpty() : 빈배열인지 확인