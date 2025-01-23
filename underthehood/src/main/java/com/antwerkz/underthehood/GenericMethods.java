package com.antwerkz.underthehood;

import java.util.function.Consumer;

public class GenericMethods implements Consumer<String> {
    public static void main(String[] args) {
        GenericMethods methods = new GenericMethods();
        methods.accept("how you doin'?");
    }

    @Override
    public void accept(String s) {
        System.out.println(s);
    }

/*
    public <T extends BasicClass> void something(T t) {
        System.out.println(t);
    }
*/
}
