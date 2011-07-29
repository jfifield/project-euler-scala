/* 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
object Problem3 extends App {

  println(factors(600851475143L).filter(prime).max)

  def factors(n: Long) = (2 to math.sqrt(n).toInt).filter(n % _ == 0).flatMap(x => List(x, n / x))

  def prime(n: Long) = !(2 to math.sqrt(n).toInt).exists(n % _ == 0)

}
