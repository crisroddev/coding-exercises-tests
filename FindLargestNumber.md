# Find Largest Number
* Write a function that takes an array of at least three integers and, whithout sorting returns an array of the largest three integers in the input
* Sample Input: [141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7]
* Sample Output: [18, 141, 541]

* Solution:
    * Traverse array and keep tracking and updte biggest numbers
* Create empty List
* Traverse array and update with the first num
* Keep traversing array if its largest we update the List if not we dont
* And so on we keep updating till we finish the array

* Pseudo
```
Create Int threeLargest empty with length 3;
for array
    callHelperMethod
return threeLargest

helperMethod()
    if threeLargest last position is null or the num is greater than the last position
        helperMethodToUpdate()
    elseif threeLargest second position is null or the num is greater than the second position
        helperMethodToUpdate()
    elseif threeLargest first position is null or the num is greater than the first position

helperMethodToUpdate()
    for()
        if(i == index)
            array[i] = num
        else
            array[i] = array[i + 1]
```

* Code O(n)T and O(1)S 
```
class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    // Write your code here.
    int [] threeLargest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
    for (int num : array ){
      helperMethod(threeLargest, num);
    }
    return threeLargest;
  }

  public static void helperMethod(int[] threeLargest, int num){
    if(num > threeLargest[2]){
      helperMethodUpdate(threeLargest, num, 2);
    } else if( num > threeLargest[1]){
      helperMethodUpdate(threeLargest, num, 1);
    } else if (num > threeLargest[0]){
      helperMethodUpdate(threeLargest, num, 0);
    }
  }

  public static void helperMethodUpdate(int[] array, int num, int idx){
    for(int i = 0; i <= idx; i++){
      if(i == idx){
        array[i] = num; 
      } else{
        array[i] = array[i + 1];
      }
    }
  }
}
```