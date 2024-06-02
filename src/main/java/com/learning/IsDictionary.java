package com.learning;

import java.util.HashMap;
import java.util.Map;

public class IsDictionary {

    public static boolean isSorted(String a, String b, Map<Character, Integer> lexOrder) {
        if (a.isEmpty()) {
            return true;
        }
        if (b.isEmpty()) {
            return false;
        }
//        System.out.println("a: " + a.charAt(0) + " b: " + b.charAt(0));
        if (lexOrder.get(a.charAt(0)) < lexOrder.get(b.charAt(0))) {
            return true;
        }
        if (lexOrder.get(a.charAt(0)) > lexOrder.get(b.charAt(0))) {
            System.out.println("false");
            return false;
        }
        return isSorted(a.substring(1), b.substring(1), lexOrder);
    }
    public static int solve(String[] A, String B) {
        Map<Character, Integer> lexOrder = new HashMap<>();
        for (int i =0; i< 26; i++){
            lexOrder.put(B.charAt(i), i);
        }
        for (int i = 0; i < A.length-1; i++) {
            System.out.println(i);
            if (!isSorted(A[i], A[i+1], lexOrder)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        String[] A = new String[] {"hello", "scaler", "interviewbit"};
        String B = "adhbcfegskjlponmirqtxwuvzy";
        int result = solve(A, B);
        System.out.println("Output for TC: 1");
        System.out.println(result);
        String[] A1 = new String[] {"fine", "none", "bush"};
        String B1 = "qwertyuiopasdfghjklzxcvbnm";
        int result1 = solve(A1, B1);
        System.out.println("Output for TC: 2");
        System.out.println(result1);
    }


}
