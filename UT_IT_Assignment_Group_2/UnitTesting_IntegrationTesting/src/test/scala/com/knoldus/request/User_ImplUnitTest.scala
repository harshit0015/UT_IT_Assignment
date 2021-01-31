package com.knoldus.request
import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class User_ImplUnitTest extends AnyFlatSpec {

  val mockedUserValidator = mock[UserValidator]
  val harshitUser: User = User("Harshit","Gupta",12,"knoldus","harshit.gupta@knoldus.com")

  "User" should "be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(HarshitUser)) thenReturn(true)
    val result = userImpl.createUser(harshitUser)
    assert(!result.isEmpty)
  }

  "User" should "not be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(harshitUser)) thenReturn(false)
    val result = userImpl.createUser(harshitUser)
    assert(result.isEmpty)
  }

}
