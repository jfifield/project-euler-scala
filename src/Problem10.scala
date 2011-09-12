/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
object Problem10 extends App {

  println(Stream.from(2).filter(prime).takeWhile(_ < 2000000).foldLeft(0L)(_ + _))

  def prime(n: Int) = !(2 to math.sqrt(n).toInt).exists(n % _ == 0)

}