import org.scalacheck._
import Arbitrary._
import Gen._
import org.scalacheck.Prop._
import org.scalacheck.ScalacheckShapeless._

object ExampleSpec extends Properties("Example") {

  property("integer addition is associative") = forAll { (i: Int, j: Int, k: Int) =>
    (i + j) + k == i + (j + k)
  }

}
