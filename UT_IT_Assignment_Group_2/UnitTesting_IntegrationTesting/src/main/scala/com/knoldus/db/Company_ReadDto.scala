package com.knoldus.db

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

class Company_ReadDto {

  val knoldusCompany: Company = Company("Knoldus", "knoldusInc@gmail.com", "Noida")
  val tcsCompany: Company = Company("TCS", "tcs@gmail.com", "Chennai")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "TCS" -> tcsCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}
