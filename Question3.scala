import scala.math.round

object Question3 {
  def main(args: Array[String]): Unit = {

	var numberOfCopies:Int = 60
	var discount:Double = 0.4
	var priceOfaBook:Double = 24.95
	var totalPriceForBooks = numberOfCopies*priceOfaBook*(1-discount)
	var shippingCosts:Double = 0
	if(numberOfCopies>=50){
		shippingCosts = 150+0.75*(numberOfCopies-50)
	}
	else{
		shippingCosts=3*numberOfCopies
	}
	var totalCost:Double = shippingCosts+totalPriceForBooks
	var x:Double = round(totalCost*100)
	println(x)
	
	totalCost = x/100

    println("The total price for purchasing "+numberOfCopies+" copies with a price:"+priceOfaBook+" at a discount rate "+discount*100+"% + shipping is :"+totalCost)
  }
}
