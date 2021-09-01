object DependencyInversion extends App {


  trait Developer{
    def develop: Any = {}
  }

  class BackEndDeveloper extends Developer{
    override def develop: Any = writeJava()

    def writeJava(): Any = {}
  }

  class FrontEndDeveloper extends Developer{
    override def develop: Any = writeJavaScript()

    def writeJavaScript(): Any = {}
  }


  class Project(var developers: List[DependencyInversion.Developer]) {
    def implement(): Unit = {
      developers.foreach((d: DependencyInversion.Developer) => d.develop)
    }
  }



}
