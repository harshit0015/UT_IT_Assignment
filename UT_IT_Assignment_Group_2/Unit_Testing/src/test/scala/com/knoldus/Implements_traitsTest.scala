package com.knoldus.calculations
import org.scalatest.flatspec.AnyFlatSpec

class PalindromeAndFactorialTest extends AnyFlatSpec {

  " The number" should "not  palindrome number" in {
    val object = new Implements_traits
    assert(!object.checkNumberisPalindrome(16538))
  }

  "The number" should "not  palindrome number if a negative number" in {
    val object = new Implements_traits
    assert(!object.checkNumberisPalindrome(-744))
  }

  "The number" should "palindrome number as 0 and is palindrome" in {
    val object = new Implements_traits
    assert(object.checkNumberisPalindrome(0))
  }

  "The number" should "is a palindrome number" in {
    val obj = new Implements_traits
    assert(object.checkNumberisPalindrome(141))
  }

  "The number" should "of   6  not return 100" in {
    val object= new Implements_traits
    assert(!(100==object.getFactorialofnumbers(6)))
  }

  "The number" should " 0  return 1" in {
    val object = newImplements_traits
    assert(1==object.getFactorialofnumbers(0))
  }

  "The number" should " 5 return 120" in { {
   val object = newImplements_traits
    assert(120==object.getFactorialofnumbers(5))
  }
}
