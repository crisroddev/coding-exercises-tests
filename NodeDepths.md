# Node Depths
* Distance between Binary Tree and the trees root is called nodes depth.
* Write a function that takes in a binary tree and return the sum of its nodes in depth
* Exmaple:
```
     1
    /  \
   2    3
  / \  / \
 4  5  6  7
/ \     
8  9   
```
* So the depths are
```
     1 --> 0 [Depth Between Root and Root]
    /  \
   2    3 --> 1 [Depth Between Root and first node]
  / \  / \
 4  5  6  7 --> 2 [Depth Between Root and second node]
/ \     
8  9 --> 3 [Depth Between Root and third node]
```
* So if we sum all the depths is 16
* left(1 + 2 + 2 + 3 + 3) + right(1 + 2 + 2) = 16

* Input = Tree
* Output = int

* How to solve the problem
    * Start at the root node --> We node the depth of the root node is 0 and we know that the following is 1 of depth, one level depeer
    * Second level we know its 1 in depth
    * Next level we can give the value of 2 so its the node depths + 1
    * When you dont have more nodes you break

* Approaches
    *   Iteratively --> Works but recursively its better --> O(n)T, O(n)
        ```
        Stack to traverse the tree
        addRootNode at the stack
        childrenNodes to the stack and so on
        stack = [8:3, 9:3, 4:2, 5:2] and so on
        ```
    *   Recursive --> Cleaner --> Call recursive we are going to return the sum of the current node + 1 of the children nodes, O(n)T, O(h) --> H --> heigth
        ```
        f(n, d) = d + f(leftChildNode, d + 1) + f(rigthChildNode, d + 1);
        ```
* Code Iteratively
```
class Program {

  public static int nodeDepths(BinaryTree root) {
    // Write your code here.
		int sumOfDepths = 0;
		List<Level> stack = new ArrayList<Level>();
		stack.add(new Level(root, 0));
		while(stack.size() > 0){
			Level top = stack.remove(stack.size() - 1);
			BinaryTree node = top.root;
			int depth = top.depth;
			if(node == null) continue;
			sumOfDepths += depth;
			stack.add(new Level(node.left, depth +1));
			stack.add(new Level(node.right, depth + 1));
		}
    return sumOfDepths;
  }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
```
* Code Recursevly
```
class Program {

  public static int nodeDepths(BinaryTree root) {
    // Write your code here.
    return nodeDepthsHelper(root, 0);
  }
	
	public static int nodeDepthsHelper(BinaryTree root, int depth){
		if (root == null) return 0;
		return depth + nodeDepthsHelper(root.left, depth +1) + nodeDepthsHelper(root.right, depth + 1);
	}

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
```


