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
