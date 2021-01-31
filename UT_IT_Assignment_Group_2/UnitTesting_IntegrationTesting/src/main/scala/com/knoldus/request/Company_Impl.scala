package com.knoldus.request

import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator

class Company_Impl(companyValidator: CompanyValidator) {

  def createCompany(company: Company): Option[String] = {
    if (companyValidator.companyIsValid(company)) Option(company.name)
    else None
  }
}
