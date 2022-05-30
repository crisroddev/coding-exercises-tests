# Depth First Search
* Graph Traversal algorithm
* Given a node and array of optional nodes. 
* Exploring a Graph, tree like data structure
* Every node has a String and optional has a children node

* Input: A graph
* Output and array

* Going deep, explore specific branch all the way down as deep as we can before exploring the next branch and so on
* Every node we add that node tp array and for every child we call the function and passes it to the array

* Example
```
         A
      /  |  \
    B    C   D
   / \      / \
  E  F     G   H
    / \     \
    I  J     K

- Create empty Array
array = [];
- Assign first node to array
array = [A];
- For every Child array so A,B,C we call the depthFirstSearch function
B --> call depthFirstSearch()
array = [A B];
E --> call depthFirstSearch()
array = [ABE];
F --> call depthFirstSearch()
array = [ABEF]
```
* Code O(V+E) Vertex + Edges T, O(V)S
```
class Program {
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
      array.add(this.name);
			for(int i = 0; i < children.size(); i++){
				children.get(i).depthFirstSearch(array);
			}
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}

```