package com.company;

import java.util.Scanner;

public class Application {
    private int a;
    private int b;
    private Scanner scanner = new Scanner(System.in);

    public void run() {
//        System.out.println("Калькулятор");
        while (true) {

            a = scanner.nextInt();

            showMenu();
            int number = scanner.nextInt();
            if (number == 0 & number > 10) {
                System.out.println("Выход");
                break;
            }
            Operation operation = getOperation(number);
            operation.calculate(a,b);
            System.out.println();

            b = scanner.nextInt();

        }
    }

    private Operation getOperation(int number) {
        switch (number) {
            case 1:
                return new Addition();
            case 2:
                return new Subtraction();
            case 3:
                return new Multiplication();
            case 4:
                return new Division();
        }
        return null;
    }

    private void showMenu(){
        System.out.println("Выберите операцию");
        System.out.println("1 - ");
        System.out.println("2 + ");
        System.out.println("3 * ");
        System.out.println("4 / ");
        System.out.println("0 - Exit.");
    }
}