val numbers = 1 until 1000
val filteredNumbers = numbers.filter((i: Int) => i%3==0 || i%5==0)
val answer = filteredNumbers.foldLeft(0)(_ + _)
println(answer)
