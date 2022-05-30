# Tandem Bicycle
* Tanden bicycle its operated by 2 person A and B. Person who pedals faster dicatates the speed. So if A pedals at Speed 5 and B at 4 the tandem moves at 5.
* Example: [tandemSpeed] = max(speedAm speedB)
 * Inputs: Two arrays
    * array redShirtSpeeds = [5, 5, 3, 9, 2]
    * array blueShirtSpeeds = [3, 6, 7, 2, 1]
    * Boolean Fastest = true
* Output: Boolean pairing speeds

* Write a function that returns the max possible speed or minimum bpossible total speed of the bicycle

* max(a,b) or min(a,b)

* Example:
```
red = [1, 3]
blue = [2, 3]

Max
R3, B2
R1, B3
Result = 6

Min
R1, B2
R3, B3
Result = 5
```
* Steps Example 1
    * Walkthrough examples
    ```
    MaxSpeed
    redShirtSpeeds = [5, 5, 3, 9, 2]
    blueShirtSpeeds = [3, 6, 7, 2, 1]
    ```
    * Pair largest red and minimum of blue
    * Pair largest blue and minimum of red
    ```
    [9,1] = 9
    [7,2] = 7
    [3,6] = 6
    [5,2] = 5
    [5,3] = 5
    sum = 32
    ```
    ```
    MinSpeed
    redShirtSpeeds = [5, 5, 3, 9, 2]
    blueShirtSpeeds = [3, 6, 7, 2, 1]
    ```
    * Largest Number of Both arrays and pair them
    ```
    [9,7] = 9
    [6,5] = 6
    [5,3] = 5
    [3,2] = 3
    [2,1] = 2
    sum = 25
    ```
* Steps Example 2
    * Walkthrough Sorting --> Beacuse this way we dont have to iterate in every aray and we can use more constant opertions
    ```
    Sort array red
    Sort array blue
    red = [2, 3, 5, 5, 9]
    blue = [1, 2, 3, 6, 7]
    ```

* Steps
    * Sort arrays
    * If we dont have a return of fastest we are looking for the minimum speed
    * Helper function to reverse
    * helper function
    *  create totalSpeed int
    * for method to get idx
    * return max speed

* Code
```
lass Program {

  public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
    // Write your code here.
		Arrays.sort(redShirtSpeeds);
		Arrays.sort(blueShirtSpeeds);
			
		if(! fastest){
			reverseArrayInPlace(redShirtSpeeds);
		}
		
		int totalSpeed = 0;
		for(int idx = 0; idx < redShirtSpeeds.length; idx ++){
			int rider1 = redShirtSpeeds[idx];
			int rider2 =  blueShirtSpeeds[blueShirtSpeeds.length - 1 - idx];
			totalSpeed += Math.max(rider1, rider2);
		}
		return totalSpeed;
  
  }
	
	public void reverseArrayInPlace(int[] array){
		int start = 0;
		int end = array.length -1;
		while(start < end){
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start += 1;
			end -= 1;
		}
	}
}
```