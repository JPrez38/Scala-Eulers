def getTriangleNumber(x:Int) : Long = {
  var sum = 0L
  for (i <- 1 to x) {
    sum += i.toLong
  }
  return sum
}

def numberOfFactors(n:Long) : Int = {
  var count = 0
  var max = n
  var i = 1
  while (i < max) {
    if (n % i == 0L) {
      count+=2
      max = n/i
    }
    i+=1
  }
  return count
}

val begin = System.currentTimeMillis

var i = 1
var inc = 2

while (numberOfFactors(i) < 500) {
  i+= inc
  inc+=1
}

println(i)
val end = System.currentTimeMillis

println("Time: " + (end-begin) + " millis")
