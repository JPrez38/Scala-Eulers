
def sum_of_digits(x: Int) : Int = {
	val total = BigInt(2).pow(x)
	val string = total.toString
	val list = string.toList

	println(total)
	println(string)

	list.foldLeft(0){ (m: Int, n: Char) => println("m: " + m + " n: " + n); m + n.asDigit }
}

println(sum_of_digits(1000))