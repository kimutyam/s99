package org.kimutyam

import org.scalacheck.Prop.{BooleanOperators, forAll}
import org.scalacheck.Properties

class P01Check extends Properties("P01") {
  property("last()") = forAll { (s: List[Int]) =>
    s.nonEmpty ==> {
      P01.last(s) == s.last
    }
  }
}