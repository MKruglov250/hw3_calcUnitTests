package org.example;

public class Calculator {

    public String name;
    private static final int OUR_CONSTANT = 1;


//    public static void main(String[] args){
//        Calculator calculator = new Calculator();
//        int res = calculator.divideNumbers(1000,0);
//        if (res == -1){
//            ; // Do nothing if division result is 0 (-1 returned)
//        } else {
//            System.out.println("Division result is: " + res);
//        }
//        res = calculator.addNumbers(100,500);
//        System.out.println("Addition result is: " + res);
//        res = calculator.subtractNumbers(43,33);
//        System.out.println("Subtraction result is: " + res);
//        res = calculator.multiplyNumbers(100,500);
//        System.out.println("Multiplication result result is: " + res);
//        res = calculator.divideNumbers(100,20);
//        if (res == -1){
//            System.out.println("Error: division by zero occured");
//        } else {
//            System.out.println("Second division result is: " + res);
//        }

    //    }
    public static int addNumbers(int Number1, int Number2) {
        return Number1 + Number2;
    }

    public static int subtractNumbers(int Number1, int Number2) {
        return Number1 - Number2;
    }

    public static int multiplyNumbers(int Number1, int Number2) {
        return Number1 * Number2;
    }

    public static int divideNumbers(int Number1, int Number2) throws ArithmeticException {
        try {
            return Number1 / Number2;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }
}