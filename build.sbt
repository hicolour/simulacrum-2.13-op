lazy val root = (project in file("."))
  .settings(
    name := "simulacrum-2.13-op",
    organization := "com.prochera",
    version := "0.1",
    libraryDependencies ++= Seq(
      "org.typelevel"        %% "simulacrum" % "1.0.0",
    ),
    scalaVersion := "2.13.1",
    scalacOptions ++= List(
      "-unchecked",
      "-deprecation",
      "-Ymacro-annotations",
      "-language:higherKinds",
      "-language:implicitConversions"
    )
  )
