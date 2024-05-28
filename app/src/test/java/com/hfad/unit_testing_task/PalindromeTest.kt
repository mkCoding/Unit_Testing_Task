package com.hfad.unit_testing_task

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class PalindromeTest{

    private val palindrome = Palindrome() //scenario

    //test if user enters an empty string
    @Test
    fun testEmptyString(){
        Assert.assertTrue(palindrome.isPalindrome("")) //return true
    }

    //test if user enters in a single letter
    @Test
    fun testSingleLetter(){
        assertTrue(palindrome.isPalindrome("a"))
    }

    //test if user enters in a word
    @Test
    fun testPalindromeString(){
        assertTrue(palindrome.isPalindrome("noon"))
    }

    //test nonPalindromeString
    @Test
    fun testNonPalindromeString(){
        assertFalse(palindrome.isPalindrome("dinosaur"))
    }

    //test if user enters a word with punctuations
    @Test
    fun testPalindromeWithPunctuation(){
        assertTrue(palindrome.isPalindrome("civic!"))
    }

    //test if a user enters in a sentence
    @Test
    fun testNonPalindromeWitPunctuation(){
        assertFalse(palindrome.isPalindrome("water?"))
    }

    //test if a user enters in an uppercase Palindrome
    @Test
    fun testPalindromeUppercase(){
        assertTrue(palindrome.isPalindrome("RADAR"))
    }

}