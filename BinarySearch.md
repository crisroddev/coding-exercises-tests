# Binary Search
* Write a function that takes a sorted array of integers as well as a target integer. The function should use a binary search to determine if the target integer is contained in the array and return its index otherwise -1
* Example Binary Search: Students essay, in the top of the paper the name of studenst who wrote the essay. All essays pilled in alphabetical. Find the essay writen by `X`. Cut the pile in two and look the essay in middle and the you go an serach the pile to find the specific essay. Eliminate the half you dont want to search. You cut the half again an continue untill you get the essay you want to search.
* Example in coding: First thing to apply binary search the array must be sorted.
    * Tip a list of array sorted you need to figure if you can use Binary Tree
    * Find the middle number of the array, declare a `leftPointer` = array[0] and `righPointer` = array.length -1
    * Calculate Middle number, M = roundDown(`leftPointer` + `righPointer` / 2)
    * Now we have the middle number and we compare the middle with the target number, if its not match we continue
    * Is M = Target, is M > Target, every number to rigth is natural greater tham 33, so we eliminate those number
    * Right pointer one tto left of middle pointer
    * Recalculate Middle, roundDown(`leftPointer` + `righPointer` / 2)
    * new M = Target, is 1 < 33
    * `leftPointer` one position to rigth
    * Recalculate M, roundDown(`leftPointer` + `righPointer` / 2)
    * new M = Target, is M < 33
    * Move left to right
    * Is M = Target
    * Return index
* Input = array and a targetNumber
* Output = if match returns index number
* Examples
```
array = [0, 1, 21, 33, 45, 45, 61, 71, 72, 73]
target = 33
Output = 33
```
* Pseudo Code
```
O(log(n)) T, (O1) S
array = [0, 1, 21, 33, 45, 45, 61, 71, 72, 73]
target = 33
right = 0
left = 73
M = (left + right / 2) -> (0 + 9 / 2) = 4
if M = target || M > Target
left = M - 1
newArray = [0, 1, 21, 33]
newM = (0 + 3 / 2 ) = 1
is newM = target || < target
left = left + 1
newM = (2 + 3 / 2) = 2
is newM = target || < target
left = left + 1
newM = (3 + 3 /2 ) = 3
is newM = target --> return index
```
* Code - Solution 1 -> O(log(n)) T and O(log(n)) S why we are calling stacks and takes memory
```
class Program {
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
    // returns the helper function / array / target / left / right
    return binarySearchHelper(int[] array, int target, 0, array.length -1);
  }

  public static int binarySearchHelper(int[] array, int target, int left, int right){
      // Check base Case is left > rigth
      if(left > rigth){
          return -1;
      }
      // Calculate middle number of array
      int middle = (left + right) / 2;
      // Locate middle number
      int potentialMatch = array[middle];
      // Compare target with potentialMatch
      if(target == potentialMatch){
          return middle;
      } else if(target < potentialMatch){
          // elimintae right half the array
          return binarySearchHelper(array, target, left, middle - 1);
      } else {
          return binarySearchHelper(array, target, middle + 1,rigth);
      }
  }
}
```
* Solution 2 --> O(log(n)) T and O(1) S
```
class Program {
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
		return binarySearchHelper(array, target, 0, array.length - 1);
  }
	
	public static int binarySearchHelper(int[] array, int target, int left, int right){
		while(left <= right){
			int middle = (left + right) /2;
			int potentialMatch = array[middle];
			if(target == potentialMatch){
				return middle;
			} else if(target < potentialMatch){
				right = middle -1;
			} else {
				left = middle +1;
			}
		}
		return -1;
	}
}
```


