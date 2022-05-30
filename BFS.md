# Breadth First Search
* Given node that has a name and an array of optionla children nodes. When pu together nodes form a tree like structure
* Implement a BFS method on the node class, whick takes an empty array, traverse using BFS and returns it
* Example:
```
         A
      /  |  \
    B    C   D
   / \      / \
  E  F     G   H
    / \     \
    I  J     K
```
* If he use the BFS method we go wide, so the output wide is the following. array: [A,B,C,D,E,F,G,H,I,J,K]
* Traverse the graph level by level
* To solve this easily we need to use queues, FIFO
* Solution:
    * start with an empty array = [];
    * add the root node to the array [A];
    * Use a variable to represent the current node
    * While loop the queue is not empty pop a node for the queue and make that node the current node
    * Add A to the final array and add alll childs nodes to queue
    * We erase current and is empty, we grab the queue and add to current node and to its finall array, and so on with all childrens

* Pseudo Code:
````
Class Node{
    String name;
    List<Node> children = new ArrayList<Node>(); --> has a children array thats starts empty
}

public Node(String name){
    this.name = name; --> Every node has a name
}

Add childrens by adding appending Nodes to the children array
public Node addChild(String name){
    Node child = new Node(name);
    children.add(child);
    return this;
}

Final Array we will return with all the names with all the nodes inside
public List<String> breathFirstSearch(List<String> array){
    init queue with root node;
    while loop queue grater than 0 (is when we have  node) we set currentNode = to be the value at [0] of the queue
    append to array the name of the node
    finally for every child node in current node appends to queue

return array

}

````

* Code --> O(v + e)T, O(v)S 
````
Class Node{
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name){
    this.name = name;
    }
    
    public Node addChild(String name){
    Node child = new Node(name);
    children.add(child);
    return this;
    }
    
    public List<String> breathFirstSearch(List<String> array){
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(this);
    while(!queue.isEmpty()){
        Node current = queue.poll();
        array.add(current.name);
        queue.addAll(current.children);
        }
        return array;
    }
}
````



