import Dependencies._

ThisBuild / scalaVersion     := "3.3.1"
ThisBuild / version          := "0.0.1-SNAPSHOT"
ThisBuild / organization     := "$organization$"

lazy val root = (project in file("."))
  .settings(
    name := "$name$"
  )

scalacOptions ++= Seq(
  "-deprecation",     // Emit warning and location for usages of deprecated APIs.
  "-explaintypes",    // Explain type errors in more detail.
  "-Ywarn-dead-code",  // Warn when dead code is identified.
  "-Xfatal-warnings" // Fail the compilation if there are any warnings.
)

javacOptions ++= Seq("-source", "21", "-target", "21", "-Xlint")

assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*)       => MergeStrategy.discard
  case n if n.startsWith("reference.conf") => MergeStrategy.concat
  case _                                   => MergeStrategy.first
}
