package com.knoldus.validator
import org.scalatest.flatspec.AnyFlatSpec

class Email_ValidatorTest extends AnyFlatSpec {

  "The email" should "not  valid  it doen't contains recipient name" in {
    val emailValidator = new EmailValidator
    assert(!emailValidator.emailIdIsValid("@gmail.com"))
  }

  "The email" should "not valid as it doen't not contains @ symbol" in {
    val emailValidator = new EmailValidator
    assert(!emailValidator.emailIdIsValid("harshitgmail.com"))
  }

  "The email" should "not valid as it doesn't not contains domain name" in {
    val emailValidator = new EmailValidator
    assert(!emailValidator.emailIdIsValid("harshit@.com"))
  }

  "The email" should "not valid as it does not contains .(com,net,org)" in {
    val emailValidator = new EmailValidator
    assert(!emailValidator.emailIdIsValid("harshit@gmail.in"))
  }

  "The email" should "is  valid" in {
    val emailValidator = new EmailValidator
    assert(emailValidator.emailIdIsValid("harshit.gupta@gmail.com"))
  }
}
