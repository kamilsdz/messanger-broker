ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.example"

lazy val broker = (project in file("."))
  .settings(
    name := "Broker",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  )
