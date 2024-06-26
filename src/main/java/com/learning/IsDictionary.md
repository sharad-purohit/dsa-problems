## Problem Description
Surprisingly, in an alien language, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
Given an array of words A of size N written in the alien language, and the order of the alphabet denoted by string B of size 26, return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.



## Problem Constraints
```text
1 <= N, length of each word <= 105
Sum of the length of all words <= 2 * 106
```

## Input Format
```text
The first argument is a string array A of size N.
The second argument is a string B of size 26, denoting the order.
```

## Output Format
```text
Return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.
```


## Example Input
__Input 1:__
```text
A = ["hello", "scaler", "interviewbit"]
B = "adhbcfegskjlponmirqtxwuvzy"
```

__Input 2:__
```text
A = ["fine", "none", "bush"]
B = "qwertyuiopasdfghjklzxcvbnm"
```

## Example Output
__Output 1:__
```text
1
```

__Output 2:__
```text
0
```

