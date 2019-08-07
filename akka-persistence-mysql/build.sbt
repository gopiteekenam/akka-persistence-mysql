name := "AkkaPracticeProblems"

version := "0.1"

scalaVersion := "2.12.8"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence" % "2.5.22"
)
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.2"
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.5.22" % Test
libraryDependencies += "com.okumin" %% "akka-persistence-sql-async" % "0.5.1"
libraryDependencies += "com.github.mauricio" %% "mysql-async" % "0.2.21"