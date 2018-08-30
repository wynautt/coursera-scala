package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(11), 11))

  val s = union(union(singletonSet(1), singletonSet(2)), singletonSet(3))
  printSet(map(s, x => x * x))

  val s2 = (x: Int) => x > 0 && x < 10
  printSet(s2)
  printSet(union(s2,s2))
  printSet(intersect(s2,s2))
  printSet(map(s2, x => x * 10))
  printSet(union(s2, map(s2, x => x * 10)))
  printSet(intersect(s2, map(s2, x => x * 10)))
}
