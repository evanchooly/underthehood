package com.antwerkz.underthehood;

import com.antwerkz.underthehood.patternmatching.Triangle;

public class PatternMatching {
        public void guardedPatterns(Object obj) {
            switch (obj) {
                case String s when s.length() == 1 -> System.out.println("Short: " + s);
                case String s -> System.out.println(s);
                //                case null -> throw new UnsupportedOperationException();
                default -> System.out.println("Not a string");
            }
        }

/*
    public void recordPatterns(Triangle<Integer, Integer, Integer> triangle) {
        switch (triangle) {
            case null -> throw new UnsupportedOperationException();
            case Triangle(var h, var b, var hyp) -> System.out.printf("h = %s, b = %s, hyp = %s\n", h, b, hyp);
        }
    }
*/
}
