name := "s99"

version := "0.1"

scalaVersion := "2.12.5"

val ScalaTestVersion = "3.0.5"

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % ScalaTestVersion,
  "org.scalatest" %% "scalatest" % ScalaTestVersion % Test,
  "org.scalacheck" %% "scalacheck" % "1.14.0" % Test
)