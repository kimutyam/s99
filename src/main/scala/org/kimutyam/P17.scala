package org.kimutyam

object P17 {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    import P05._
    @scala.annotation.tailrec
    def go(nth: Int, target: List[A], acc: (List[A], List[A])):(List[A], List[A]) = {
      target match {
        case x :: xs if n >= nth => go(nth + 1, xs, (x :: acc._1, Nil))
        case x :: xs if n < nth => go(nth + 1, xs, (acc._1, x :: acc._2))
        case _ => (reverse(acc._1), reverse(acc._2))
      }
    }
    go(1, list, (Nil, Nil))
  }
}
