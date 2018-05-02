package org.kimutyam

object P06 {
  def isPalindrome[A](list: List[A]): Boolean = {
    P05.reverse(list) == list
  }
}
