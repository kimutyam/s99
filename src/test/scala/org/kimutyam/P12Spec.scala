package org.kimutyam

class P12Spec extends UnitSpec {
  "p12" in {
    import P12._
    val actual = decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    val expected = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(actual === expected)
  }
}
