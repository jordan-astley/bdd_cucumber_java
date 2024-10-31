package com.qa;


import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Calculator {

    private final Deque<Number> stack = new LinkedList<>();
    private static final List<String> OPERATORS = List.of("+");

    public void push(Object a) {
        if (OPERATORS.contains(a)) {
            Number y = stack.removeLast();
            Number x = stack.removeLast();
            Double ans = null;

            ans = x.doubleValue() + y.doubleValue();
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
