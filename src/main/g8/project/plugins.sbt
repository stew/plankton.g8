resolvers += Resolver.url(
  "bintray-stew",
  url("http://dl.bintray.com/stew/plankton"))(
  Resolver.ivyStylePatterns)

addSbtPlugin("io.github.stew" % "sbt-plankton" % "0.0.11")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC12")

