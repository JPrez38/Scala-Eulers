package Problem14

import scala.collection.mutable.Map

object Main {
  var Numbers = Map[Long,Long]()
  def main(args: Array[String]) {
    

    val begin = System.currentTimeMillis

    var max = 0L
    var index = 0L

    //println(dynamicLengthOfCollatz(13))

    for (i <- 1L to 999999L) {
      val length = dynamicLengthOfCollatz(i)
      if (length > max) {
        index = i
        max = length
      }
    }

    println("max is " + max + " at index " + index)

    val end = System.currentTimeMillis 

    println("Time: " + (end-begin) + " millis") 
    
  }


  def lengthOfCollatz(start:Long) : Long = {
    var n = start
    var count = 0L
    while (n != 1L) {
      if (n % 2L == 0L) {
        n = n/2L
      } else {
        n = 3L*n+1L
      }
      count+=1L
    }
    count +=1L
    return count
  }

  def dynamicLengthOfCollatz(n:Long) : Long = {
    return dynamicLengthOfCollatz(n,0L)
  }

  def dynamicLengthOfCollatz(n:Long,length:Long) : Long = {
    var tmp = length
    val number = Numbers.getOrElse(n,0L)
    if (n == 1L) {
      tmp = 1L
    }
    else if (number != 0L) {
      tmp = number
    }
    else if (n % 2L == 0L) {
      tmp += dynamicLengthOfCollatz(n/2L,length) +1L
    }
    else { (n % 2L != 0)
      tmp += dynamicLengthOfCollatz(3L*n+1L,length) +1L
    }
    //println(n + "," + tmp)
    Numbers += n -> tmp
    return tmp
  }
}


