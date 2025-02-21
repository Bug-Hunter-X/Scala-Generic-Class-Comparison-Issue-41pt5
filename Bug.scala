```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): Boolean = {
    value == other.value
  }
}

object Main extends App {
  val obj1 = new MyClass(10)
  val obj2 = new MyClass(10)
  val obj3 = new MyClass("hello")
  val obj4 = new MyClass("hello")

  println(obj1.myMethod(obj2)) // true
  println(obj3.myMethod(obj4)) // true

  val obj5 = new MyClass[Int](10)
  val obj6 = new MyClass[Any](10)
  println(obj5.myMethod(obj6)) // false because of type mismatch
}
```