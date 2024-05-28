package com.hfad.unit_testing_task

class Palindrome {

    fun isPalindrome(testString:String):Boolean{

        if(testString == ""){
            return true
        }

        //lowercase all chars in string and rmove all non alpha-numeric chars
        var sanitizedString = testString.lowercase().replace(Regex("[^A-Za-z0-9]"),"")

        //used to hold reversedString
        var reverseString = ""

        for(i in sanitizedString.length-1 downTo 0)
        {
            reverseString+=sanitizedString[i] //create the reversed string
        }

        if(sanitizedString == reverseString){
            return true //is a palindrome
        }

        return false
    }
}