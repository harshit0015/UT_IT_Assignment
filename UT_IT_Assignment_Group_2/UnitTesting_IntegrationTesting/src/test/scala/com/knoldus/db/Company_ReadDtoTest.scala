package com.knoldus.db
import org.scalatest.flatspec.AnyFlatSpec

class Company_ReadDtoTest extends AnyFlatSpec {

  "Company" should "exist if " in {
    val companyReadDto = new CompanyReadDto
    val result = companyReadDto.getCompanyByName("Knoldus")
    assert(!result.isEmpty)
  }

  "Company" should "not exist if" in {
    val companyReadDto = new CompanyReadDto
    val result = companyReadDto.getCompanyByName("Google")
    assert(result.isEmpty)
  }
}
