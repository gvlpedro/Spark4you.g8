import Dependencies._

lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      scalaVersion     := "2.11",
      version          := "0.1.0-SNAPSHOT",
      organization     := "$package$",
      organizationName := "$organization$"
    )),
    name := "$project$",
        javacOptions ++= Seq("-source", "1.8", "-target", "1.8"),
    javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled"),
    libraryDependencies ++= Seq (
      "org.apache.spark" %% "spark-sql" % "2.4.0" % "provided",
    )
    scalacOptions ++= Seq("-deprecation", "-unchecked")
  )