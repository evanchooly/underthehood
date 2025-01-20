package com.antwerkz.underthehood;

public class TopLevel {
    private String topLevelName;

    public class InnerClass {
        private String innerClassName;
    }
    public static class NestedClass {
        private String nestedClassName;
    }

    public static void main(String[] args) {
        var obj = new NestedClass();
    }
}
