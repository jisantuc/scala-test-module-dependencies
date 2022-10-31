package testLib

trait TestFixtures[Test] {

  def flaky: Unit

  implicit class annotations(test: Test) {
    def clue(s: String): Test = {
      println(s)
      test
    }
  }
}
