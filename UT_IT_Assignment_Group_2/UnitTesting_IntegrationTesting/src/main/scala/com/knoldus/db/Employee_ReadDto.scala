package com.knoldus.db

import com.knoldus.models.Employee

import scala.collection.immutable.HashMap

class Employee_ReadDto {

  val harshitEmployee: Employee = Employee("Harshit","Gupta",12,15000,"Intern","Knoldus","harshit.gupta@knoldus.com")
  val ashuEmployee: Employee = Employee("Ashu","Verma",20,25000,"Software Engineer","TCS","ashu.verma@tcs.com")
  val employees: HashMap[String, Employee] = HashMap("Harshit" -> harshitEmployee, "Ashu" -> ashuEmployee)

  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)

}
