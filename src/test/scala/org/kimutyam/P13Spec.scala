package org.kimutyam

class P13Spec extends UnitSpec {
  "p13" in {
    import P13._
    val actual = encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    assert(actual === expected)
  }
  //todo property base
}
