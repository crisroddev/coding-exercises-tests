# FInd Closest Value to BST
* Write  function that takes BST abd a target integer abd returns the closest value to the target value
* Input: BST
* Output: Integer closest to a vaule in the BST
* Ex:
```
     10
    /  \
   5   15
  / \  / \
 2  5  13 22
 /     \
 1     14
```
* Target Value 12 --> So closest value would be 13
* Pseudo:
```
closestValue = 0;
compare de difference betwwen |10 - 12| and |0 - 12| --> Is 10 closest to 10 or 0 its 10
closestValue = 10;
is 10 < > or = to 12
So as 12 is > than  10 we need to serach in the right;
Then we go to the next value:
compare de difference betwwen |15 - 12| and |10 - 12| --> Is 10 closest to 12 or 15 its 10
we dont update the closest value
So as 12 is < than 15 we go left;
compare de difference betwwen |13 - 12| and |10 - 12| --> Is 10 closest to 12 or 13 to 12
so as 13 is closest to12 than 10, we update the closest value
closestValue = 13
compare 13 to 12, as 12 is smaller we elimintae the right half
go left and now we are in the end because we dont have nodes (we have a null)
return closestValue;
if |target - closest| = 0 --> break and return value
```
* Code --> O(log(n)) T, O(log(n)) S worst case O(n)T and O(n) S (Only if we have one branch we will need to iterate the whole tree and never eliminate the half). If we are doing recursive.
```
// Recursive --> O(log(n))T and O(log(n))S
class Program {
  public static int findClosestValueInBst(BST tree, int target) {
    // Write your code here.
		return helper(tree, target, tree.value);
  }
	
	public static int helper(BST tree, int target, int closest){
		if (Math.abs(target - closest) > Math.abs(target - tree.value)){
			closest = tree.value;
		}
		if(target < tree.value && tree.left != null){
			return helper(tree.left, target, closest);
		} else if(target > tree.value && tree.right != null){
			return helper(tree.right, target, closest);
		} else {
			return closest;
		}
	}

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
```
* Better Approach --> O(log(n))T, O(1) S
```
class Program {
  public static int findClosestValueInBst(BST tree, int target) {
    // Write your code here.
    return helper(tree, target, tree.value);
  }
	
	public static int helper(BST tree, int target, int closest){
		BST currentNode = tree;
		while(currentNode != null){
			if(Math.abs(target - closest) > Math.abs(target - currentNode.value)){
				closest = currentNode.value;
			}
			if(target < currentNode.value){
				currentNode = currentNode.left;
			} else if(target > currentNode.value){
				currentNode = currentNode.right;
			} else {
				break;
			}
		}
		return closest;
	}

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
```

