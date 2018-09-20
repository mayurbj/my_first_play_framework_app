name := """example-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

enablePlugins(DebianPlugin)
maintainer:= "Mayur Jain <jain_mayur_2000@outlook.com>"
packageSummary:= "This will help build a .deb package for my play framework app"
packageDescription:="Package"
