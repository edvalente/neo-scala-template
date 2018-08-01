// Create variables
organization := "$organization$"
scalaVersion := "$scala_version$"
name := "$name$"
version := "$version$"

// test
libraryDependencies += "junit" % "junit" % "4.12" % "test"
libraryDependencies += "com.storm-enroute" % "scalameter_2.11" % "0.6"  % "test"
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

// production
libraryDependencies += "com.github.nscala-time" % "nscala-time_2.11" % "1.8.0"
libraryDependencies += "org.json4s" % "json4s-jackson_2.11" % "3.2.10"
libraryDependencies += "org.json4s" % "json4s-native_2.11" % "3.2.10"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3"
