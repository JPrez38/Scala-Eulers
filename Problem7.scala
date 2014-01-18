val begin = System.currentTimeMillis

def isPrime(x:Long) : Boolean = {
  val max = math.sqrt(x).toLong
  if (x == 2L)
    return true
  if (x %2 == 0L)
    return false
  for(i <- 3L to max) {
    if (x%i==0L)
      return false
  }
  return true
}

var count = 1
var i = 1L

while (count < 10001) {
  i+=2
  if (isPrime(i)){
    count+=1
  }
}

println(i)

val end = System.currentTimeMillis

println("Time: " + (end-begin) + " millis")
