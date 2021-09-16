package com.fast.driller.p2.e12_ObjectArray_ShallowCopy;

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
