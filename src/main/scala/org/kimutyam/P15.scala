package org.kimutyam

object P15 {
  import P05._
  def duplicateN[A](n: Int, list: List[A]): List[A] = {

    def go(rem: List[A], next: Int, acc: List[A]): List[A] = {
      rem match {
        case x :: xs if n <= next => go(xs, 0, acc)
        case x :: _ => go(rem, next + 1, x :: acc)
        case _ => acc
      }
    }
    reverse(go(list, 0, Nil))
  }
}
