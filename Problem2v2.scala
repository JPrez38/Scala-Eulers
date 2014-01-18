def fib(a:Int) : Int = {
  if(a == 0){
    return 1
  }
  if(a==1){
    return a
  }
  else {
    return fib(a-1)+fib(a-2)
  }

}

var i=0
var sum=0
var tmp = fib(0)
while (tmp <= 4000000){
  if (tmp%2==0){
    sum+=tmp
  }
  i+=1
  tmp=fib(i)
}

println(sum)
