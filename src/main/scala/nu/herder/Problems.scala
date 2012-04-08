package nu.herder

import collection.immutable.List

/**
 * 99 Problems...
 *
 */
object Problems {

  def isPalindrome[T](list: List[T]) : Boolean = list match {
  case x :: Nil => true
  case x :: xs => xs.last == x && isPalindrome(xs.init)
  case _ => true
  }



  def reverseList[T](list: List[T]): List[T] = list.foldLeft(List[T]()) { (a, b) => b :: a}

  def findNumberOfElems[T](list: List[T]): Int = {

    def innerFindNumbers(i: Int, list: List[T]): Int = list match {
    case _ :: Nil => i
    case _ :: xs => innerFindNumbers(i + 1, list.tail)
    case _ => 0
    }
    innerFindNumbers(1, list)
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
  case x :: Nil => x
  case _ :: xs => findLast(xs)
  case _ => throw new IllegalArgumentException("Empty list")
  }
}