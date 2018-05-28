package com.example.codingPractice;

import java.util.HashMap;
import java.util.Map;

public class deepCopyNode {
      class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
  };

    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode curr = head;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        while (curr!= null){
            map.put(curr, new RandomListNode(curr.label));

            curr = curr.next;
        }

        curr = head;
        while (curr!=null){
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);

            curr = curr.next;
        }

        return map.get(head);
    }

    public RandomListNode copyRandomListInter(RandomListNode head) {
        RandomListNode curr = head;
        while (curr!=null){

            RandomListNode next = curr.next;
            RandomListNode copy = new RandomListNode(curr.label);
            curr.next = copy;
            copy.next = next;

            curr = copy.next;
        }

        curr = head;
        while (curr!=null){
            RandomListNode copy = curr.next;

            copy.random = curr.random.next;

            curr = curr.next.next;
        }

        RandomListNode dummy = new RandomListNode(0);
        curr = head;
        RandomListNode copyRes = dummy;
        RandomListNode copy;

        while (curr!=null){

            copy = curr.next;
            copyRes.next = copy;
            copyRes = copyRes.next;
            curr.next = curr.next.next;

            curr = curr.next;
        }

        return copyRes;
    }
}
