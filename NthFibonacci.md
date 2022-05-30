# NthFibonacci
* Fibonacci is as follows: first number in secuence is [0], second [1] amd the nth is the sum of (n - 1) and (n - 2) numbers
* Write a function that takes a [n] integer and returns the Nth fibonacci
* Input: n = 2
* Output: 1

* Constraints
    * fib(n) = fib(n-1) + fib(n-2) --> for n > 2

* Examples:
```
0, 1, 1, 2, 3, 5, 8, 13, 21, 34

Example 8
5 + 3 = 8
Example 34
13 + 21 = 34 
```
* Solution Brute Force --> Recursion
* Pseudo Code
```
if n ==2;
    return 1
elif(n = 1)
    return 0
else 
    return fib(n-1) + fib(n-2)
```
* Code O(n^2)T and O(n)S --> Because we start we call to more elements and the next call another 2 elements its always 2 times 2 times 2 times so its n times
```
class Program {
  public static int getNthFib(int n) {
    // Write your code here.
		if(n == 2){
			return 1;
		} else if(n == 1){
			return 0;
		} else {
			return 	getNthFib(n - 1) + getNthFib(n - 2);
		}
  }
}
```

* Solution Store calculations in HashTable and the access in constant time
* O(n)T, O(n)S because is constant time --> constant because for example fib(6) then calculates fib(5) then fib(4)
* Pseudo Code
```
if n is in  table
    return table[n]
else
    store in table[n] fib(n - 1) + fib(n - 2)
    return table[n]
```
* Code
```
class Program {
  public static int getNthFib(int n) {
    // Create HashTable
		Map<Integer, Integer> table = new HashMap<Integer, Integer>();
		// Put First two values 1 points to 0 and 2 points to 1
		table.put(1, 0);
		table.put(2, 1);
		return getNthFib(n, table);
  }
	
	public static int getNthFib(int n, Map<Integer, Integer> table){
		if(table.containsKey(n)){
			return table.get(n);
		} else {
			table.put(n, getNthFib(n - 1, table) + getNthFib(n - 2, table));
			return table.get(n);
		}
	}
}
```
* Solution Array
* O(n)T and O(1)S
* Store in array forst 2 numbers and then next calculate next 2 fib numbers
* Pseudo Code
```
array [0, 1];
nextNum;
array [1, 2];
nextNum;
array [2, 3];
```
* Code
```
class Program {
  public static int getNthFib(int n) {
		// Create Array with base case two number
		int [] lastTwo = {0, 1};
		// Counter that init the third number
		int counter = 3;
		// Iteration
		while(counter <= n){
			// Calculate nex fib num
			int nextFib = lastTwo[0] + lastTwo[1];
			// Set lastTwo to the next num
			lastTwo[0] = lastTwo[1];
			// next fib
			lastTwo[1] = nextFib;
			counter ++;
		}
		// edge case if we call num 1
		return n > 1 ? lastTwo[1] : lastTwo[0];
	}
}
```

