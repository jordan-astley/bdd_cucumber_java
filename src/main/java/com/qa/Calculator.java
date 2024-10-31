package com.qa;


import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Calculator {

    private final Deque<Number> stack = new LinkedList<>();
    private static final List<String> OPERATORS = List.of("+", "-", "*", "/");

    public void push(Object a) {
        if (OPERATORS.contains(a)) {
            Number y = stack.removeLast();
            Number x = stack.removeLast();
            Double ans = null;

            switch (String.valueOf(a)) {
                case "+":
                    ans = x.doubleValue() + y.doubleValue();
                case "-":
                    ans = x.doubleValue() - y.doubleValue();
                case "*":
                    ans = x.doubleValue() * y.doubleValue();
                case "/":
                    if (y.doubleValue() != 0) {
                        ans = x.doubleValue() / y.doubleValue();
                    } else if (x.doubleValue() < 0) {
                        ans = Double.NEGATIVE_INFINITY;
                    } else {
                        ans = Double.POSITIVE_INFINITY;
                    }
            }
            push(ans);
        }
        else {
            stack.add((Number) a);
        }
    }

    public Number value() {
        return stack.getLast();
    }
}
