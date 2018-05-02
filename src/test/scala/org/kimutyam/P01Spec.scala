package org.kimutyam

class P01Spec extends UnitSpec {
  import P01._
  "p01" in {
    assert(last(List(1, 1, 2, 3, 5, 8)) === 8)
  }
}
