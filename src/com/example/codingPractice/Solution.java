package com.example.codingPractice;


import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        customSort(arr);
    }

    static void customSort(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        //put into map
        for (int i : arr){
            if (!map.containsKey(i)){
                map.put(i, 1);
            }else {
                map.put(i, map.get(i)+1);
            }
        }

        List<List<Integer>> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            while (entry.getValue() > list.size()) list.add(new ArrayList<>());
            list.get(entry.getValue()-1).add(entry.getKey());
        }

        int[] res = new int[arr.length];
        int count = 0;

        for (int i = 0;i<list.size();i++){
            for (int j:list.get(i)){
                res[count++] = j;
            }
        }


    }

    static void freq (int[] arr){
        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();

    }



}