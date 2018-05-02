package org.kimutyam

object P10 {

  import P01._, P04._, P05._, P09._

  def encode[A](list: List[A]): List[(Int, A)] = {

    @scala.annotation.tailrec
    def loop(rem: List[List[A]], acc: List[(Int, A)]): List[(Int, A)] = {
      rem match {
        case (x :: xs) => loop(xs, length(x) -> last(x) :: acc)
        case Nil => acc
      }
    }

    reverse(loop(pack(list), Nil))
  }
}
