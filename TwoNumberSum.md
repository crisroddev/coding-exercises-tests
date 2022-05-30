# Two Number Sum
* Pair of numbers in an array that sums the target sum
* Array: [3,5,-4,8,11,1,-1,6]
* TargetSum = 10
* Input: The array
* Output should gave the pair that matches the TargetSum
* Examples:
```
Input: array = [3,5,-4,8,11,1,-1,6]
Output: [11, -1] => 11 - 1 = 10
```
* 2 For Loops and taverse the sum => O(n^2) Time and O(1)=> Not optimal
* Hash Table: Traverse array and store numbers in a Hash Table => With this we can access integers in the hash table => O(n) Time and O(n) Space beacuse we are adding values to the HashTable
```
targetSum = 10
currentNum = x
Find y => x + y = 10 | y = 10- x
We need to find Y, if Y is in the hash table O(n) we return [x,y]
hash = []
3 -->  y = 10 - 3 = 7 --> its 7 in the hash table? No so we store it
hash = [3]
5 --> y = 10 - 5 = 5 --> its 5 in the hash table? No so we store it
hash = [3, 5]
-4 --> y = 10 - (-4) = -14 --> its -14 in the hash table? No so we store it
hash = [3, 5, -4]
8 --> y = 10 - 8 = 2 --> its 2 in the hash table? No so we store it
hash = [3, 5, -4, 8]
11 --> y = 10 - 11 = -1 --> its -1 in the hash table? No so we store it
hash = [3, 5, -4, 8, 11]
1 --> y = 10 - 1 = -9 --> its -9 in the hash table? No so we store it
hash = [3, 5, -4, 8, 11]
-1 --> y = 10 - (-1) = 11 --> its -11 in the hash table, true
[11, -1]
```
* More optimal, sort array => O(log(n)) Time and O(1) Soace beacuse we dont use more space
```
sort array
And the sum up first with last number, if its not match we move the left to the rigth cause we now if we move the right would be even less than
[-4, -1, 1, 3, 5, 6, 8, 11]
-4 + 11 = 7 => No Match
-1 + 11 = 10 => Match
[11, -1]
```

## Coding
* For Loops => O(n^2) T, O(1) Space
```
class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here
		for (int i = 0; i < array.length; i++){
			int firstNum = array[i];
			for(int j = i + 1; j < array.length; j ++){
				int secondNum = array[j];
					if(firstNum + secondNum == targetSum){
						return new int[] {firstNum, secondNum};
					}
			}
		}
		return new int[0];
  }
}
```
* HashSet => O(n) T, O(n) S --> Best if you look time complexity
```
class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		Set<Integer> nums = new HashSet<>();
		for(int num : array){
			int y = targetSum - num;
			if(nums.contains(y)){
				return new int[]{y, num};
			} else {
				nums.add(num);
			}
		}
		return new int[0];
  }
}
```
* Sort Array => O(log(n)) Time and O(1) Space --> Best if you look space complexity
```
class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		while(left < right){
			int currentSum = array[left] + array[right];
			if(currentSum == targetSum){
				return new int[] {array[left], array[right]};
			} else if(currentSum < targetSum){
				left ++;
			} else if(currentSum > targetSum){
				right --;
			}
		}
		return new int[0];
  }
}
```