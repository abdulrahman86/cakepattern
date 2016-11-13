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

class D2 extends A2{
  override def a = "D"
}

class E2 extends D2 with B2 with C2

new E2().a