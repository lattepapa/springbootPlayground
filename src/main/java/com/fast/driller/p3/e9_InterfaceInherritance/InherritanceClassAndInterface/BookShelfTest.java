package com.fast.driller.p3.e9_InterfaceInherritance.InherritanceClassAndInterface;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("책1");
        bookQueue.enQueue("책2");
        bookQueue.enQueue("책3");
        bookQueue.enQueue("책4");
        bookQueue.enQueue("책5");

        System.out.println(bookQueue.getSize());
        //    5
        System.out.println(bookQueue.deQueue());
        //    책1
        System.out.println(bookQueue.deQueue());
        //    책2
        System.out.println(bookQueue.deQueue());
        //    책3
        System.out.println(bookQueue.deQueue());
        //    책4
        System.out.println(bookQueue.deQueue());
        //    책5
        System.out.println(bookQueue.getSize());
        //    0
    }
}
