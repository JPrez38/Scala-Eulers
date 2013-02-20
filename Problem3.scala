lazy val p: Stream[Int] =
  2 #:: p.map(i =>
    Stream.from(i + 1).find(j =>
      p.takeWhile(k => k * k <= j).forall(j % _ > 0)
    ).get
)

val n = 600851475143L
val limit = math.sqrt(n)
val r = p.view.takeWhile(_ < limit).filter(n % _ == 0).max
println(r)
