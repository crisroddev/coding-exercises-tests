# BST Construction
* Write a BST class for a binary search tree
    * Inserting values `insert` 
    * Removing values `remove` 
    * Searching values with `contains` method
    * Each BST node has a value, a left node, a right node
    * BST Property principal node m,ust be greater or equal than the values on its left and less or equal to values on the right
```
        10
       /  \
      5    15
     / \   / \
    2   5  13 22  
```
* Assumptions:
    * Must be less and equal or only less than?
    * Must be greater and equal or only greateress than?
* `search`
* `insert`
* `delete`
* Example Insert:
    * insert 12
```
insertionMethod on root node
comparing root node to 12 is 10 > or < 12
If its greater example we can delete the left side of the tree
Then we can compare if 12 is < or > than 15
Then if its less than we can eliminate the right nodes
Then to the tree in the left compare 13 with 12
12 < 13 we can elimintae the right node
We can insert number 12
```
* Example Search:
    * search 12
```
searchMethod on root node
comparing root node to 12 is 10 > or < 12
If its greater example we can delete the left side of the tree
Then we can compare if 12 is < or > than 15
Then if its less than we can eliminate the right nodes
Then to the tree in the left compare 13 with 12
12 < 13 we can eliminate the right node
We can bring number 12
```
* Example Delete:
    *  First searching for value
    * When find we can erase it, but what happens if the node has childs
    * If we have only 1 child we can remove and bring up the child and connected to the node
    * When remove a node with 2 full child node
        * When find node to delete, you grab the smallest value in the right subtree of that node, traverse and find the smaller numb
        * As we select the smaller value we now its the only value that will fit 100%
        * Then we delete the value in the subtree and replace it with null
```
deleteMethod(10)
        12
       /  \
      5    15
     / \     \
    2   5     22 
```
* In three methods:
    * O(log(n)) T --> We did not traverse the entire tree we always eliminate half of the BST
    * O(1) S --> If you iterate
    * O(n) T --> In worst cases when we have only one branch because we dont have the possibility to take off one side of the tree
    * O(n) S --> In worst case --> Recursevely --> You are using frames on the call stack 
```
10
|
12
|
13
|
15
```

* Input: A value
* Output: Method

* Code 1
```
Insert


Search

Remove
We want to remove the parent node because we will assign the least num to the parental node
```