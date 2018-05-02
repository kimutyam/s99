package org.kimutyam

class P05Spec extends UnitSpec {
  "p05" in {
    import P05._
    val actual = reverse(List(1, 1, 2, 3, 5, 8))
    val expected = List(8, 5, 3, 2, 1, 1)
    assert(actual === expected)
  }
}
