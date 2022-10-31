package example

object Hello extends Greeting with App {
  println("hello")
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
