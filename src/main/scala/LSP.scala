object LSP extends App {
  class TransportationMode{
    def getName(name: String) = s"Your transportation name is ${name}"
    def getSpeed(speed: Int) = s"You are driving at the speed of ${speed}mph"
  }

  class VehiclesWithoutEngine extends TransportationMode{
    def startMoving: Any = true
  }

  class VehiclesWithEngine extends TransportationMode{
    def startEngine: Any = true
  }

  class Car extends VehiclesWithEngine{
    override def startEngine: Any = if (true) {
      println("You can move fast")
    }
  }

  class Bicycle extends VehiclesWithoutEngine{
    override def startMoving: Any = if (true) {
      println("You are moving when you are peddling")
    }
  }

  val slowTransport = new Bicycle
  slowTransport.startMoving

}
