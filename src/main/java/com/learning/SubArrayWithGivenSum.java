package com.learning;

public class SubArrayWithGivenSum {

    public static int[] solve(int[] A, int B) {
        int n = A.length;
        int[] negative = new int[] {-1};
        int start = 0, end = 0, sum = 0;

        while (start<n && end<n) {
            if(sum < B) {
                sum += A[end];
                end++;
            }
            if(sum > B) {
                sum -= A[start];
                start++;
            }
            if(sum == B) {
                int[] result = new int[end-start];
                for(int i=start; i<end; i++) {
                    result[i-start] = A[i];
                }
                return result;
            }
        }
        return negative;
    }
    public static void main(String[] args) {
        // TC: 1
        int[] A = new int[] {1, 2, 3, 7, 5};
        int B = 12;
        int[] result = solve(A, B);
        System.out.println("Output for TC: 1");
        for (int j : result) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Output for TC: 2");
        // TC: 2
        int[] A1 = new int[] {5, 10, 20, 100, 105};
        int B1 = 110;
        int[] result1 = solve(A1, B1);
        for (int j : result1) {
            System.out.print(j + " ");
        }
    }
}
