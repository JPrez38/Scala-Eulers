val begin = System.currentTimeMillis

def sumOfSquares(numbers:Long) : Long = {
  var sum = 0L
  for (i <- 1L to numbers) {
    sum += i*i
  }
  return sum
}

def squareOfSums(numbers:Long) : Long = {
  var sum = 0L
  for (i <- 1L to numbers) {
    sum += i
  }
  return sum*sum
}

val number = 100

val sumSquares = sumOfSquares(number)
val squareSums = squareOfSums(number)

println("The sum of squares is : " + sumSquares)
println("The square of sums is : " + squareSums)
println("The difference is : " +  (squareSums-sumSquares))

val end = System.currentTimeMillis

println("Time: " + (end-begin) + " millis")
