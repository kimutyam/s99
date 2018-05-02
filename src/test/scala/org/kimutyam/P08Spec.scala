package org.kimutyam

class P08Spec extends UnitSpec {
  "p08" in {
    import P08._
    val actual = compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected = List('a, 'b, 'c, 'a, 'd, 'e)
    assert(actual === expected)
  }
}
