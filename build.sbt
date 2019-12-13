import sbt._

scalaVersion:="2.11.2"
autoStartServer:=false
scalafmtOnCompile := true

name := "template.spark4you"
version := "0.0.1.SNAPSHOT"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.4" % Provided
