# Data Structures
## Complexity Analysis
- Time Complexity: Measure how fast a solution runs
- Space Complexity: How much memory a solution uses \
`[Solutions may be better when they have a better time complexity or a better space complexity]`

## Memory
- Basic thing you do is declare variables, and then you use them in the code.
- This variable is stored somewhere, memory comes in to play
- Imagine memory as a canvas with different slots, each slot is a memory slot.
- Ex: `fooBar=1` --> number 1 will be stored in a memory slot that is free
- Memory uses Bits [0 and 1s] like [00101] one memory slot hold 8 bits [1 byte]
  - Its stores as binary numbers: 1 --> 0000 0001, 2 --> 0000 0010, 3 --> 0000 0011
  - The max storing option its 2^8 --> 256 data values
- Java using and `Int` that is a 32 bits so its 4 bytes, our program will need to store it in 4 slots
- Long or 64 bits will take 8 bytes, 8 slots in memory
- Instance a List of numbers `[1,2]` will be two 32 bits numbers, 8 bytes, 8 slots

## Big O Notation
EX:\
a = [.........] \
B1(a) => 1 + a[0] --> O(1) --> `as the array increases the time is constant` \
B2(a) => sum(a) --> O(N) --> `as the array increases the speed of the algorithm increases linearly` \
B3(a) => pair(a) -->  O(n^2)  --> `as the array increases increases exponentially the time`
- Its imposible to measure in ms if we have like an array of 10.000.000 does not make sense
- Speeds depends on the size if the array is more meaning full to measure speed than ms \

#########################################################################################################
- O(1) --> Constant Time          #######################################################################
- O(log(n)) --> Logarithmic Time  #######################################################################
- O(N) --> Linear Time            #######################################################################
- O(N^2) --> Exponential Time     #######################################################################
#########################################################################################################

## Logarithm
- Its always measured as Log2(n)
  - 2 ^ X = N
- As N doubles the number of operations only increases by 1, does not increase fast as the input increases
- Examples:\
```
[0,1,2,3,4,5,6,7]
We have a opertion of Log8 = 3 --> 2^3=8 --> Means 3 operations

Example we have doubled the array
[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] and we eliminate the half [0,1,2,3,4,5,6,7]
This means as we double we only make one operation, the operation only increases by 1 as we doubled the size of the input
```

## Array
- 8 bits per integer in array, example [1,2,3] 8 memory slots so will be 8 * 3 = 24 slots for this array
- `Static Array`: Declare the length of the array, exactly the array, so the system knows at the beginning how much memory has to allocate
- array[0] is almost instant, it runs in constant time it never changes no matter the length of the array.
- `getElement` array => O(1)
- `override or setElement` array[2] = 5 => O(1)
- Array[3] => memory find and multiply by 8 and then store it in the available memory slots O(N) constant
- `ForLoop` in array goes to O(N) Time and O(1) Space 
- `copyElement` array its O(N) Space and Time
- `insertValue` => bad operation => Shift (move) all the memory blocks and after all the array we have not use the memory slots and cant be guaranteed to have more free slots, we can copy the array find place in memory for the array plus the new element => Under the hood you need to copy the entire array => O(N) Time and O(1) Space
- `popValue` array => O(1) because you remove and add => If you pop in the middle is an O(N) because you are shifting elements
- `Dynamic Array`: Array That changes in size, let you make fatser insertions in the array
- `Static Array`: [1,2,3] => 24 Blocks => O(N)
- `Dynamic Array`: [1,2,3,_,_,_] => So you have free space to start allocating new elements => Amortyzed O(1) Constant Time => When you want to insert for example in the middle you will have O(N) because you need to shift the elements

## Linked Lists
- Its very similar to an array but different stored than an array
- We represent LinkedList as [3 -> 1 -> 4 -> 2] => One memory slot each => Linked List read from left to right as a single LinkedList => If we cannot have continual slot memories we cannot use a array => But linked list allows you to do so, beacuse stores the memories slots
- Each node in the linkedlist has a value and a pointer to the next node in the next element, so the next node can be anywhere in the memory canvas. So this uses 2 memory slots per element one for value next one for pointer
- They can be anywhere in memory
- As the LinkedList is stroed averuwhere you need to tranverse to get a particular element in the LinkedList 
- `getElement` => O(i) Time and O(1) Space
- `setElement` => O(i) Time and O(1) Space
- `initLikedList` => O(N)Space and Time, beacuse you hane N elements in the List
- `copy` => O(N) Space and Time, because needs to traverse the LinkedList
- `traverse` => O(N) Time and O(1) Space
- `insertOrDeletion` => 3 -> 1 -> 4 -> 2 => We want to insert a node at the begining => So we have the head node that is 3 => So we create a new head node like number 5 and the pointer of the 5 to point yo number 3, so we insert the number in constant time.
- `insertOrDeletion in Head or Tail` its (O1) Time and Space
- What happens if we want to insert in the middle a number 6 => We traverse the LinkedList until reach the position but once you have the position => Then you create a new node for the 6 and then the pointer to point 4 => Only creates a one new node and change the previous pointer, so its constant operations that is very fast => O(N) Time
- Double LinkedList its the same but have double pointers as 1 -> 2 and 2 -> 1, and the first and end element points to one null value
- How we point in code to the next node, it the `next` operation

## Hash Tables
```
Key    Value
foo  => 1
bar  => 2
baz  => 3
```
- Its a key value store
- You can acces a value given the key
- `insertion` `deletion` `search` of key value pairs works in constant time on average => O(1) Time
- Under the hood Hash tables are build on Arrays => [_, _, _] and we store 1,2,3 in the array
- Behinds the scene inserting the Key/Value paitr in a HashTable you use a Hash that transform the Key into an Index that will fit into the array, so you find the index to find the element
- How do I transform: Transform the String into a Integer, for example assume we map the Strings and we get a number of 301. Here is where the modulo operator `%` so you get a number between 0 and the number you want => Example: 301 % 3 => Divides the 301 by 3 and returns the reminder, so `301 % 3 = 1`, so we store the number 1 in the position of the array
- What happens if two `Strings` maps to the same `Index` given a Hashing function 
- Hash tables is not just an array  is an array which index maps to a linked list of potential values
- [_,_,_] each element points to a different LinkedList
- So if we have to same match values [abr] and [bar] => [abr] will point to index x in the linked list and [bar] will point to index y in the same LinkedList
- Ex: `abr` `bar` `baz`
```
abr => 1
bar => 2
baz => 3
[_,_,_] = evry element inside the array points to a linked list
 | | |-> 1
 |   |-> 2
 |-----> 3
```

## Stacks and Queues
- Stacks: Are elements in order stored and when you add a element to stack you add it to the end, is a Last In First Out principle (LIFO)
- Queues: Are elements in order stored and when you add a element to a Queue you added to the end, but uses the First In First Out Principle (FIFO)
- Stacks: `insertion` and `deletion` constant Time ands Space O(1), its just a `Dynamic Array`
- Queue: We use Queues as Linked List so:
  - `Insert` `Deletion` `Push a Element to the Front` is O(1) Space and Time
  - Searching a element is O(N) Time and O(1) Space

## Strings
- Store in memory as array of integers, every character is mapped into integers (8 bits, 1 Byte for each character)
-  `Traverse` => O(N) T and O(1)S
- `Copy` => O(N) ST
- `get` => O(1) ST
- `insert` => Not constant operation because you have to define a new String beacuse is inmutable => To change a String you make a copy a creates a new String => O(N) ST
- You cant `set` a String in a index

## Trees
```
             1
          /     \
        2        -31
      /   \     /    \
    51     7   0      8
```
- Has a top node [10] then every node has child nodes
- Edges has direction, points downgrade to the tree
- Without cycles, for example node with value [08] cannot poiny to node with value [10]
- Each node in the tree can only have one parent
- Is not allowed to be disconnected like split the tree you cannot do that
- Ex: Like a management structure in a company
- Different type of Trees
  - Binary Tree: At most 2 child nodes
  - K-ary trees: k child nodes
- Binary Search Trees (BST): Its a binary tree where every node sutisfied a special properties that are heaps
  - Min and Max heaps: Every node in the tree satisfied the Min and Max Heap properties
- Tries: Store characters in a String
- Some trees have every node in the tree can point to the parent node, most trees typical dont have this
- Storing a Tree is always => O(N) S => N is total number of nodes in the tree
- Traversing (BST) => O(N) T => Going to all N nodes
- Traverse starting in the top => And go down one sub tree => O(log(n)) T => You Go to a sub node and the other sub nodes get deleted => This is a balanced binary tree => because you are deleting half of the binary tree
- What if tree has a lot of nodes in one side and not so much in the other side
```
             1
          /     \
        2        -31
      /           
    4
  /
8   
```
- Here you will not be deleting the half of the tree because its balanced => Maintains O(log(n)) Time Complexity when you are traversing
- Path starts in a root node and ends a the bottom node is a branch
- A tree is complete when every single level is completed except the final level that may o may not be completed
- A tree is full if every node in the tree has children nodes or k children nodes
- Perfect Tree, all the leaf nodes has the same depth, how far down goes the tree nodes

## Graphs
- Graph collection of nodes (elements) of may or may not be connected between each other
- Connections between nodes
- Nodes are vertex and the connection will be edges
- Vertices that are not connceted, says that a graph its not connected
- Undirected graph, like flights, flights go to an aerport and back again, or fb frienships you have a friend  and that friend has you as friends, A-----B, no direction undirected, mutual connections
- Cycles, graph has cycles, cyclic graph (if we have cycles), acyclic graph (if we do not have cycles). Cycle is when yo have 3 or more nodes that have loops. Traversing a graph and you return to a node already visited.
  - Infinite Cycle
    ````
    1-----------7
      \        /
       \      /
        \    / 
         \  /
          \/
           5
    ````
  - Store a List of nodes(vertex) and every node stores a list of its edges
  - S Complexity O(V+E) --> Vertex + Edges
  - T Complexity O(V+E)
  - DFS --> Traversing deeper first on every node, traverse childs of 1, then traverse childs of childs of 1 and so on
  - BFS --> Traverse wide first om every node, so you traverse childs of 1 first.



