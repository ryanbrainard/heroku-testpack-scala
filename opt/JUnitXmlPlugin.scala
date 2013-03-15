import sbt._
import Keys._

object JUnitXmlPlugin extends Plugin {
  override def settings = Seq(
    libraryDependencies ++= Seq("junit" % "junit" % "4.7" % "test")
   )
}

