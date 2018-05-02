package org.kimutyam

class P07Spec extends UnitSpec {
  "p07" in {
    import P07._
    val actual = flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    val expected = List(1, 1, 2, 3, 5, 8)
    assert(actual === expected)
  }
}
