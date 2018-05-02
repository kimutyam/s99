package org.kimutyam

object P11 {
  import P05._, P10._
  def encodeModified[A](list: List[A]): List[Any] = {
    @scala.annotation.tailrec
    def go(rem: List[(Int, A)], acc: List[Any]): List[Any] = {
      rem match {
        case x :: xs if x._1 == 1 => go(xs, x._2 :: acc)
        case x :: xs => go(xs, x :: acc)
        case _ => acc
      }
    }
    reverse(go(encode(list), Nil))
  }
}
