package HundredEasySolvedProblems;

import java.util.LinkedList;

public class RemoveLinkedListElements {
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
        ListNode node = removeNthFromEnd(new ListNode(1), 1);
        System.out.println();
    }

    // 1,1,1,2,3,4,1 - 1
    // 2,3,4
    // [] 1
    // []

    //1,3,2,3,1 - 3
    //1,2,1

    //1,1,1,1 -
    // 1
    // 1 1
    // 2 2 2
    // 1 1 1
    // 2 2 2
    // []

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode d = new ListNode(), c = head, p = d;
        d.next = head;

        while (c != null) {
            if (c.val == val) {
                p.next = c.next;
            } else {
                p = c;
            }
            c = c.next;
        }
        return d.next;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        int index = 0;
        ListNode d = new ListNode(), c = head, p = d;
        d.next = head;
        while (c != null) {
            index += 1;
            c = c.next;
        }
        c = head;
        index -= n;
        if (index == 0) {
            return head.next;
        }
        int start = 1;
        while (c != null) {
            if (start == index) {
                p.next = c.next;
                break;
            } else {
                p = c;
            }
            c = c.next;
            ++start;
        }
        return d.next;
    }
}
