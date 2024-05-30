package com.learning;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] solve(int[] A, int B) {
        int n = A.length;
        int[] negative = new int[] {};

        Map<Integer, Integer> diffIdx = new HashMap<>();

        for (int i = 0; i <n; i++) {
            int diff = B - A[i];
            if(diffIdx.containsKey(diff)) {
                return new int[] {diffIdx.get(diff) + 1, i + 1};
            }
            if(!diffIdx.containsKey(A[i])) {
                diffIdx.put(A[i], i);
            }
        }
        return negative;
     }
    public static void main(String[] args) {
        int[] A = new int[] { 2, 7, 11, 15 };
        int B = 9;
        int[] result = solve(A, B);
        System.out.println("Output for TC: 1");
        for (int j : result) {
            System.out.print(j + " ");
        }
        System.out.println();
        int[] A1 = new int[] { 4,7,-4,2,2,2,3,-5,-3,9,-4,9,-7,7,-1,9,9,4,1,-4,-2,3,-3,-5,4,-7,7,9,-4,4,-8 };
        int B1 = -3;
        int[] result1 = solve(A1, B1);
        System.out.println("Output for TC: 2");
        for (int j : result1) {
            System.out.print(j + " ");
        }
    }
}
