package HundredEasySolvedProblems;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseLinkedList {

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
    }

    public static void main(String[] args) {
        System.out.println(reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
    }

    // 1, 2, 3, 4
    // 1
    // 2, 1
    // 3, 2, 1
    // 4, 3, 2, 1
    public static ListNode reverseList(ListNode head) {
        ListNode current = head, prev = null;

        while (current != null) {
            ListNode node = current.next;
            current.next = prev;
            prev = current;
            current = node;
        }
        return prev;
    }
}
