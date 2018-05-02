package org.kimutyam

class P15Spec extends UnitSpec {
  import P15._
  "p15" in {
    val actual = duplicateN(3, List(1, 2, 3))
    val expected = List(1,1,1,2,2,2,3,3,3)
    assert(actual === expected)
  }
  "p15 minus n" in {
    val actual = duplicateN(-1, List(1,2,3))
    val expected = List.empty
    assert(actual === expected)
  }
  "p15 empty list" in {
    val actual = duplicateN(0, List.empty)
    val expected = List.empty
    assert(actual === expected)
  }
}
