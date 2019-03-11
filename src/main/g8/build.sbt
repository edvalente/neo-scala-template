// Create variables
lazy val mainModule = (project in file("."))
  .settings(
    organization := "$organization$",
    scalaVersion := "$scala_version$",
    name := "$name$",
    version := "$version$"
  )

// test
libraryDependencies += "junit" % "junit" % "4.12" % "test"
libraryDependencies += "com.storm-enroute" % "scalameter_2.11" % "0.6"  % "test"
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

// production
libraryDependencies += "com.github.nscala-time" % "nscala-time_2.11" % "1.8.0"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3"

$if(use_json4s.truthy)$
// json4s
libraryDependencies += "org.json4s" % "json4s-jackson_2.11" % "3.5.4"
libraryDependencies += "org.json4s" % "json4s-native_2.11" % "3.5.4"
$endif$

$if(use_spark.truthy)$
// spark
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.4.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.0"
$endif$
