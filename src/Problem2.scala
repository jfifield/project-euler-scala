/* 
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four
 * million, find the sum of the even-valued terms.
 */
object Problem2 extends App {

  println(fibstream.takeWhile(_ < 4000000).filter(_ % 2 == 0).sum)

  def fibstream: Stream[Int] = {
    def fib(a: Int, b: Int): Stream[Int] = a #:: fib(b, a + b)
    fib(1, 2)
  }

}
