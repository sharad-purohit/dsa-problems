## Problem Description
Design a rate limiter system. A rate limiter limits the number of client requests allowed to be sent over a specified period.
You are given N client requests where A[i] gives the client ID and B[i] gives the timestamp t for the i-th request. 
The rate limiter allows 3 requests from a client in every 10 sec interval. In other words, there can be at most 3 
successful requests from each client in any time interval [t, t+10).
All requests will come in chronological order. Several requests may arrive at the same timestamp.
The answer to the i-th request should be 1 if the request is successful and 0 if the request fails.

## Problem Constraints
```text
1 <= N <= 10^5
1 <= A[i] <= 10^9
1 <= B[i] <= 10^5
```

## Input Format
```text
First argument A is an array of integer denoting the client ID for each request.
Second argument B is an array of integer denoting the timestamp for each request.
```

## Output Format
```text
Return an array of integer denoting the answer to each request.
```

## Example Input
__Input 1:__
```text
A = [1, 1, 2, 1, 1, 1]
B = [1, 2, 2, 9, 10, 11]
```
__Input 2:__
```text
A = [2, 2, 2, 2]
B = [3, 3, 8, 12]
```

## Example Output
__Output 1:__
```text
[1, 1, 1, 1, 0, 1]
```

__Output 2:__
```text
[1, 1, 1, 0]
```
## Example Explanation
__For Input 1:__
```text
The request made by client 1 at time 10 sec fails as there
already exist successful request made by the client at time 1,
2 and 9 sec.
All other requests result in success.
```
__For Input 2:__
```text
The first three requests made by client 3 are successful. The
fourth request fails as there already exist 3 successful request
made by the client in the last 10 sec.
```
