package org.kimutyam

class P17Spec extends UnitSpec {
  "P17Spec" should {
    "split" in {
      val actual = P17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      val expected = (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      assert(actual === expected)
    }
    "over" in {
      val actual = P17.split(3, List('a))
      val expected = (List('a), Nil)
      assert(actual === expected)
    }
    "empty list" in {
      val actual = P17.split(3, List())
      val expected = (Nil, Nil)
      assert(actual === expected)
    }
  }
}
