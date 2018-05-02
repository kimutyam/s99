package org.kimutyam

object P01 {

  @scala.annotation.tailrec
  def last[A](l: List[A]): A = {
    l match {
      case (x :: Nil) => x
      case (_ :: xs) => last(xs)
      case _ => sys.error("nil")
    }
  }
}
