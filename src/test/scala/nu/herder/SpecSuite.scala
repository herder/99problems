package nu.herder

import org.specs2.mutable.{Specification}
import org.specs2.runner.JUnitRunner
import org.junit.runner.RunWith


/**
 * Created by IntelliJ IDEA.
 * User: niklas
 * Date: 08/04/12
 * Time: 15:06
 */
@RunWith(classOf[JUnitRunner])
class SpecSuite extends Specification {
  "99Problems " should {
    "1: find the last element " in {
      Problems.findLast(List(1, 2, 4, 5, 6)) mustEqual 6
    }

    "2: find the penultimate element " in {
      Problems.findPenultimate(List(1,2,3,4,5)) mustEqual 4
    }

    "3: find the nth element " in {
      Problems.findNth(3, List(1,2,3,4)) mustEqual(4)
    }

    "4: Find the number of elements in a list " in {
      Problems.findNumberOfElems(List(1,4,5)) mustEqual 3
    }

    "5: Reverse a list" in {
      Problems.reverseList(List(1,2,3)) mustEqual List(3,2,1)
    }

    "6: Find if a palindrome " in {
      Problems.isPalindrome(List(1,2,3,2,1)) mustEqual true
      Problems.isPalindrome(List(1,2,3,4,2,1)) mustEqual false
    }
  }
}
