package com.hfad.unit_testing_task

import org.junit.Assert.*
import org.junit.Test

class CalculationTest{
    private val calculation = Calculation()

    /*
    A test that simply test for proper addition of 2 numbers
     */
    @Test
    fun testAddition(){

        val result = calculation.addition(5, 5)
        assertEquals(10, result) //expected result, actual result
    }

    /*
    A test that adds adds one negative number and one positive number
     */
    @Test
    fun testAdditionWithNegativeNumber(){
        val actualResult = calculation.addition(-3, 5)
        val actualResult2 = calculation.addition(100,-50)
        val actualResult3 = calculation.addition(-8,-6)

        assertEquals(2, actualResult)
        assertEquals(50, actualResult2)
        assertEquals(-14, actualResult3)
    }

    /*
    A ttest that adds 2 numbers where 1 digit is a zero
     */
    @Test
    fun testAdditionWithZeroes(){
        val actualResult = calculation.addition(0,4)
        val actualResult2 = calculation.addition(522,0)
        val actualResult3 = calculation.addition(0,0)

        assertEquals(4, actualResult)
        assertEquals(522, actualResult2)
        assertEquals(0, actualResult3)
    }

    /*
    Testing basic subtraction between 2 numbers
     */
    @Test
    fun testSubtraction(){
        val actualResult = calculation.subtraction(400,4)
        assertEquals(396, actualResult)
    }

    //Squared of a basic number
    @Test
    fun testSquared(){
        val actualResult = calculation.squared(6)
        assertEquals(actualResult, 36)
    }

    //Test the square of 0
    @Test
    fun testSquaredZero(){
        val actualResult = calculation.squared(0)
        assertEquals(actualResult,0)
    }

    //Test of a negative number squared
    @Test
    fun testSquaredNegativeNumber(){
        val actualResult = calculation.squared(-9)
        assertEquals(actualResult, 81)
    }

}