ThisBuild / organization := "com.github.yuk1ty"
ThisBuild / version := "0.1"
ThisBuild / scalaVersion := "3.1.0"
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision

lazy val root = (project in file(".")).settings(
  name := "zio-webapp-tutorial",
  libraryDependencies ++= Seq(
    "io.d11"                   %% "zhttp"            % "1.0.0.0-RC18",
    "io.d11"                   %% "zhttp-test"       % "1.0.0.0-RC18" % Test,
    "dev.zio"                  %% "zio"              % "1.0.12",
    "dev.zio"                  %% "zio-logging"      % "0.5.14",
    "dev.zio"                  %% "zio-test-sbt"     % "1.0.12" % Test,
    "dev.zio"                  %% "zio-interop-cats" % "3.2.9.0",
    "com.softwaremill.macwire" %% "macros"           % "2.5.0",
    "org.tpolecat"             %% "doobie-core"      % "1.0.0-RC1",
    "io.circe"                 %% "circe-core"       % "0.15.0-M1",
    "io.circe"                 %% "circe-generic"    % "0.15.0-M1",
    "io.circe"                 %% "circe-parser"     % "0.15.0-M1"
  )
)
