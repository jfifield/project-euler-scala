/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
object Problem9 extends App {

  val total = 1000

  for (
    a <- 1 to total;
    b <- a + 1 to total;
    c = math.sqrt(square(a) + square(b));
    if (a + b + c) == total
  ) println((a * b * c).toInt)

  def square(x: Int) = x * x

}