package org.kimutyam

object P02 {
  def penultimate[A](l: List[A]): A = {
    l match {
      case x :: _ :: Nil => x
      case _ :: y :: xs => penultimate(y :: xs)
      case _ => sys.error("nil")
    }
  }
}
