package org.kimutyam

import org.scalacheck.{Prop, Properties}

class P04Check extends Properties("p04"){
  property("length") = Prop.forAll { (s: List[Int]) =>
    P04.length(s) == s.length
  }
}
