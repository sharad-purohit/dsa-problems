## Problem Description
Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
If the answer does not exist return an array with a single integer "-1".
First sub-array means the sub-array for which starting index in minimum.

## Problem Constraints
```text
1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 109
```

## Input Format
```text
The first argument given is the integer array A.
The second argument given is integer B.
```

## Output Format
```text
Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single integer "-1".
```

## Example Input
__Input 1:__
```text
A = [1, 2, 3, 4, 5]
B = 5
```

__Input 2:__
```text
A = [5, 10, 20, 100, 105]
B = 110
```


## Example Output
__Output 1:__
```text
[2, 3]
```

__Output 2:__
```text
[-1]
```

## Example Explanation
__Explanation 1:__

```text
[2, 3] sums up to 5.
```

__Explanation 2:__
```text
No subarray sums up to required number.
```

