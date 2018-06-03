package com.example.codingPractice;


public class removeMe {

    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        int[] res = searchRange(arr, 8);

        for (int i : res){
            System.out.println(i);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int left = helper(nums, target, true);
        if (left >= nums.length) return res;

        res[0] = left;
        res[1] = helper(nums, target, false);
        return res;

    }

    public static int helper(int[] nums, int target, boolean left){
        int start = 0;
        int end = nums.length;

        while (start < end){
            int mid = start + (end - start)/2;
            if (nums[mid] > target || (left && nums[mid] == target)) end = mid;
            else start = mid + 1;
        }

        return start;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode curr = lists[0];
        for (int i = 1; i<lists.length;i++){
            curr.next = mergeHelper(curr.next, lists[i]);
        }

        return curr.next;
    }

    public ListNode mergeHelper(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val){
            l1.next = mergeHelper(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeHelper(l1, l2.next);
            return l2;
        }
    }


}
