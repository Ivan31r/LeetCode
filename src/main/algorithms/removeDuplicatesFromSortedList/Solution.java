package main.algorithms.removeDuplicatesFromSortedList;


import main.algorithms.mergeTwoSortedLists.Solution.ListNode;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null)))));
        deleteDuplicates(head);
        System.out.println(head);
    /*
    [1,1,2,3,3]
    */
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }


}


