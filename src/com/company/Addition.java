package com.company;

public class Addition implements Operation {
    @Override
    public void calculate(int a, int b) {
        System.out.println((a + b));
    }
}


