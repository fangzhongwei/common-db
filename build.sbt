name := "common-db"

version := "1.0"

scalaVersion := "2.11.8"

organization := "com.jxjxgo.common"

resolvers += "alfresco-repo" at "https://artifacts.alfresco.com/nexus/content/repositories/public"

libraryDependencies ++= Seq(
  "postgresql" % "postgresql" % "9.2-1002.jdbc4",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0-M2",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "com.typesafe.slick" %% "slick" % "3.2.0-M2",
  "com.typesafe.slick" % "slick-codegen_2.11" % "3.2.0-M2" % "test"
)