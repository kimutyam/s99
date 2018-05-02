package org.kimutyam

import org.scalacheck.{Prop, Properties}

class P05Check extends Properties("p05"){
  property("reverse") = Prop.forAll { (list: List[Int]) =>
    P05.reverse(list) == list.reverse
  }
}
