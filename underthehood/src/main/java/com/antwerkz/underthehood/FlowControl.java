package com.antwerkz.underthehood;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class FlowControl {
    public void forLoops() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println(i + j);
            }
        }
    }

/*
    public void forEachLoops(List<String> list) {
        for( String s : list) {
            System.out.println(s);
        }
    }
*/

/*
    public void ifBlocks(int x) {
        if (x <= 17) {
            System.out.println("yep");
        }
    }
*/

/*
    public void whileBlocks(int x) {
        while (x <= 17) {
            System.out.println(x);
        }
    }
*/

/*
    public void classicSwitch(int x) {
        switch (x) {
            case 1:
            case 2:
            case 3:
                System.out.println(x);
                break;
            case 4:
                System.out.println(x*2);
                break;
            case 5:
                System.out.println(x);
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }
*/

/*
    public void arrowSwitch(int x) {
        switch (x) {
            case 1, 2, 3 -> System.out.println(x);
            case 4 -> System.out.println(x*2);
            case 5 -> System.out.println(x);
            default -> throw new UnsupportedOperationException();
        }
    }
*/

/*
    public void switchExpression(int x) {
        var result = switch (x) {
            case 1, 2, 3 -> {
                yield 42;
            }
            case 4 -> {
                yield "what?";
            }
            case 5 -> {
                yield new AtomicInteger(42);
            }
            default -> throw new UnsupportedOperationException();
        };

    }
*/

/*
    public void stringSwitches(String solfege) {
        var result = switch (solfege) {
        case "do", "re", "mi" -> {
            yield 42;
        }
        case "fa", "so", "la" -> {
            yield "what?";
        }
        case "ti" -> {
            yield new AtomicInteger(42);
        }
        default -> throw new UnsupportedOperationException();
    };
}
*/
}
