package org.kimutyam

object P03 {
  def nth[A](k: Int, list: List[A]): A = {
    require(k >= 0, "k < 0")
    require(list.nonEmpty)

    list match {
      case x :: _ if k == 0 => x
      case _ :: xs if k > 0 => nth(k - 1, xs)
      case _ => sys.error("")
    }
  }
}
