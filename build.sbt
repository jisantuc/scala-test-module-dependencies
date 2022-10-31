import Dependencies._

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val testLib = (project in file("./testLib"))

lazy val needsTestLibForTest = (project in file("./needsTestLibForTest"))
  .dependsOn(testLib % Test)

lazy val needsTestLibForIt = (project in file("./needsTestLibForIT"))
  .dependsOn(testLib % IntegrationTest)
  .configs(IntegrationTest)
  .settings(Defaults.itSettings)

lazy val needsTestLibForBoth = (project in file("./needsTestLibForBoth"))
  .dependsOn(testLib % Test, testLib % IntegrationTest)
  .configs(IntegrationTest)
  .settings(Defaults.itSettings)
