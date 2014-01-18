import math._

def isPrime(x:Int) : Boolean = {
  val max = math.sqrt(x).toInt

  if (x == 2) {
    return true
  }
  if (x %2 == 0) {
    return false
  }
  for(i <- 3 to max) {
    if (x%i==0){
      return false
    }
  }
  return true
}

for (i < 1 to 15) {
  println(isPrime())
}
