/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10
 * without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1
 * to 20?
 */
object Problem5 extends App {

  println(Stream.from(20, 20).dropWhile(x => (2 until 20).exists(y => x % y != 0)).head)

}