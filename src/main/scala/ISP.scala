object ISP extends App{
  trait Latte{
    def makeLatte: String = "1-2 ounces of coffee with 8-15 ounces of milk"
  }

  trait BlackCoffee{
    def makeBlackCoffee: String = "8 ounces of coffee with hot water"
  }

  trait ColdCoffee{
    def makeColdCoffee: String = "Here is cold-coffee"
  }

  class CoffeeInWinter extends Latte with BlackCoffee{
    override def makeLatte: String = "Here is your latte"

    override def makeBlackCoffee: String = "Here is your Black coffee"
  }

  class CoffeeInSummer extends ColdCoffee{
    override def makeColdCoffee: String = "Here is your cold-coffee"
  }

  val summerCoffee = new CoffeeInSummer
  println(summerCoffee.makeColdCoffee)
}
