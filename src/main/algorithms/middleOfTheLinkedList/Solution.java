package main.algorithms.middleOfTheLinkedList;

import main.algorithms.mergeTwoSortedLists.Solution.ListNode;

public class Solution {
    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head) {
        ListNode slowIter = head;
        ListNode fastIter = head;
        while (fastIter != null && fastIter.next != null) {
            slowIter = slowIter.next;
            fastIter = fastIter.next.next;
        }
        return slowIter;
    }
}

/* Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
