def isPrime(n: Long) : Boolean = {
  val sqrt = Math.sqrt(n).toInt
  if (n==2) {
    return true
  }
  if (n%2==0)
    return false
  for (i <- 3 to sqrt by 2){
    if (n%i==0)
      return false
  }
  return true
}

val n = 2000000
var sum = 0L
for (i <- 1 to n) {
  if (isPrime(i)){
    sum += i
  }
}

println(sum)
