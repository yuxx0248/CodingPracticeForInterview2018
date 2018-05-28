package com.example.codingPractice;

import java.util.HashMap;
import java.util.Map;

public class leetcode138 {
    class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode curr = head;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();

        while (curr != null){
            map.put(curr, new RandomListNode(curr.label));

            curr = curr.next;
        }

        curr = head;
        while (curr != null){
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);

            curr = curr.next;
        }

        return map.get(head);
    }

    public RandomListNode copyRandomListNoMap(RandomListNode head){
        if (head == null) return null;
        RandomListNode curr = head;
        RandomListNode next;


        while ( curr != null){
            next = curr.next;
            curr.next = new RandomListNode(curr.label);
            curr.next.next = next;

            curr = next;
        }

        curr = head;
        while (curr !=null){
            curr.next.random = curr.random.next;

            curr = curr.next.next;
        }

        curr = head;
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode copyList = dummy;

        while (curr != null){

            copyList.next = curr.next;
            copyList = copyList.next;

            curr.next = curr.next.next;

            curr = curr.next;
        }

        return dummy.next;
    }


    public RandomListNode enhanceCopyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = new HashMap<>();

        RandomListNode curr =  head;
        map.put(null, null);
        while (curr != null ){

            if (!map.containsKey(curr)) map.put(curr, new RandomListNode(curr.label));
                if (!map.containsKey(curr.next)) map.put(curr.next, new RandomListNode(curr.next.label));
                else map.get(curr).next = map.get(curr.next);


                if (!map.containsKey(curr.random)) map.put(curr.random, new RandomListNode(curr.random.label));
                else map.get(curr).random = map.get(curr.random);


            curr = curr.next;
        }

        return map.get(head);
    }

}
