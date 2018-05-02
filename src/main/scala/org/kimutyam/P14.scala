package org.kimutyam

object P14 {
  def duplicate[A](list: List[A]): List[A] = {
    list match {
      case x :: xs => x :: x :: duplicate(xs)
      case _ => Nil
    }
  }
}
