val b = System.currentTimeMillis
/*
// approach takes 55ms
def fib (n: Int) : Int = {
  if (n==0)
    return 1
  if (n==1)
    return n
  else 
    return fib(n-1) + fib(n-2)
}



val numbers = 1 to 4000000


var n=0
var i=0
var sum = 0
while (n < 4000000){
  n=fib(i)
  if (n%2==0)
    sum+=n
  i+=1
}

println(sum)
*/


// functional approach takes approx 30ms

val fib: Stream[BigInt] = BigInt(1) #:: BigInt(1) #:: 
  fib.zip(fib.tail).map { n => n._1 + n._2 }

val r = fib.view.takeWhile(_ <= 4000000).filter(_ %2==0).sum
println(r)
val e = System.currentTimeMillis
val total = e-b
println("Total time is: " +  total)

