ThisBuild / organization := "com.github.yuk1ty"
ThisBuild / version := "0.1"
ThisBuild / scalaVersion := "3.1.0"
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision

lazy val root = (project in file(".")).settings(
  name := "zio-webapp-tutorial",
  libraryDependencies ++= Seq(
    "dev.zio" %% "zio" % "1.0.12",
    "dev.zio" %% "zio-logging" % "0.5.14",
    "dev.zio" %% "zio-test-sbt" % "1.0.12" % Test,
    "dev.zio" %% "zio-interop-cats" % "3.2.9.0",
    "org.http4s" %% "http4s-blaze-server" % "1.0.0-M30",
    "org.http4s" %% "http4s-dsl" % "1.0.0-M30",
    "org.http4s" %% "http4s-circe" % "1.0.0-M30",
    "org.tpolecat" %% "doobie-core" % "1.0.0-RC1"
  )
)
