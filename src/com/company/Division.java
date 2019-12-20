package com.company;

public class Division implements Operation {
    @Override
    public void calculate(int a, int b) {
        System.out.println((a/b));
    }
}
