import java.text.DecimalFormat

fun main() {
    var cost = 0.0
    var recoTip = 0.0
    var tax = 0.0
    var withTax = 0.0
    do {
        println("Please enter the cost of your items (enter 0.0 to exit): ")
        var costInp = readln()!!.toDouble()

        cost = (cost + costInp)
        tax = cost *.025

    }while (costInp > 0.0)
    withTax = cost + tax
    recoTip = withTax * .175

    val twoDigits = DecimalFormat("###.00$")
    var costDigits = twoDigits.format(withTax)
    var recoTipDigits = twoDigits.format(recoTip)

    println("The total cost is $costDigits")
    println("The recommended tip is: $recoTipDigits")






}