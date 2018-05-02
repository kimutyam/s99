package org.kimutyam

object P13 {
  import P05._
  def encodeDirect[A](list: List[A]): List[(Int, A)] = {
    @scala.annotation.tailrec
    def go(rem: List[A], acc: List[(Int, A)]): List[(Int, A)] = {
      (rem, acc) match {
          // 最下辺
        case (Nil, _) => acc
          // 始め
        case (x :: xs, Nil) => go(xs, List(1 -> x))
        case (x :: xs, y :: ys) if x == y._2 => go(xs, y._1 + 1  -> y._2 :: ys)
        case (x :: xs, _ :: ys) => go(xs, 1 -> x :: acc)
      }
    }
    reverse(go(list, Nil))
  }
}
