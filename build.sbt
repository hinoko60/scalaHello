name := "Hello"

version := "0.0.1"

scalaVersion := "2.11.6"

publishTo := Some(Resolver.file("hello",file("/Users/changki_choi/work/projects/gitprac/scalaHello/"))(Patterns(true, Resolver.mavenStyleBasePattern)))