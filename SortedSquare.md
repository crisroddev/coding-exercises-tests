# Sorted Square
* Write a function thast takes an array sorted ascending and returns a new array same length with the squares
* Input --> array
* Output --> array == length array1
* Examples:
```
1.
Input --> array = [1,2,3,4]
Output --> array = [1,4,9,25]
```
` [1 ^ 1,  2 ^ 2, 3 ^ 3, 4 ^ 4]`
* Pseudo Code
```
new Array
forLoop(){
    int value = array[i];
    array[i] = value * value
}
sort array
return array
```
* Code Brute Force Approach --> For Loop => O(log(n)) T and O(n) Space --> log because we have sort and the sort takes n times
```
class Program {

  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
		int[] newArray = new int[array.length];
		for(int i = 0; i < array.length; i ++){
			int newValue = array[i];
			newArray[i] = newValue * newValue;
		}
		Arrays.sort(newArray);
    return newArray;
  }
}
```
* Code 1 For Loop --> O(n) T and O(n) S
```
public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
		// Creates a new array of the size of the array
		int[] newArray = new int[array.length];
		// Smallest Value index
		int smallerValueIdx = 0;
		int largerValueIdx = array.length - 1;
		// For backwards
		for(int idx = array.length -1; idx >=0; idx --){
			// values
			int smallerValue = array[smallerValueIdx];
			int largerValue = array[largerValueIdx];
			// Compare values
			if(Math.abs(smallerValue ) > Math.abs(largerValue)){
				newArray[idx] = smallerValue * smallerValue;
				smallerValueIdx ++;	
			} else {
				newArray[idx] = largerValue * largerValue;
				largerValueIdx --;
			}
		}
    	return newArray;
	}
}
```