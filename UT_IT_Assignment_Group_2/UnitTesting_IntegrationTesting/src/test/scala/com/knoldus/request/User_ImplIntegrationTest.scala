package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.scalatest.flatspec.AnyFlatSpec

class User-ImplIntegrationTest extends AnyFlatSpec {

  val companyName = new CompanyReadDto
  val validateEmail = new EmailValidator
  val userValidator = new UserValidator(companyName,validateEmail)

  val userImpl = new UserImpl(userValidator)

  "User" should "not be created as company does not exists in DB" in {
    val ashuUser: User = User("Ashu","Verma",20,"Google","ashu.verma@gmail.com")

    val result = userImpl.createUser(ashuUser)
    assert(result.isEmpty)
  }


  "User" should "be created" in {
    val harshitUser: User = User("Harshit","Gupta",12,"Knoldus","harshit.gupta@knoldus.com")

    val result = userImpl.createUser(harshitUser)
    assert(!result.isEmpty)
  }

}
