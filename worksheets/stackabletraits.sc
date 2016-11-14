//------Stackable Trait 1 ------------//

abstract class A1{
  def a: String
}

class C1 extends A1{
  override def a = "C"
}

trait B1 extends A1{
  abstract override def a = "B" + super.a
}


class D1 extends C1 with B1

val x = new D1().a

//------Stackable Trait 2 ------------//

trait A2{
  def a: String
}

trait B2 extends A2{
  override def a: String = "B"
}

trait C2 extends A2{
  abstract override def a: String = "C" + super.a
}

class D2 extends B2 with C2{
  override def a = "D" + super.a
}

new D2().a

//------Stackable Trait 3 ------------//

trait A {
  def foo(): String = ""
}

trait B extends A {
  abstract override def foo() = "B" + super.foo()
}

trait C extends B {
  abstract override def foo() = "C" + super.foo()
}

trait D extends A {
  abstract override def foo() = "D" + super.foo()
}

class E extends A{
  override def foo() = "E"
}

var d = new E with D with C with B;
d.foo() //prints CBDE

class F extends A with D with C with B{
  override def foo() = "F" + super.foo()
}

new F().foo
