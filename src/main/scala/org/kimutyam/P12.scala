package org.kimutyam

object P12 {
  def decode[A](list: List[(Int, A)]): List[A] = {
//    @scala.annotation.tailrec
    def loop(rem: List[(Int, A)], acc: List[A]): List[A] = {
      rem match {
        case x :: xs if x._1 == 0 => loop(xs, acc)
        case x :: xs => x._2 :: loop(x._1 - 1 -> x._2 :: xs, acc)
        case _ => acc
      }
    }
    loop(list, Nil)
  }
}
