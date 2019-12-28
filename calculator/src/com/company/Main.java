package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        Calc calculator = new Calc(a);
        String result = calculator.getResult();
        System.out.println(result);
    }
}
