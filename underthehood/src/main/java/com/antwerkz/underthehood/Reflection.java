package com.antwerkz.underthehood;

public class Reflection {
    private String name;

    public String getName() {
        return name;
    }

    public static void main(String[] args) throws ReflectiveOperationException {
        Class<Reflection> aClass = Reflection.class;
        var method = aClass.getDeclaredMethod("getName");

    }
}
