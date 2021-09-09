package com.faster.javas.p2.e12_ObjectArray_ShallowCopy;

public class Book {
    // 속성
    private String title;
    private String author;

    // 생성자
    public Book() {}
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter & Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // 메서드
    public void showInfo() {
        System.out.println(title + ", " + author);
    }
}

// 객체 배열 : 배열은 선언과 동시에 각 엘리먼트마다 4byte씩 할당받지만, 객체 배열은 엘리먼트(객체)가 들어갈 메모리 주소만 할당만 된다.
//          -> 즉, Class[] objArr = new Class[length]; 로 객체 배열을 만들어도
//              일단 해당 객체 배열의 엘리먼트들은 null값이므로, 해당 엘리먼트들에 대한 초기화가 필요하다. 즉,
//              objArr[index] = new Class(args, args, ...); 로 하나씩 값을 초기화해야 한다.