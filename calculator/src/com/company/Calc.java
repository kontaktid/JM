package com.company;

public class Calc {
    private String data;

    public Calc (String data) {
        this.data = data;
    }

    private void replaceRomanDigits(){
        data = data.replaceAll("IX", "9");
        data = data.replaceAll("VIII", "8");
        data = data.replaceAll("VII", "7");
        data = data.replaceAll("VI", "6");
        data = data.replaceAll("V", "5");
        data = data.replaceAll("IV", "4");
        data = data.replaceAll("III", "3");
        data = data.replaceAll("II", "2");
        data = data.replaceAll("I", "1");
    }

    private boolean isValid() {
        data = data.replaceAll(" ", "");
        int signPosition = data.indexOf("+");
        String firstDigit = data.substring(0, signPosition);
        String secondDigit = data.substring(signPosition + 1);
        int first = Integer.valueOf(firstDigit);
        int second = Integer.valueOf(secondDigit);

        if (first > 10 & second > 10) {
            return false;
        }
        else {
            return true;
        }
    }



    public String getResult(){
        replaceRomanDigits();
        if (!isValid()){
            return "Введенное число больше 10";
        }

        data = data.replaceAll(" ", "");
        int signPosition = data.indexOf("+");
        String firstDigit = data.substring(0, signPosition);
        String secondDigit = data.substring(signPosition + 1);
        int first = Integer.valueOf(firstDigit);
        int second = Integer.valueOf(secondDigit);
        if (data.contains("+")){
            return String.valueOf(first + second);
        }
        else if (data.contains("-")){

        }
        else if (data.contains("*")){

        }
        else if (data.contains("/")){

        }

        return "Ok";
    }
}
