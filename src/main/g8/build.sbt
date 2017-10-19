name := "$name$"

scalaOrganization in ThisBuild := "org.typelevel"
scalaVersion in ThisBuild := "2.12.3-bin-typelevel-4"
enablePlugins(ZooPlankton)

libraryDependencies += "com.github.alexarchambault" %% "scalacheck-shapeless_1.13" % "1.1.6"
