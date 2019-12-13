import sbt._

scalaVersion:="2.11.2"
autoStartServer:=false
scalafmtOnCompile := true

name := "$package$.$projectname$"
version := "0.0.1.SNAPSHOT"
group : "$package$"

def green(input:Any): String = Scala.console.GREEN + input + scala.console.RESET
onLoadMessage += s""" Loading ${green(" g8 project ")} """

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.4" % Provided
