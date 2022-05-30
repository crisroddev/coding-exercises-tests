# Non Constructible Change
* Given an array of positive integers representing value fo coins write a function that returns the monimum amount of change.
* Ex: [5, 7, 1, 1, 2, 3, 33];
* The minimum we cant create its 20
* Example 2: array = [1,2,5] --> Minimum amount we cant create its 4
    *   Why
    ```
    Create 1 = we can
    Create 2 we can
    Create 3 we cab
    Create 4 we cant because if we sum 1, 2, 3 we cant have a result of 4
    ```
* Brute force Approach --> Loop through all integers untill you hit one you cant create

* To understand better the problem, first `SortInputArray`
* array = [1, 1, 2, 3, 5, 7, 22]
* Pseudo
```
array = [1, 1, 2, 3, 5, 7, 22]
// All values between 1 and k we can make changes
int change = k;
// Loop from array
for array iterate and see first element, if we can make the change we change the `int change = 1` and so on
```
```
class Program {
	// O(log(n)) T, O(1) S
  public int nonConstructibleChange(int[] coins) {
    // Write your code here.
		Arrays.sort(coins);
		int currentChangedCreated = 0;
		for( int coin : coins){
			if (coin > currentChangedCreated + 1){
				return currentChangedCreated + 1;
			}
			currentChangedCreated += coin;
		}
    return currentChangedCreated + 1;
  }
}
```
