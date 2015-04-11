
def isPrime(x: Int) : Boolean = {
	val sqrt_x = math.sqrt(x).toLong
	if (x !=2 && x % 2 == 0) {
		return false
	}
	for (i <- 3L to sqrt_x by 2) {
		if (x % i == 0) {
			return false
		}
	}
	true
}

val NUM = 2000000

var sum = 0L

for (i <- 2 to NUM) {
	if (isPrime(i)) {
		sum += i
	}
}

println(sum)
