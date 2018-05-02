package org.kimutyam

object P08 {
  def compress[A](list: List[A]): List[A] = {
    def compress1(index: A, acc: List[A]):List[A] = {
      acc match {
        case x :: xs if index == x => compress1(index, xs)
        case x :: xs => index :: compress1(x, xs)
        case Nil => index :: Nil
      }
    }
    list match {
      case x :: xs => compress1(x, xs)
      case Nil => Nil
    }
  }
}
