package org.example;

public class Calculator {

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int res = calculator.divideNumbers(1000,0);
        System.out.println("Result is: " + res);
    }
    public int addNumbers(int Number1, int Number2){
        return Number1 + Number2;
    }

    public int subtractNumbers(int Number1, int Number2){
        return Number1 - Number2;
    }

    public int multiplyNumbers(int Number1, int Number2){
        return Number1 * Number2;
    }

    public int divideNumbers(int Number1, int Number2) throws ArithmeticException {
        try {
            return Number1 / Number2;
            }
        catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                return -1;
            }
    }
}