# Remove Duplicates From Linked List
* Linked List sorted in order
* Return LinkedList removing duplicates
* Input: LinkedList = 1 --> 1 --> 3 --> 4 --> 4 --> 4 --> 5 --> 6 --> 6 --> 6
* Ouput: LinkedList = 1 --> 3 --> 4 --> 5 --> 6

* Solution we start at the head node and look to the next node if the next node is duplicated we change the pointer to the next node that is not duplicated and we remove the duplicated node

* Steps
    * Loop through LinkedList
    * See if the next value is duplicated
    * If duplicated we remove it
    * When is null we stop

* Pseudo --> O(n)T and O(1)S
```
while()
currentNode = root;
nextDistinct = currentNode.next;
if(nextDisttinct we go to next);
if(!nextDistinct we remove)
if(null we stop)
```

* Code
```
class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
    // Write your code here.
		LinkedList currentNode = linkedList;
		while(currentNode != null){
			LinkedList nextDistinct = currentNode.next;
			while(nextDistinct != null && nextDistinct.value == currentNode.value){
				nextDistinct = nextDistinct.next;
			}
			currentNode.next = nextDistinct;
			currentNode = nextDistinct;
		}
		return linkedList;
  }
}
```
