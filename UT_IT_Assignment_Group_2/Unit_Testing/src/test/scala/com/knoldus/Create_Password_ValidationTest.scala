package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class Create_Password_ValidationTest extends AnyFlatSpec {
  "password is " should "not valid because its contains space" in {
    val password = new Create_Password_ValidationTest("Harshit@ Gupta")
    assert(!password.isPasswordValid)
  }

  "password is" should "not  valid because not contains  any number" in {
     val password = new Create_Password_ValidationTest("Harshit@Gupta")
  assert(!password.isPasswordValid)
  }

  "password is" should "not valid because length is less than 8" in {
    val password = new Create_Password_ValidationTest("Hars@")
    assert(!password.isPasswordValid)
  }

  "password is" should "not valid because length is greater than 15" in {
    val password = new PasswordValidator("Harshitgupta@147114")
    assert(!password.isPasswordValid)
  }

  "password is" should "not valid because it doesn'tcontains any lowercase" in {
    val password = new PasswordValidator("HARSHITGUPTA@12")
    assert(!password.isPasswordValid)
  }

  "password is " should "not valid because it doesn't contains any uppercase" in {
    val password = new PasswordValidator("harshitgupta@12")
     assert(!password.isPasswordValid)
  }

  "password is " should "not valid  because it doesn'tcontains special character" in {
    val password = new PasswordValidator("HarshitGupta12")
 assert(!password.isPasswordValid)
  }

  "password is " should " is  valid because uppercase,lowercase,number,special character and length between  8-15 " in {
    val password = new PasswordValidator("Harshitgupta@12")
   assert(password.isPasswordValid)
  }
}
