import Dependencies._
import sbt.Keys._

scalaVersion     := "2.11.11",
version          := "0.1.0-SNAPSHOT",
organization     := "$package$",
organizationName := "$organization$"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.0" % "provided"
