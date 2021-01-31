name := "UT_IT_Assignment_Group_2"

version := "0.1"

scalaVersion := "2.13.4"

lazy val Unit_Testing = project.in(file("Unit_Testing"))
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3" % Test
  )

lazy val UnitTesting_IntegrationTesting = project.in(file("UnitTesting_IntegrationTesting"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.3" % Test,
      "org.mockito" %% "mockito-scala" % "1.5.12" % Test
    )
  )

lazy val root = project.in(file(".")).aggregate(Unit_Testing,UnitTesting_IntegrationTesting)