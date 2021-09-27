
enablePlugins(ScalaJSPlugin)
enablePlugins(JSDependenciesPlugin)
enablePlugins(ScalaJSBundlerPlugin)

name := "MyFirstScalaJS"

version := "0.1"

scalaVersion := "2.13.6"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.4" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

scalaJSLinkerConfig ~= (_.withModuleKind(ModuleKind.CommonJSModule))

Compile / npmDependencies  += "chart.js" -> "3.5.1"

