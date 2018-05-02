package org.kimutyam

import org.scalacheck.{Prop, Properties}

class P07Check extends Properties("p07"){
  property("flatten") = Prop.forAll { s: List[List[Int]] =>
    P07.flatten(s) == s.flatten
  }
}
