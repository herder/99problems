package nu.herder

import collection.immutable.List

/**
 * 99 Problems...
 *
 */
object Problems {

  def flattenList[T](list: List[T]): List[T] = list match {
  case Nil => Nil
  case (x: List[T]) :: xs => flattenList(x) ::: flattenList(xs)
  case (x: T) :: xs => x :: flattenList(xs)
  }


  def isPalindrome[T](list: List[T]): Boolean = list match {
  case x :: Nil => true
  case Nil => true
  case x :: xs => xs.last == x && isPalindrome(xs.init)
  }


  def reverseList[T](list: List[T]): List[T] = list match {
  case Nil => Nil
  case x :: Nil => List(x)
  case x :: xs => reverseList(xs) ::: List(x)
  }

  def findNumberOfElems[T](list: List[T]): Int = {

    def innerFindNumbers(i: Int, list: List[T]): Int = list match {
    case Nil => i
    case _ :: xs => innerFindNumbers(i + 1, xs)
    }
    innerFindNumbers(0, list)
  }


  def findNth[T](n: Int, list: List[T]): T =
    if (list.isEmpty || n < 0) {
      throw new NoSuchElementException
    }
    else
    if (n == 0) {
      list.head
    }
    else {
      findNth(n - 1, list.tail)
    }

  def findPenultimate[T](list: List[T]): T = list match {
  case x :: y :: Nil => x
  case _ :: xs => findPenultimate(xs)
  case _ => throw new IllegalArgumentException
  }


  def findLast[T](list: List[T]): T = list match {
  case Nil => throw new IllegalArgumentException("Empty list")
  case x :: Nil => x
  case _ :: xs => findLast(xs)
  }

  def compress[T](list: List[T]): List[T] = list match {
  case Nil => Nil
  case x :: Nil => x :: Nil
  case x :: y :: xs => if (x == y) {
    compress(x :: xs)
  }
  else {
    x :: compress(y :: xs)
  }
  }
}
