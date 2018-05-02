package org.kimutyam

object P05 {
  def reverse[A](list: List[A]): List[A] = {
    @scala.annotation.tailrec
    def loop(base: List[A], acc: List[A]): List[A] = base match {
      case Nil => acc
      case x :: xs => loop(xs, x :: acc)
    }
    loop(list, Nil)
  }
}
