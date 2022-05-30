# Validate Subsequence
* Two Arrays [5, 1, 22, 25, 6, -1, 8, 10] [1, 6, -1, 10], subsequence deleting elements without breaking the sequence, second array is valid subsequence of the first one.
* All the integers in subsequence have to appear in original array and in subsequence in same order
* Input: Two Arrays
* Output True or False
* How to traverse This:
* Order matters, we are looking the first index in the subsequence, we init a pointer in the index of the subseuqence and traverse the first array to find the index[0] of the subsequence
* Examples:
```
1.-
array = [1,2,3,4,5,6,7,8,9,10]
subsequence = [4,8,9]
Output -> True

2.- 
array = [1,2,3]
subsequence = [4,5,6,7,8]
Output -> False

3.- 
array = [4,5,6]
subsequence = [7,8,9]
Output -> False
```
* While Loop => O(N) T, O(1) S => Iterate over the array
* Pseudo Code
```
setIndexArray = 0;
setIndexSubsequence = 0;
while setIndexArray < array.length and setIndexSubsequence < subsequence.length
    if setIndexArray == setIndexSubsequence
        move subsequence index to rigth
    else move array index to rigth
return setIndexSubsequence == length(sequence)
```
* Code
```
class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
		int arrayIndex = 0;
		int seqIndex = 0;
		while(arrayIndex < array.size() && seqIndex < sequence.size()){
			if(array.get(arrayIndex) == sequence.get(seqIndex)){
				seqIndex ++;
			}
			arrayIndex ++;
		}
		return seqIndex == sequence.size();
	}
}
```
* For Loop => O(N) T, O(1) S
* Pseudo Code
```
setIndexSeq = 0;
for(value : array){
    if setIndexSeq == sequence length){
        break;
    } else if(sequence in setIndexSeq == value){
        setIndexSeq move rigth
    }
    return setIndexSeq == sequence length;
}
```
* Code 
```
class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
		int setIndexSeq  = 0;
		for(var value : array){
			if(setIndexSeq == sequence.size()){
				break;
			}
			if(sequence.get(setIndexSeq) == value){
				setIndexSeq ++;
			}
		}
		return setIndexSeq == sequence.size();
  }
}
```