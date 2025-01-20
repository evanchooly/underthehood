package com.antwerkz.underthehood;

public class Lambdas {
    private static final String HELLO = "Hello";
    public static void main(String args[]) throws Exception {
        Runnable r = () -> System.out.println(HELLO);
        Thread t = new Thread(r);

        t.start();
        t.join();
//
//        int x = 23;
//        Runnable runnable = () -> System.out.println(x);
//        System.out.println(x);
//        x= 42;
    }

}