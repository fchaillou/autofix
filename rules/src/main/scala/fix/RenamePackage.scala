package fix

import metaconfig.Configured
import scalafix.v1._
import scala.meta._

class RenamePackage extends SemanticRule("RenamePackage") {

  override def fix(implicit doc: SemanticDocument): Patch = {
    Patch.replaceSymbols(
      "org.scalatest.prop.Checkers" -> "org.scalatestplus.scalacheck.Checkers",
      "org.scalatest.prop.PropertyChecks" -> "org.scalatestplus.scalacheck.ScalaCheckPropertyChecks",
      "org.scalatest.prop.GeneratorDrivenPropertyChecks" -> "org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks"
    )
  }

}
