ThisBuild / scalaVersion := "2.12.8"
ThisBuild / organization := "com.example"

lazy val broker = (project in file("."))
  .settings(
    name := "Broker",
    resolvers += Resolver.bintrayRepo("cakesolutions", "maven"),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.8" % Test,
      "net.cakesolutions" %% "scala-kafka-client" % "2.1.0",
      "ch.qos.logback" % "logback-classic" % "1.2.3"
    )
  )

mainClass in (Compile, run) := Some("broker.Main")
