package org.kimutyam

import org.scalatest.MustMatchers

class P06Spec extends UnitSpec with MustMatchers {
  "p06" in {
    import P06._
    isPalindrome(List(1,2,3,2,1)) must be (true)
    isPalindrome(List(1,4,3,2,1)) must be (false)
  }
}
