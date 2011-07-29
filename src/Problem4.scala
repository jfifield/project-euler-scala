/*
 * A palindromic number reads the same both ways. The largest palindrome made from the
 * product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
object Problem4 extends App {

  val threeDigitNumbers = 100 to 999
  println(threeDigitNumbers.flatMap(x => threeDigitNumbers.map(y => x * y)).filter(s => s.toString.reverse == s.toString).max)

}