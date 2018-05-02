package org.kimutyam

object P04 {
  def length[A](list: List[A]): Int = {
    @scala.annotation.tailrec
    def loop(cnt: Int, l: List[A]): Int = {
      l match {
        case _ :: xs => loop(cnt + 1, xs)
        case Nil => cnt
      }
    }
    loop(0, list)
  }
}
