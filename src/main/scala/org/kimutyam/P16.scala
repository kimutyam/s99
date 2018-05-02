package org.kimutyam

object P16 {
  import P05._
  def drop[A](n: Int, list: List[A]): List[A] = {
    @scala.annotation.tailrec
    def go(next: Int, rem: List[A], acc: List[A]): List[A] = {
      rem match {
        case _ :: xs if n == next => go(1, xs, acc)
        case x :: xs => go(next + 1, xs, x :: acc)
        case _ => acc
      }
    }
    reverse(go(1, list, Nil))
  }
}
