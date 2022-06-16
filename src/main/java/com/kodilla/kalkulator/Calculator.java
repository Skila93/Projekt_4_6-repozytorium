package com.kodilla.kalkulator;

public class Calculator {
    void addNumbers(int a, int b) {
        int result = a + b;
        System.out.println("Outcome of adding numbers " + a + " and " + b + ": " + result);
    }
    void substractNumbers(int a, int  b){
        int result = a - b;
        System.out.println("Outcome of substracting numbers " + a + " and " + b + ": " + result);
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
                calculator.addNumbers(5, 7);
                calculator.substractNumbers(49,5);
    }
}

