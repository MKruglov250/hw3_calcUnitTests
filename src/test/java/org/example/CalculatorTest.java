package org.example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {
    @BeforeClass
    public void before(){
         var calculator = new Calculator();
    }

    @Test
    void twoPlusTwoEqualsFour(){
         //Можно ли обратиться к классу напрямую? Calculator.addNumbers
        assertEquals(4, Calculator.addNumbers(2,2));
    }

    @Test
    void threePlusSevenEqualsTen(){
        
        assertEquals(10, Calculator.addNumbers(3,7));
    }

    @Test
    void zeroPlusZeroEqualsZero(){
        
        assertEquals(0, Calculator.addNumbers(0,0));
    }

    @Test
    void twoPlusMinusOneEqualsOne(){
        
        assertEquals(1, Calculator.addNumbers(2,-1));
    }

    @Test
    void minusTwoPlusMinusOneEqualsMinusThree(){
        
        assertEquals(-3, Calculator.addNumbers(-2,-1));
    }

   // subtractNumbers tests

   @Test
    void twoMinusTwoEqualsZero(){
        
        assertEquals(0, Calculator.subtractNumbers(2,2));
    }

    @Test
    void tenMinusSevenEqualsThree(){
        
        assertEquals(3, Calculator.subtractNumbers(10,7));
    }

    @Test
    void treeMinusMinusSevenEqualsTen(){
        
        assertEquals(10, Calculator.subtractNumbers(3,-7));
    }

    @Test
    void minusTwoMinusMinusOneEqualsMinusOne(){
        
        assertEquals(-1, Calculator.subtractNumbers(-2,-1));
    }

    // Multiplication tests
    @Test
    void eightMultiplyThreeEqualsTwentyFour(){
        
        assertEquals(24, Calculator.multiplyNumbers(8,3));
    }

    @Test
    void twoMultiplyTwoEqualsFour(){
        
        assertEquals(4, Calculator.multiplyNumbers(2,2));
    }

    @Test
    void sevenMultiplyZeroEqualsZero(){
        
        assertEquals(0, Calculator.multiplyNumbers(7,0));
    }

    @Test
    void threeMultiplyOneEqualsThree(){
        
        assertEquals(3, Calculator.multiplyNumbers(3,1));
    }

    @Test
    void fiveMultiplyMinusThreeEqualsMinusFifteen(){
        
        assertEquals(-15, Calculator.multiplyNumbers(5,-3));
    }

    @Test
    void minusThreeMultiplyMinusTwoEqualsSix(){
        
        assertEquals(6, Calculator.multiplyNumbers(-3,-2));
    }

    // Division Tests

    @Test
    void twoDivideTwoEqualsOne(){
        
        assertEquals(1, Calculator.divideNumbers(2,2));
    }

    @Test
    void minusFourDivideMinusTwoEqualsTwo(){
        
        assertEquals(2, Calculator.divideNumbers(-4,-2));
    }

    @Test
    void zeroDivideThousandEqualsZero(){
        
        assertEquals(0, Calculator.divideNumbers(0,1000));
    }

    @Test
    void thousandDivideZeroReturnsErrorValue(){
        
        assertEquals(-1, Calculator.divideNumbers(1000,0));
    }

}