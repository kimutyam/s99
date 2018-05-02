package org.kimutyam

class P10Spec extends UnitSpec {
  "p10" in {
    import P10._
    val actual = encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected =  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    println(actual)
    println(expected)
    assert(actual === expected)
  }
}
