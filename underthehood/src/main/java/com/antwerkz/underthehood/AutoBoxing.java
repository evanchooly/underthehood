package com.antwerkz.underthehood;

public class AutoBoxing {
    public long math(long a, long b) {
//    public Long math(Long a, long b) {
        return a + b;
    }

    public void demo() {
        math(42, 2);
//        math(42L, 2);
//        math(Integer.valueOf(42), 2);
//        math(Long.valueOf(42), 2);
    }
}
