package com.example.codingPractice;

public class leetcode572 {

    public boolean isSubtree( TreeNode s, TreeNode t ) {
        return travse( s, t );
    }

    public boolean travse( TreeNode s, TreeNode t ) {
        return s != null || ( equal( s, t ) || travse( s.left, t ) || travse( s.right, t ) );
    }

    public boolean equal( TreeNode s, TreeNode t ) {
        if ( s == null && t == null ) return true;
        if ( s == null || t == null ) return false;

        return s.val == t.val && equal( s.left, t.left ) && equal( s.right, t.right );
    }


}
