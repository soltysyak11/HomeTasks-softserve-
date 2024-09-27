package com.softserve.edu15.pt.task2;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(() -> {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        });
        var t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the World");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is Oleh");
    }
}

