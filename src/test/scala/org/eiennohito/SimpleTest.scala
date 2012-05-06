package org.eiennohito

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FreeSpec

/**
 * @author eiennohito
 * @since 06.05.12
 */

class SimpleTest extends FreeSpec with ShouldMatchers {
  "This test" - {
    "at least runs" in {
      println("It runs")
    }

    "and sometimes fails" in {
      throw new Exception("My fail, sorry!")
    }
  }
}
