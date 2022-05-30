# Branch Sums
* Function that takes a binary tree (Root Node) and return list of branches ordered from left to right sum.

* Input: Tree
* Output array []

* Tree Example
```
        1
     /     \
    2       3
   / \     /  \
  4  5    6    7
 / \ |
 8 9 10
```
* Example:
* [1, 2, 4, 8] = 15
* [1, 2, 5, 10] = 18
* [1, 3, 6] = 10
* [1, 3, 7] = 11
* [1, 2, 4, 9] = 16

* Main idea recusrsive function that calculate branch sums, but keep track of running sum and every recurxive call
* Time Constant O(n), O(n)S

* Pseudo
```
ArrayList -> Store the sums so we dont have memory continously
helper function that returns rootNode, 0 and sum
returns sums

HelperFunction(node, runningSum, sums){
    int newRunningSum = runningSum + node value
    determnine if we dont have more nodes or equal null

    if we have more nodes
        HelperFunction(node.left, newRunningSum, sums)
        HelperFunction(node.rigth, newRunningSum, sums)
}
```
* Code 
```
class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    // Write your code here.
    List<Integer> sums = new ArrayList<Integer>();
		helper(root, 0, sums);
		return sums;
		
  }
	
	public static void helper(BinaryTree node, int runningSum, List<Integer> sums){
		if(node == null) return;
		
		int newRunningSum = runningSum + node.value;
		if(node.left == null && node.right == null){
			sums.add(newRunningSum);
			return;
		}
		helper(node.left, newRunningSum, sums);
		helper(node.right, newRunningSum, sums);
	}
}
```