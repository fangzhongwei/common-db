name := "common-db"

version := "1.3"

scalaVersion := "2.12.1"

organization := "com.jxjxgo.common"

resolvers += "alfresco-repo" at "https://artifacts.alfresco.com/nexus/content/repositories/public"
//resolvers += "clojars-repo" at "http://clojars.org/repo"
//resolvers += "3rdparty-repo" at "https://maven.atlassian.com/3rdparty"

// https://mvnrepository.com/artifact/postgresql/postgresql
//libraryDependencies += "postgresql" % "postgresql" % "9.4.1208-jdbc42-atlassian-hosted" from "https://maven.atlassian.com/3rdparty/postgresql/postgresql/9.4.1208-jdbc42-atlassian-hosted/postgresql-9.4.1208-jdbc42-atlassian-hosted.jar"

libraryDependencies ++= Seq(
  "org.postgresql" % "postgresql" % "42.1.4",
//  "postgresql" % "postgresql" % "9.3-1102.jdbc41" from "http://clojars.org/repo/postgresql/postgresql/9.3-1102.jdbc41/postgresql-9.3-1102.jdbc41.jar",
  "com.typesafe.slick" % "slick-hikaricp_2.12" % "3.2.0",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "com.typesafe.slick" % "slick_2.12" % "3.2.0",
  "com.typesafe.slick" % "slick-codegen_2.12" % "3.2.0" % "test"
)

// https://mvnrepository.com/artifact/com.typesafe.slick/slick_2.12
//libraryDependencies += "com.typesafe.slick" % "slick_2.12" % "3.2.0"
