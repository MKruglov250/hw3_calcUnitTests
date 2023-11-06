package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {
    // addNumbers tests

    @Test
    void twoPlusTwoEqualsFour(){
        var calculator = new Calculator(); //Можно ли обратиться к классу напрямую? Calculator.addNumbers
        assertEquals(4, calculator.addNumbers(2,2));
    }

    @Test
    void threePlusSevenEqualsTen(){
        var calculator = new Calculator();
        assertEquals(10, calculator.addNumbers(3,7));
    }

    @Test
    void zeroPlusZeroEqualsZero(){
        var calculator = new Calculator();
        assertEquals(0, calculator.addNumbers(0,0));
    }

    @Test
    void twoPlusMinusOneEqualsOne(){
        var calculator = new Calculator();
        assertEquals(1, calculator.addNumbers(2,-1));
    }

    @Test
    void minusTwoPlusMinusOneEqualsMinusThree(){
        var calculator = new Calculator();
        assertEquals(-3, calculator.addNumbers(-2,-1));
    }

   // subtractNumbers tests

   @Test
    void twoMinusTwoEqualsZero(){
        var calculator = new Calculator();
        assertEquals(0, calculator.subtractNumbers(2,2));
    }

    @Test
    void tenMinusSevenEqualsThree(){
        var calculator = new Calculator();
        assertEquals(3, calculator.subtractNumbers(10,7));
    }

    @Test
    void treeMinusMinusSevenEqualsTen(){
        var calculator = new Calculator();
        assertEquals(10, calculator.subtractNumbers(3,-7));
    }

    @Test
    void minusTwoMinusMinusOneEqualsMinusOne(){
        var calculator = new Calculator();
        assertEquals(-1, calculator.subtractNumbers(-2,-1));
    }

    // Multiplication tests
    @Test
    void eightMultiplyThreeEqualsTwentyFour(){
        var calculator = new Calculator();
        assertEquals(24, calculator.multiplyNumbers(8,3));
    }

    @Test
    void twoMultiplyTwoEqualsFour(){
        var calculator = new Calculator();
        assertEquals(4, calculator.multiplyNumbers(2,2));
    }

    @Test
    void sevenMultiplyZeroEqualsZero(){
        var calculator = new Calculator();
        assertEquals(0, calculator.multiplyNumbers(7,0));
    }

    @Test
    void threeMultiplyOneEqualsThree(){
        var calculator = new Calculator();
        assertEquals(3, calculator.multiplyNumbers(3,1));
    }

    @Test
    void fiveMultiplyMinusThreeEqualsMinusFifteen(){
        var calculator = new Calculator();
        assertEquals(-15, calculator.multiplyNumbers(5,-3));
    }

    @Test
    void minusThreeMultiplyMinusTwoEqualsSix(){
        var calculator = new Calculator();
        assertEquals(6, calculator.multiplyNumbers(-3,-2));
    }

    // Division Tests

    @Test
    void twoDivideTwoEqualsOne(){
        var calculator = new Calculator();
        assertEquals(1, calculator.divideNumbers(2,2));
    }

    @Test
    void minusFourDivideMinusTwoEqualsTwo(){
        var calculator = new Calculator();
        assertEquals(2, calculator.divideNumbers(-4,-2));
    }

    @Test
    void zeroDivideThousandEqualsZero(){
        var calculator = new Calculator();
        assertEquals(0, calculator.divideNumbers(0,1000));
    }

    @Test
    void thousandDivideZeroReturnsErrorValue(){
        var calculator = new Calculator();
        assertEquals(-1, calculator.divideNumbers(1000,0));
    }

}