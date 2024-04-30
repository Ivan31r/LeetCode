package main.algorithms.reverseLinkedList;

import main.algorithms.mergeTwoSortedLists.Solution.ListNode;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
    /*
    Head = [1,2,3,4,5]
    */
    }


    public static ListNode reverseList(ListNode head) {   // 1 -> 2 -> 3 -> null
        ListNode previousNode = null;                       //
        ListNode currentNode = head;

        while (currentNode != null) {

            ListNode nextNode = currentNode.next;           // 2     | 3 | null |   - ссылка на следующую ноду(что бы не потерять при замене ссылок)
            currentNode.next = previousNode;                // null  | 1 | 2    |   -замена ссылки указывающей со следующей ноды на предыдущую ноду
            previousNode = currentNode;                     // 1     | 2 | 3    |   -замена ссылки предыдущей ноды на текущую
            currentNode = nextNode;                         // 2     | 3 | null |   -замена ссылки текущей ноды

        }
        return previousNode;                                //                      -возвращаем с хвоста
    }

    public static ListNode reverseListV2(ListNode head) {   // 1 -> 2 -> 3 -> null
        ListNode revers = null;
        while (head != null) {
            ListNode node = head;
            head = head.next;
            node.next = revers;
            revers = node;
        }
        return revers;

    }

    public static ListNode reverseListV3(ListNode head) {   // 1 -> 2 -> 3 -> null
        if (head == null || head.next == null) {
            return head;
        }
        ListNode revers = reverseListV3(head.next);
        head.next.next = head;
        head.next = null;
        return revers;
    }

    public static ListNode revers(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode tempNode = current.next;
            current.next = prev;
            prev = current;
            current = tempNode;
        }

        return prev;
    }


}
