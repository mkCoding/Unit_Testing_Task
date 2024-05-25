package com.hfad.unit_testing_task

import org.junit.Assert.*
import org.junit.Test

class CalculationTest{
    val calculation = Calculation()

    @Test
    fun testAddition(){

        val result = calculation.addition(5, 5)

        assertEquals(10, result) //expected result, actual result
    }

    @Test
    fun testAdditionWithNegativeNumber(){
        val actualResult = calculation.addition(-3, 5)
        val actualResult2 = calculation.addition(100,-50)
        val actualResult3 = calculation.addition(-8,-6)

        assertEquals(2, actualResult)
        assertEquals(50, actualResult2)
        assertEquals(-14, actualResult3)
    }

    @Test
    fun testAdditionWithZeroes(){
        val actualResult = calculation.addition(0,4)
        val actualResult2 = calculation.addition(522,0)
        val actualResult3 = calculation.addition(0,0)

        assertEquals(4, actualResult)
        assertEquals(522, actualResult2)
        assertEquals(0, actualResult3)
    }

    @Test
    fun testSubtraction(){
        val actualResult = calculation.subtraction(400,4)

        assertEquals(396, actualResult)

    }


}