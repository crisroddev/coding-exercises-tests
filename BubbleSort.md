# Bubble Sort
* Function that takes any array of integers and returns a sorted version
* Input: [8, 5, 2, 9, 5, 6, 3]
* Output: [2, 3, 5, 6, 8, 9]
* Travers from the start to the end
* Each poiny that we are, check the current number and the next number are in correct order
* Is current number less or equal to the next number
* If no correct order then we swap the numbers in place
* As we finish the first traverse, is there any number out of order
* We need to redoo the iteration, is we did swaps we finish the process

* Human solution --> O(n^2)T, O(1)S
    * nums = [8, 5, 2, 9, 5, 6, 3]
    * Check that nums[0] < nums [1]
    * if not we change order [5, 8, 2, 9, 5, 6, 3]
    * Check that nums[1] < nums [2]
    * if not we change order [5, 2, 8, 9, 5, 6, 3]
    * Check that nums[2] < nums [3]
    * Yes are in the correct order [5, 2, 8, 9, 5, 6, 3]
    * Check that nums[3] < nums [4]
    * if not we change order [5, 2, 8, 5, 9, 6, 3]
    * Check that nums[4] < nums [5]
    * if not we change order [5, 2, 8, 5, 6, 9, 3]
    * Check that nums[5] < nums [6]
    * if not we change order [5, 2, 8, 5, 6, 3, 9]
    * The last num is in the final correct order
    * The second Loop we dont need to iterate all over the entire array
    * And we continbue till we do not have swaps

* Pseudo Code 
```
bubbleSort()
    define bool sort false
    // For optimizatiosn and not go to the entire loop
    counter = 0;
    while()
        define bool sort false
        for array
            if array[i] > array[i + 1]
                swap --> helperFunction()
                define bool sort false
        counter ++;
    return array

helperFunction()
```
* Code --> Best O(n)T, O(1)S --> Avg O(n^2)T, O(1)S
```
class Program {
  public static int[] bubbleSort(int[] array) {
    // Write your code here.
    boolean sort = false;
    int counter = 0;
    while(!sort){
      sort = true;
      for(int i = 0; i < array.length - 1 - counter; i++){
        if(array[i] > array[i +1]){
          helperMethod(i, i + 1, array);
          sort = false;
        }
      }
      counter ++;
    }
    return array;
  }

  public static void helperMethod(int i, int j, int[] array){
    int temp = array[j];
    array[j] = array[i];
    array[i] = temp;
  }
}
```