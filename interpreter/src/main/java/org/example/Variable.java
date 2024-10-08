package org.example;

import java.util.Map;

public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return context.getOrDefault(name, 0);
    }
}
