/*
rule = RenamePackage
 */
package test

import org.scalatest._
import org.scalatest.prop.{Checkers, PropertyChecks}

class RenameCheckersSpec3 extends FunSuite with Checkers {
  
  test("test concat") {
    check((a: List[Int], b: List[Int]) => a.size + b.size == (a ::: b).size)
  }
}
