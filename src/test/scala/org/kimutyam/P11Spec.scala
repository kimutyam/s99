package org.kimutyam

class P11Spec extends UnitSpec {
  "p11" in {
    import P11._
    val actual = encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    assert(actual === expected)
  }
}
