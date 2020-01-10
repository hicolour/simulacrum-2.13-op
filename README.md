


```
sbt.version=1.3.6


lazy val root = (project in file("."))
  .settings(
    name := "simulacrum-2.13-op",
    organization := "com.prochera",
    version := "0.1",
    libraryDependencies ++= Seq(
      "org.typelevel"        %% "simulacrum" % "1.0.0",
    ),
    scalaVersion := "2.13.1",
    scalacOptions ++= List(
      "-unchecked",
      "-deprecation",
      "-Ymacro-annotations",
      "-language:higherKinds",
      "-language:implicitConversions"
    )
  )




```






Fail with `@op` annotation


```scala
  import simulacrum._

  @typeclass trait Semigroup[A] {
    @op("|+|") def append(x: A, y: A): A
  }
```




```
simulacrum-2.13-op/src/main/scala/OpAnnotationException.scala:5:4: exception during macro expansion: 
[error] scala.reflect.macros.TypecheckException: not found: type op
[error]         at scala.reflect.macros.contexts.Typers.$anonfun$typecheck$3(Typers.scala:44)
[error]         at scala.reflect.macros.contexts.Typers.$anonfun$typecheck$2(Typers.scala:38)
[error]         at scala.reflect.macros.contexts.Typers.doTypecheck$1(Typers.scala:37)
[error]         at scala.reflect.macros.contexts.Typers.$anonfun$typecheck$7(Typers.scala:50)
[error]         at scala.reflect.internal.Trees.wrappingIntoTerm(Trees.scala:1866)
[error]         at scala.reflect.internal.Trees.wrappingIntoTerm$(Trees.scala:1863)
[error]         at scala.reflect.internal.SymbolTable.wrappingIntoTerm(SymbolTable.scala:28)
[error]         at scala.reflect.macros.contexts.Typers.typecheck(Typers.scala:50)
[error]         at scala.reflect.macros.contexts.Typers.typecheck$(Typers.scala:32)
[error]         at scala.reflect.macros.contexts.Context.typecheck(Context.scala:18)
[error]         at scala.reflect.macros.contexts.Context.typecheck(Context.scala:18)
[error]         at simulacrum.TypeClassMacros.$anonfun$generateTypeClass$5(typeclass.scala:142)
[error]         at simulacrum.TypeClassMacros.$anonfun$generateTypeClass$5$adapted(typeclass.scala:141)
[error]         at scala.collection.immutable.List.filter(List.scala:487)
[error]         at simulacrum.TypeClassMacros.filterSimulacrumAnnotations$1(typeclass.scala:141)
[error]         at simulacrum.TypeClassMacros.$anonfun$generateTypeClass$65(typeclass.scala:453)
[error]         at scala.collection.immutable.List.map(List.scala:219)
[error]         at simulacrum.TypeClassMacros.modify$1(typeclass.scala:451)
[error]         at simulacrum.TypeClassMacros.generateTypeClass(typeclass.scala:493)
[error]   @typeclass trait Semigroup[A] {
[error]    ^
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
```


Compile wihout `@op`

```scala


  import simulacrum._

  @typeclass trait Semigroup[A] {
    def append(x: A, y: A): A
  }
```

```
[success] Total time: 0 s, completed
```
