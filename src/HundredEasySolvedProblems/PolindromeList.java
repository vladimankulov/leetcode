package HundredEasySolvedProblems;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringJoiner;

public class PolindromeList {

  public static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    public static void main(String[] args) {
      //1,2,2,1
      // mid int index 2
      ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(1))));
//      ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
//      ListNode head = new ListNode(2,
//          new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
//      ListNode head = new ListNode(1, new ListNode(1));
//      ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
      System.out.println(isPalindrome(head));
    }


    public static boolean isPalindromeListUsingStack(ListNode head) {
      if (head == null || head.next == null) {
        return true;
      }

      boolean isListIsEven = false;

      ListNode mid = head, fast = head;
      Deque<Integer> stack = new LinkedList<>();
      while (true) {
        if (fast == null) {
          isListIsEven = true;
          break;
        }
        if (fast.next == null) {
          break;
        }
        stack.addLast(mid.val);
        mid = mid.next;
        fast = fast.next.next;

      }
      if (isListIsEven) {
        return isStackIsPalindrome(stack, mid);
      } else {
        return isStackIsPalindrome(stack, mid.next);
      }
    }
    public static boolean isPalindrome(ListNode head) {
      if (head == null || head.next == null) {
        return true;
      }
      boolean isListIsEven = false;
      ListNode mid = head, fast = head;
      while (true) {
        if (fast == null) {
          isListIsEven = true;
          break;
        }
        if (fast.next == null) {
          break;
        }
        mid = mid.next;
        fast = fast.next.next;

      }
      ListNode nextMiddle = reverse(isListIsEven ? mid : mid.next);
      while (head != null && nextMiddle != null) {
        if (head.val != nextMiddle.val) {
          return false;
        }
        head = head.next;
        nextMiddle = nextMiddle.next;
      }
      return true;
    }

    private static boolean isStackIsPalindrome(Deque<Integer> stack, ListNode node) {
      while (node != null) {
        if (stack.removeLast() != node.val) {
          return false;
        }
        node = node.next;
      }
      return stack.size() == 0;
    }

    public static ListNode findMiddle(ListNode head) {
      ListNode slow = head, fast = head.next;
      while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      }

      return slow;
    }

    public static ListNode reverse(ListNode head) {
      ListNode prev = null, curr = head, next;
      while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }

      return prev;
    }
  }
}
