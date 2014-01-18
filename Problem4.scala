val begin = System.currentTimeMillis

val end = System.currentTimeMillis

def isPalindrome(n:Int) : Boolean = {
  val stringnum = n.toString
  for (i <- 0 to stringnum.size/2) {
    if (stringnum.charAt(i) != stringnum.charAt(stringnum.size-i-1))
      return false
  }
  return true
}


var largepalindrome = 0

for(i <- 100 to 999) {
  for (j <- 100 to 999) {
    val product = i*j
    if (isPalindrome(product)) {
      if (product >= largepalindrome)
        largepalindrome = product
      }
  }
}

println(largepalindrome)

println("\nTime: " + (end-begin) + " millis")
