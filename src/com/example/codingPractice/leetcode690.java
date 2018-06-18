package com.example.codingPractice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode690 {

    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

    ;

    public int getImportance( List<Employee> employees, int id ) {

        HashMap<Integer, Employee> map = new HashMap<>();
        for ( Employee e : employees ) {
            map.put( e.id, e );
        }

        int sum = 0;
        Queue<Employee> q = new LinkedList<>();
        q.add( map.get( id ) );
        while ( !q.isEmpty() ) {
            Employee curr = q.poll();
            sum += curr.importance;
            if ( curr.subordinates.size() > 0 ) {
                for ( int i : curr.subordinates ) q.add( map.get( i ) );
            }

        }

        return sum;
    }


}
