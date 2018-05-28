package com.example.codingPractice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class blackRock2 {

    public static void main (String[] args) {
        List<Issuer> issuers = new LinkedList<>();
        createIssuerTree(issuers);

    }

        /*
     * Complete the function below.
     */
    static void createIssuerTree(List<Issuer> issuers) {
        HashMap<String, String> map = new HashMap();
        int level = 0;
        for (int i = 0; i< issuers.size();i++){
            Issuer curr = issuers.get(i);
            if(i == 0) {
                System.out.println(curr.id);
                map.put(curr.id, String.valueOf(level++));
            }
            else{
                if (!map.get(curr.parentId).equals(map.get(issuers.get(i-1).parentId))) {
                    System.out.println();
                    level++;

                }
                System.out.print(issuers.get(i).id + " ");
                map.put(curr.id, String.valueOf(level));
            }
        }

        for (Map.Entry entry : map.entrySet()){
            System.out.print(entry.getKey());
        }

    }

    /**
     * Issuer class struture, do no modify
     */
    private static class Issuer {
        String parentId;
        String id;
        Issuer(String parentId, String id) {
            this.parentId = parentId;
            this.id = id;

        }
    }


}
