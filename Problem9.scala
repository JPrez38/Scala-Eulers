def isPathTriplet(a:Int,b:Int,c:Int) : Boolean = {
  if ((a*a+b*b) == (c*c) && a < b && b < c) {
    return true
  }
  else return false
}

for (c <- 334 to 999) {
  for (a <- 1 to c-1) {
    val b = 1000-(c+a)
    if (isPathTriplet(a,b,c)) {
      println("a:" + a + " ,b:" + b + " ,c" + c)
      println("product is " + (a*b*c))
    }
  }
}
