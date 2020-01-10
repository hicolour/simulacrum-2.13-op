object  OpAnnotationException extends App {

  import simulacrum._

  @typeclass trait Semigroup[A] {
   def append(x: A, y: A): A
  }
}
