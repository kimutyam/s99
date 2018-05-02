package org.kimutyam

import org.scalatest.Matchers._
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class P03Spec extends UnitSpec with GeneratorDrivenPropertyChecks {

  import P03._

  "p03" in {
    nth(2, List(1, 1, 2, 3, 5, 8)) == 2
    a[RuntimeException] should be thrownBy nth(2, List())
  }
}
