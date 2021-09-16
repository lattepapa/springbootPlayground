package com.fast.driller.p2.e12_ObjectArray_ShallowCopy;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("묵향", "전동조");
        library[1] = new Book("퇴마록", "이우혁");
        library[2] = new Book("신조협려", "김용");
        library[3] = new Book("월야환담", "홍정훈");
        library[4] = new Book("싸드", "김진명");

        System.arraycopy(library, 0, copyLibrary, 0, 5);
        library[4].setAuthor("니체");
        library[4].setTitle("짜라스투라는 말했다");

        System.out.println("== library ==");
        for(Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("== copyLibrary ==");
        for(Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }

//        == library ==
//        com.faster.javas.p2.e12_ObjectArray_ShallowCopy.Book@2a139a55 묵향, 전동조
//        com.faster.javas.p2.e12_ObjectArray_ShallowCopy.Book@15db9742 퇴마록, 이우혁
//        com.faster.javas.p2.e12_ObjectArray_ShallowCopy.Book@6d06d69c 신조협려, 김용
//        com.faster.javas.p2.e12_ObjectArray_ShallowCopy.Book@7852e922 월야환담, 홍정훈
//        com.faster.javas.p2.e12_ObjectArray_ShallowCopy.Book@4e25154f 짜라스투라는 말했다, 니체
//        == copyLibrary ==
//        com.faster.javas.p2.e12_ObjectArray_ShallowCopy.Book@2a139a55 묵향, 전동조
//        com.faster.javas.p2.e12_ObjectArray_ShallowCopy.Book@15db9742 퇴마록, 이우혁
//        com.faster.javas.p2.e12_ObjectArray_ShallowCopy.Book@6d06d69c 신조협려, 김용
//        com.faster.javas.p2.e12_ObjectArray_ShallowCopy.Book@7852e922 월야환담, 홍정훈
//        com.faster.javas.p2.e12_ObjectArray_ShallowCopy.Book@4e25154f 짜라스투라는 말했다, 니체
    }
}
