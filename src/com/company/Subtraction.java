package com.company;

public class Subtraction implements Operation  {
    @Override
    public void calculate(int a, int b) {
        System.out.println((a - b));
    }
}
