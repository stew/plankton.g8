import scala.Array

object Hello {
  final def main(argv: Array[String]): Unit =
    println("1 and 1 and 1 is " + (1 |+| 1 |+| 1).show)
}
