# Minimum Waiting Time
* Non empty array, representing the time of specific queries.  Only one query at a time.
* Input : array [3, 2, 1, 2, 6];
* Output Int --> 17

* Pick an order to make queries and make the minimum time of waiting
* Example execute queries first duration 6, then 1, 2, 2 and duration 3
* How lonmg a query must wait until it gets executed

* Understanding:
```
6   1   2   2   3
|   |   |   |   |
0s  6s 6+1s 9s  11s
```
* We need to sum to have the total query time: 11 + 9 = 20, 6 + 7 = 13 --> Total = 33
    * This is not optimized cause its not the minimum waiting time that its 17

* Examples:
```
[100] --> Its one query so it takes 0s
[100, 1] --> It takes 100s because second query needs to wait 100 to get executed
```

* Solution:
    * Order affects the time of execution
    * if we execute from minimum to max value its a better executiom
    ```
    Example1:
    [6,1] --> It takes 6s
    If we change the order
    [1, 6] --> It has only a waiting time of 1s

    Example2:
    [6, 1, 2, 2, 3] --> 6 + 7 + 9 + 11 = 33
    [1, 2, 2, 3, 6] --> 0 + 1 + (1+2) + (1+2+2) + (1+2+2+3) = 17
    ```
* Pseudo Code --> O(log(n)) T beacuse we sort the input array and the Iterate, 0(1) S no extra space and its constant
```
Arrays.sort(array)
int totalExec = 0; (beacuse it always start in 0)
count array without first element and multiply length * first num
totalExec = count;
move to second elem --> So all the followings elements will need to wait the number in elem 2 before it gets executed
count array without first and second element and multiply length * second num
totalExec += count;
.
.
```
* Code
```
class Program {

  public int minimumWaitingTime(int[] queries) {
    // Write your code here.
		Arrays.sort(queries);
		int totalExec = 0;
		for(int idx = 0; idx < queries.length; idx ++){
			int duration = queries[idx];
			int queriesLeft = queries.length - (idx + 1);
			totalExec += duration * queriesLeft;
		}
    return totalExec;
  }
}
```

