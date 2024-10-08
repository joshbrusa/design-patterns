package org.example;

import java.util.Map;

public class Interpreter {
    /**
     * example: (a + b) + 5, where a = 2 and b = 3
     */
    public static void main(String[] args) {
        Expression a = new Variable("a");
        Expression b = new Variable("b");
        Expression five = new Number(5);

        Expression plusExpression = new Plus(new Plus(a, b), five);

        Map<String, Integer> context = Map.of("a", 2, "b", 3);

        int result = plusExpression.interpret(context);
        System.out.println("Result: " + result);
    }
}