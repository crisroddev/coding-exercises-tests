# Product Sum
* Write a function that takes a special array and returns a product sum.
* The special array is the sum of its products
* Example:
```
[5, 2, [7, -1], 3, [6, [-13, 8], 4]] => 12
```
* Assumptions:
* You need to sum the array and multiply by depth
* Examples
```
First Array
sum[5, 2, 3] * 1
Second Array
sum[7, -1] * 2
Third Array
sum[6, 4] * 3
Fourth Array
sum[-13, 8] * 4
```
* Solution
* Init at the left go trhough the array and sum
* Init an array at 0

* Walkthrough
    * init sum 0
    * init depth 0
    * go thorugh array
    * if normal array, array[0] = sum
    * keep iterating array[1] = sum ......
    * if special array storeSpecialArray[0] + specialArray[1] ...
    * special array stop its depth 1 so m = m + 1 and we multiply special array with the sum
    * sepcial array sum + sum

* Pseudo
```
mainMethod(){
    return helperMethos(array, multiplier = 1)
}

helpermethod(array, int multiplier){
    int sum 0
    for object in array
        check if is an ArrayList
        sum+= helperMethod(object + 1);
    else
        sum += (int)
    
    return sum * multiplier
}
```

* Code --> O(n) T and O(d)S where d is the greatest depth
```
class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    // Write your code here.
    return helperMethod(array, 1);
  }

  public static int helperMethod(List<Object> array, int multiplier){
    int sum = 0;
    for(Object el : array){
      if(el instanceof ArrayList){
        @SuppressWarnings("unchecked")
        ArrayList<Object> ls = (ArrayList<Object>) el;
        sum += helperMethod(ls, multiplier + 1);
      } else {
        sum += (int) el;
      }
    }
    return sum * multiplier;
  }
}
```