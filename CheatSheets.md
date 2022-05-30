# Cheat Sheet
## Data Structure Ops Cheat Sheet
________________________________________________________________________________________________________________________________________________________________
| Data Structure Name  |                 Avg Time Complexity                 |                  Best  Case Time Complexity                 |  Space Complexity |  
|                      | Access Nth elem |  Search    | Insertion | Deletion | Access Nth elem |   Search   |   Insertion   |   Deletion   |    Worst Case     |
| -------------------- | --------------- | ---------- | --------- | O(n)     | ---------------  ------------  -------------   -------------  ------------------
| Arrays               |       O(1)      |   O(n)     | O(n)      | O(1)     |      O(1)       |    O(n)    |      O(n)     |     O(n)     |        O(n)       |
| Stack                |       O(n)      |   O(n)     | O(1)      | O(1)     |      O(n)       |    O(n)    |      O(1)     |     O(1)     |        O(n)       |
| Queues               |       O(n)      |   O(n)     | O(1)      | O(n)     |      O(n)       |    O(n)    |      O(1)     |     O(1)     |        O(n)       |
| Binary Trees         |       O(n)      |   O(n)     | O(n)      | O(n)     |      O(n)       |    O(n)    |      O(n)     |     O(n)     |        O(n)       |
| Binary Tree Search   |     O(log(n))   | O(log(n))  | O(log(n)) | O(log(n))|      O(n)       |    O(n)    |      O(n)     |     O(n)     |        O(n)       |
| Balance Binary Search|     O(log(n))   | O(log(n))  | O(log(n)) | O(log(n))|    O(log(n))    |  O(log(n)) |    O(log(n))  |   O(log(n))  |      O(log(n))    |
| Hash Tables          |       O(1)      |   O(1)     | O(1)      | O(1)     |      N/A        |    O(n)    |      O(n)     |     O(n)     |        O(n)       |
----------------------------------------------------------------------------------------------------------------------------------------------------------------

## Sorting ALgorithms Cheat Sheet
_______________________________________________________________________________________________________________________
| Sorting Algorithm Name  | Time Complexity                      | Space Complexity |              |                  |
|                         | Best       |  AVG       | Worst      |     Worst Case   |  Is Stable?  | Sort Class Type  |   
| --------------------    | ------     | ---------- | ---------- | ---------------- | ------------ | ---------------- |
| Bubble Sort             |   O(n)     |  O(n^2)    |   O(n^2)   |       O(1)       |      Yes     |   Comparison     |
| Insertion Sort          |   O(n)     |  O(n^2)    |   O(n^2)   |       O(1)       |      Yes     |   Comparison     |
| Selection Sort          |  O(n^2)    |  O(n^2)    |   O(n^2)   |       O(1)       |      Yes     |   Comparison     |
| Merge Sort              | O(log(n))  | O(log(n))  |  O(log(n)) |       O(n)       |      Yes     |   Comparison     |
| Heap Sort               | O(log(n))  | O(log(n))  |  O(log(n)) |       O(1)       |      No      |   Comparison     |
| Quick Sort              | O(log(n))  | O(log(n))  |   O(n^2)   |     O(log(n))    |      No      |   Comparison     |
| Tree Sort               | O(log(n))  | O(log(n))  |   O(n^2)   |       O(n)       |      Yes     |   Comparison     |
| Counting Sort           |  O(n+k)    |  O(n+k)    |   O(n+k)   |       O(k)       |      Yes     |   Linear         |
| Bucket Sort             |  O(n+k)    |  O(n+k)    |   O(n^2)   |       O(n)       |      Yes     |   Linear         |
| Radix Sort              |  O(dn)     |  O(dn)     |   O(dn)    |      O(d+n)      |      Yes     |   Linear         |
-----------------------------------------------------------------------------------------------------------------------

