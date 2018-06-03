package com.example.codingPractice;

import java.security.PublicKey;
import java.util.Comparator;
import java.util.PriorityQueue;

public class leetcode23 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    /**
     * Using Recursion here
     * @param lists
     * @return
     */
    public ListNode mergeKListsRecursive(ListNode[] lists) {
        if (lists.length < 1) return null;
        if (lists.length == 1) return lists[0];
        ListNode res = lists[0];

        for (int i = 1 ; i< lists.length;i++){
            res = merge(res, lists[i]);
        }

        return res;
    }

    public ListNode merge(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val){
            l1.next = merge(l1.next, l2);
            return l1;
        }else{
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

    /**
     * Using Priority Queue here
     */
    public ListNode mergeKListsPQueue(ListNode[] lists){
        if (lists == null || lists.length<1) return null;
        if (lists.length == 1) return lists[0];
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        for (ListNode l :  lists){
            if ( l!=null ) pq.add(l);
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!pq.isEmpty()){
            curr.next = pq.poll();
            curr = curr.next;

            if (curr.next != null) pq.add(curr.next);
        }

        return dummy.next;
    }

}
