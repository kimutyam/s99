package org.kimutyam

class P02Spec extends UnitSpec {
  "p02" in {
    import P02._
    assert(penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
  }
}
