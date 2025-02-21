```scala
class MyClass[T](val value: T) {
  override def equals(obj: Any): Boolean = {
    obj match {
      case that: MyClass[_] => this.value == that.value
      case _ => false
    }
  }
}

object Main extends App {
  val obj1 = new MyClass(10)
  val obj2 = new MyClass(10)
  val obj3 = new MyClass("hello")
  val obj4 = new MyClass("hello")

  println(obj1.equals(obj2)) // true
  println(obj3.equals(obj4)) // true

  val obj5 = new MyClass[Int](10)
  val obj6 = new MyClass[Any](10)
  println(obj5.equals(obj6)) // true, now handles Any type correctly
}
```