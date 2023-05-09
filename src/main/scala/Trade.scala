case class Trade (val id: Int,
             val symbol: String,
             val quantity: Int,
                  private val initialPrice: Double)
{
  require(quantity > 0, initialPrice >= 0)
  private var _price = initialPrice

  //getter method
  def getPrice: Double = _price

  //setter method
  def price_=(value: Double): Unit = {
    if (value >= 0) _price = value
  }

//  def this(id: Int, symbol: String, quantity: Int) = { this(id, symbol, quantity, 0)} //constructor no accept price

  def value() :Double = { quantity * getPrice} //value of the trade


}

object Trading extends App {
//  val tradeObject : Trade = new Trade(1, "ace", 12, 12.66)
//  println(tradeObject.toString)

  def apply(id: Int, symbol: String, quantity: Int, initialPrice: Double) = new Trade(id, symbol, quantity, initialPrice);
  //override def toString = s"Trade($id, $symbol, $quantity, $price)"  //override toString
}
