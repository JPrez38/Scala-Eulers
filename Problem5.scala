val begin = System.currentTimeMillis

def check(n:Int) : Boolean = {
  for (i <- 1 to 20) {
    if (n%i != 0) {
      return false
    }
  }
  return true
}

var i = 20
while (!check(i)) {
  i+=20
}

println(i)

val end = System.currentTimeMillis

println("Time: " + (end-begin) + " millis")
