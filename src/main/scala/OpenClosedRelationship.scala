object OpenClosedRelationship extends App {
  class VehicleInfo{
    def vehicleNumber(a: Double): Double = a
  }

  class Car extends VehicleInfo{
    def carLoad(t: String): String = s"Car has ${t} torque!! Therefore can't carry much load"
  }

  class Truck extends VehicleInfo{
    def truckLoad(t: String): String = s"Truck has ${t} torque!! Therefore can carry much load"
  }

  val car = new Car
  println(car.vehicleNumber(4567))

}
