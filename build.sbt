/*lazy val root = (project in file(".")).
  settings(
    name := "scrala",
    version := "1.0",
    scalaVersion := "2.12.2",
    libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.5.1",
    libraryDependencies += "org.jsoup" % "jsoup" % "1.10.3",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.3",

    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3",
    libraryDependencies += "org.json4s" %% "json4s-native" % "3.5.2"
  )*/
name := "scrala"
scalaVersion := "2.12.2"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.7.1"

libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.5.1"
libraryDependencies += "org.jsoup" % "jsoup" % "1.10.3"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.3"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "org.json4s" %% "json4s-native" % "3.5.2"

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.7.1"