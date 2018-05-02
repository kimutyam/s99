package org.kimutyam

object P09 {
  def pack[A](list: List[A]): List[List[A]] = {
    list.foldRight(Nil: List[List[A]]) { (e, ls) =>
      ls match {
        case (x @ `e` :: _) :: xs => (e :: x) :: xs
        case _                    => List(e) :: ls
      }
    }
  }
}

