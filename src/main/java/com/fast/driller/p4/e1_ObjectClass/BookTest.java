package com.fast.driller.p4.e1_ObjectClass;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Object 클래스 중 String의 toString() 메서드를 overriding
    public String toString() {
        return title + ", " + author;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("데미안", "헤르만 헤세");
        System.out.println(book);
        //    com.fast.driller.p4.e1_ObjectClass.Book@3941a79c
        //    데미안, 헤르만 헤세  =>  위에서 String 클래스의 toString() 메서드를 overriding 하면!

        String str = new String("데미안");
        System.out.println(str);
        //    데미안

        System.out.println(book.toString());
        //    데미안, 헤르만 헤세

        System.out.println(str.toString());
        //    데미안
    }
}
