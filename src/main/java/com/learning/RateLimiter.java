package com.learning;

import java.util.*;

public class RateLimiter {

    public static int[] solve(int[] A, int[] B) {
        Map<Integer, List<Integer>> clientIdRequests = new HashMap<>();
        int C = 3; // Capacity
        int N = A.length;
        int[] ans = new int[N];
        for(int i = 0; i < N;i++) {
            int clientId = A[i];
            int timestamp = B[i];
            if (clientIdRequests.containsKey(clientId)) {
                // System.out.println("Entry found for clientId: " + clientId + " checking further");
                List<Integer> requests = clientIdRequests.get(clientId);

                Iterator<Integer> itr = requests.iterator();

                while (itr.hasNext()) {

                    // Remove elements which do not come in 10 sec window
                    // Iterator.remove()
                    int reqTime = itr.next();
                    int timeDiff = timestamp - reqTime;
                    // System.out.println("Current time diff " + timeDiff);
                    // System.out.println("Requests " + requests);
                    if (timeDiff >= 10) {
                        // System.out.println("Removing request with Timestamp" + reqTime+ " as 10 sec has passed current timestamp: " + timestamp);
                        itr.remove();
                    }
                    // System.out.println("Requests after removal" + requests);
                }

                int count = requests.size();
                // System.out.println("Current request count at index: " + i + " for client id : "+ clientId + " is "+ count);
                if(count < C) {
                    // System.out.println("Capacity is available, serving request");
                    requests.add(timestamp);
                    ans[i] = 1;
                } else {
                    // System.out.println("Capacity reached, denying request");
                    ans[i] = 0;
                }
            } else {
                // System.out.println("In else! adding new entry into map");
                List<Integer> requests = new ArrayList<>();
                requests.add(timestamp);
                clientIdRequests.put(clientId, requests);
                ans[i] = 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] A = {1, 1, 2, 1, 1, 1};
        int[] B = {1, 2, 2, 9, 10, 11};
        int[] ans = solve(A, B);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
