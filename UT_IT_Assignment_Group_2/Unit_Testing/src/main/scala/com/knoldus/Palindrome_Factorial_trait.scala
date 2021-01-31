package com.knoldus

trait Palindrome_Factorial_trait {
  def checkNumberisPalindrome(number: Int): Boolean
  def factorial(number: Int): Int
}

class Implements_trait extends Palindrome_Factorial_trait {

  def checkNumberisPalindrome(number: Int): Boolean = {
    var reverse: Int = 0
    var remainder: Int = 0
    var temp: Int = number

    while(temp>0){
      remainder = temp % 10
      reverse = reverse * 10 + remainder
      temp /= 10
    }

    if(reverse == number)
      true
    else
      false
  }

  def getFactorialofnumber(number: Int): Int = {
    var factorial:Int = 1

    for(i <- 2 to number){
      factorial *= i
    }
    result
  }
}
