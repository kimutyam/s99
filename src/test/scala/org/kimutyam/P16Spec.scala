package org.kimutyam

class P16Spec extends UnitSpec {
  import P16._
  "p16" in {
    val actual = drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val expected =  List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    assert(actual === expected)
  }
}
