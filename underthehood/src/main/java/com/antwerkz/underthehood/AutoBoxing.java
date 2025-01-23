package com.antwerkz.underthehood;

public class AutoBoxing {
    public static long math(long a, long b) {
//    public static Long math(Long a, long b) {
        return a + b;
    }

    public static void demo(long a, long b) {
//    public static void demo(long a, Long b) {
        long sum =
//        Long sum =
            math(a, b);
    }
}
