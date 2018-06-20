package com.example.codingPractice;

public class tmp {

    public void sortColors( int[] nums ) {
        int start = 0;
        int end = nums.length - 1;
        int i = 0;
        while ( i < end ) {
            if ( nums[ i ] == 0 ) {
                swap( nums, start++, i );
                i = start;
            } else if ( nums[ i ] == 2 ) swap( nums, end--, i );
            else i++;
        }
    }

    public void swap( int[] nums, int i, int j ) {
        int tmp = nums[ i ];
        nums[ i ] = nums[ j ];
        nums[ j ] = tmp;
    }


    public ListNode mergeTwoLists( ListNode l1, ListNode l2 ) {
        ListNode res = new ListNode( 0 );
        ListNode ptr = res;
        while ( l1 != null && l2 != null ) {
            if ( l1.val < l2.val ) {
                res.next = new ListNode( l1.val );
                l1 = l1.next;
                res = res.next;
            } else {
                res.next = new ListNode( l2.val );
                l2 = l2.next;
                res = res.next;
            }
        }

        while ( l1 != null ) {
            res.next = new ListNode( l1.val );
            res = res.next;
            l1 = l1.next;
        }

        while ( l2 != null ) {
            res.next = new ListNode( l2.val );
            res = res.next;
            l2 = l2.next;
        }

        return ptr.next;
    }

    private int expandAroundCenter(String s, int L, int R) {
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }


    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }


}
