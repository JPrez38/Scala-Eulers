var i = 0
var sum = 0
var x = 0

def fib(x:Int) : Int = {
  if (x == 0) {
    return 1
  } else if (x == 1) {
    return 1
  } else {
    return fib(x-1) + fib(x-2)
  }
}

while (i < 4000000) {
  if (i%2==0) {
    sum += i
  }
  x += 1
  i = fib(x)
}

println(sum)

