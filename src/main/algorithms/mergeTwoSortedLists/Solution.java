package main.algorithms.mergeTwoSortedLists;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        new ListNode(1);
//        List<Integer> list1 = new LinkedList<>(List.of(1, 2, 4));
//        List<Integer> list2 = new LinkedList<>(List.of(1, 3, 4));

        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode resultList = mergeTwoLists(listNode1, listNode2);
        System.out.println(resultList);


    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultList = new ListNode(0);
        ListNode currentNode = resultList;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;

        }

        currentNode.next = list1 != null ? list1 : list2;
        return resultList.next;
    }


    public static class ListNode {
       public int val;
       public ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
