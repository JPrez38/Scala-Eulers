
def findPrimeFactors (n : Long)  {
  var i = 2L
  while (i < n) {
    if (n%i==0){
      if (isPrime(i))
        println(i)
    }
    i+=1
  }
  /*for (i <- 2 to n){
    if (n%i==0) {
      if (isPrime(i))
        println(i)
    }
  }*/
}

def isPrime(n: Long) : Boolean = {
  val sqrt = Math.sqrt(n).toInt
  if (n%2==0)
    return false
  for (i <- 3 to sqrt){
    if (n%i==0)
      return false
  }
  return true
}

val number = 600851475143L
findPrimeFactors(number)
println(isPrime(7))
