# InsertionSort
* Function that takes an array of integers and retirns a sorted version
* Sample Input: [8, 5, 2, 9, 5, 6, 8, 9]
* Sample Output: [2, 3, 5, 5, 6, 8, 9]
* Manual Example:
```
Iterate from array[1]
if array[1] < array[0] we swap
and we go on
```
* Pseudo Code
```
// Edge case if the array has no values
if(array length == 0){
    return new int[]{};
}
for(){
    int j = i;
    while(j > 0 && array[j] < array[j - 1])
        swap
    j=+1
}

return array

swap()
    int temp = array[j];
    array[j] = array[i];
    array[i] = temp
```
* Code O(n2)T, O(1) S
```
class Program {
  public static int[] insertionSort(int[] array) {
    // Write your code here.
    if ( array.length == 0){
      return new int[] {};  
    }
    for(int i = 1; i < array.length; i ++){
      int j = i;
      while(j > 0 && array[j] < array[j - 1]){
        swap(j, j - 1, array);
        j -= 1;
      }
    }
    return array;
  }
  public static void swap(int i, int j, int[] array){
    int temp = array[j];
    array[j] = array[i];
    array[i] = temp;
  }
}
```