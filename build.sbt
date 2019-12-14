import sbt._

ThisBuild / scalaVersion:="2.11.2"
ThisBuild / autoStartServer:=false

name := "template.spark4you"
version := "1.0.1"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.4" % Provided