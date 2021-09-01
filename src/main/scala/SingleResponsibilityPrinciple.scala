

object SingleResponsibilityPrinciple extends App {

  val student = new Student("Aditya", "Narayan")
  println(student.studentName)

  val percentage = new Percentage
 println(percentage.calculatePercentage(90))

  /*
  Create a student details system where add printDetails(), calculatePercentage(), and studentName()
   */
  class Student(firstName: String, lastName: String) {
    def studentName: String = this.firstName + " " + this.lastName
  }

  class Percentage{
    def calculatePercentage(a: Int): Int = a * 100 / 100
  }

}
