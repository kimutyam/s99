package org.kimutyam

import org.scalacheck.Prop.{BooleanOperators, forAll}
import org.scalacheck.Properties

class P02Check extends Properties("p02"){
  property("penultimate") = forAll { (s: List[Int]) =>
    (s.length >= 2) ==> {
      P02.penultimate(s) == s(s.length - 2)
    }
  }
}
