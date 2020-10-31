
# Table of Content

## Data Structures
* [Binary Search](#Binary-Search)
* [Linked List Insertions](Linked-List-Insertions)
* [Stacks and Queues](Stacks-&-Queues)
* [Pseudo Queue](Pseudo-Queue)
* [Binary Tree and BST Implementation](Binary-Tree-and-BST-Implementation)
* [Binary Tree Breadth Traversal](Binary-Tree-Breadth-Traversal)
* [Insert Sort](Insert-Sort)
* [Hash Table](Hash-Table)
* [Graph](Graph)
## Challenges
* [Multi Bracket Validation](Multi-Bracket-Validation)
* [Find Maximum Value](Find-Maximum-Value)
* [Reverse an Array](#Reverse-an-Array)
* [Array Shift](#Array-Shift)
* [Linked List Zip](Linked-List-Zip)
* [Search from end](Search-from-end)
* [Animal Shelter](Animal-Shelter)
* [Tree Intersection](Tree-Intersection)
* [Left Join](Left-Join)


# Reverse an Array
This is a program that takes a array of integers and returns an array with the integers reversed (last index first ect).

### Challenge
The challenge is to move all values in one array to another in reverse order

### Approach & Efficiency
I create a new int array that is the same length as the one being passed in. Then use a for loop where i starts at array length and decrements i each pass through. On each pass through place value into new array then increment variable used to step through new array.

_________________________________________________________________________________

# Array Shift
This program will take an array and a value and insert the value into the middle of the array.

### Challenge
The challenge is to find the middle of the array and insert a value then continue to copy the original array with out loosing any values.

### Aproach & Efficiency
Space: O(n)
Time:  O(n)
Create a new array that is + 1 in length from original Array. Find middle index of original array and save in a variable. Have two variable for stepping through arrays. write a if statement to catch when the middle index is reached and insert value.

### Whiteboard
[whiteboard](challenges/whiteboards/ArrayShift.png )

-----------------------------------------------------

# Binary Search
This program will take a sorted int array and an integer and search through the array for the integer and return the index of where integer is located or -1 if integer is not found.

### Challenge
The challenge was that this needed to be done in binary search format.

### Aproach & Efficiency
Space: O(1)
Time:  O(1)
Save the first index (0) and the last index (array.length -1) in variables
add first + last / 2 to find middle
check if middle matches search integer and return index
if it doesn't match find new mid point depending on if it is greater then or less then mid point
repeat till found ? return -1 if not found

### Whiteboard
[whiteboard](challenges/whiteboards/binarySearch.png )

-------------------------------------------------------
# Linked List
This library will create a linked list of int's. It will have the ability to add a new node to the head and will also have a toString method

### Challenge
Need to be able to insert a new node and be able to traverse through the linked list for the toString method and to be able to search the list for a value

#### Aproach & Efficiency
Space: O(n)
Time: O(n)
Make a Node constructor and a Linked List constructor
create a linked list with a tail and head node both set to null 
When adding to list if head isn't empty store current head in a temp var create new head node and move old head to the .next of new head

-------------------------------------------------------
# Linked List Insertions
Need to add a method to append a new node to the end of our linked list.
Need to add a method to insert a node with a new value before a node with a value entered by user
need to add a method same as above but insert the node after.

### Challenge
To insert a new node without loosing track of other nodes in the linked list.

### Aproach & Efficiency
Space: O(n)
Time: O(n)
Append to End:
Find tail set tail.next to new Node replace tail node with new node
Insert before:
Search linked list for search value and keep track of last node
If found last node.next = new node & new node.next = current node
Insert after:
Search linked list for search value keeping next node in a variable
If found current node.next = new node & new node.next = next node

### Whiteboard

[whiteboard](challenges/whiteboards/ll-insertions.png )

----------------------------------------------------
# Search from end
This method should take an integer from the user and return the value found in the node that many spots from the end

### Challenge
To search from the end only being able to traverse from the front

### Approach & Efficiency
create a size method to be able to find out the size of my list then size - value entered to know how many nodes to traverse through from the front of the list.

### Whiteboard
[whiteboard](challenges/whiteboards/CC7Whiteboard.PNG)

-------------------------------------------------
# Linked List Zip
This method will take in two linked list and merge them together to 
return a linked list containing all nodes sorted every other one.
InputA = 1 -> 3 -> 5 -> 7 -> 9
InputB = 2 -> 4 -> 6 -> 8 -> 10
Output = 1 -> 2-> 3-> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10

### Challenge
To merge nodes together with out loosing track of one of the list. 
And to be able to handle edge cases. If one list was empty or only had one node.

### Aproach & Efficiency
Time: O(n)
Space: O(n)
Create 3 temp nodes to work with. save Ahead.next in tempA point 
Ahead.next to Bhead store Bhead.next in tempB point Bhead.next to tempA ect ect  

### Whiteboard
[whiteboard](challenges/whiteboards/CCo8.PNG)

-----------------------------------------------------
# Stacks & Queues
Create a Queue class, and a Stack class 
The Queue class will have methods:
enqueue - add new node to the rear of the queue
dequeue - remove node from front of queue and return value of node
peek - to return the value from the node in the front of the queue
isEmpty - to check if queue is empty

The Stack class will have methods:
push - add new node to top of stack
pop - remove node from top of the stack and return nodes value
peek - to return node at the top of the stacks value
isEmpty - to check if stack is empty

### Challenges
to ensure that nodes are being added and remove from the correct side of the stack or queue.

### Efficiency 
Time O(1)
Space O(1)

### Whiteboard
[whiteboard](challenges/whiteboards/CC11whiteboard.png)

-------------------------------------------------------------------------
# Animal Shelter
Create a class called AnimalShelter which holds only dogs and cats. 
And operates in a FIFO.

### Challenges
We used a doubly linked list and the chalenge was handling the edge cases
when the pet was found at the end or the start of the list.

### Aproach & Efficiency
Time: O(n)
Space: O(1)

To create a queue with nodes that had pointers to the node in front and the node behind it.
The step through the list looking for the type the user is looking for. When a match is found
we take the pointer of the node behind the current node and point it to the node in front of it
and take the pointer of the node in front of current node and point it to the node behind it 
then return the value of the node  

[whiteboard](challenges/whiteboards/animalShelter.png)


--------------------------------------------------
# Pseudo Queue
Create a Pseudo Queue class that will have two methods: enqueue & dequeue
It will only be able to use 2 stacks internally
enqueue will take in a value and insert it to the front of the Q
dequeue will remove the node from the front of the Q and return its value

### Challenges
To find a way to flip the stack we were working with when we needed to add or remove something

### Aproach & Efficiency
Time O(n)
Space O(n)

Before adding or removing a node we pop every node from the current stack to a temp stack. 
Then overwrite the current stack with the temp stack. 
Then we can add or remove a node to the new current stack.

### Whiteboard
[whiteboard](challenges/whiteboards/CC11.PNG)

-------------------------------------------------
# Multi Bracket Validation
Input : string
Output: Boolean 
A program to make sure that all opening brackets in a string have a matching closing bracket.
Needs to return false or true accordingly.

### Challenges
An open bracket was allowed to be followed by another opening bracket of the same ex: ((
but could not come across any other brachet types before closing.

### Approach and efficiency 
Time: O(n)
Space: O(n)

Lots and lots of if statements and while loops even threw a do loop in for good measure.

### Whiteboard

[whiteboard](challengeswhiteboards/bracketWB.jpg)

---------------------------------------------------
# Binary Tree and BST Implementation 
A Binary Tree class with preOrder, inOrder and postOrder methods
And a Binary Search Tree with add and contains methods

### Challenges
To use recursion to traverse through the tree's

### Approach
Add to binary tree - traverse through the tree row by row until an empty node and place new node in empty spot
Add to BST - traverse through tree comparing value to add with current node value if value to add is less than 
value in current node traverse to the left child. If value to add is greater than current node value traverse 
to the right child. If there is not a node in the path traversed to set that child to the new node. If not 
compare and continue to traverse the tree.

inOrder/preOrder/postOrder - recursively traverse through the tree adding node value to the array list as you traverse.
Placing the value in array list either before traversing both children, in between traversing the children, or after 
traversing both children, depending on which method is used to traverse.

contains - traverse through tree then check array list to see if it contains the value that was entered

---------------------------------------------------------
#  Find Maximum Value
This is a method that can be ran on an int binary tree. It will return the largest int in the tree.
output: int

### Challenges
To check every node on the tree since this is a binary tree and not a binary search tree. 
Then to keep track of the largest int in the tree.

### Approach and Efficiency 
Time: O(n)
Space: O(1)
First create a global int variable to hold the max. In the main method test that tree is not empty. If it's not then 
set max.value to root.value and pass root to the helper method that will do a depth traversal through the tree
comparing max to current node.value and replacing max with any value that is greater as it traverses.

### Whiteboard
[whiteboard](challenges/whiteboards/maxNumWB.png)

---------------------------------------------------------------
# Binary Tree Breadth Traversal
Traverse through a binary tree with breadth traversal and save each node value in an
ArrayList as you come across the node.
input = binary tree
output = arraylist
Stretch goal: traverse through a binary tree with breadth traversal and sum up
the value of the nodes as you go.
input = binary tree
output = int

### Challenges
To get node values from both sides of the tree evenly

### Efficiency & Approach
Time O(n)
Space O(n)
Create a queue and enqueue left and right child of current node. grab current node value 
then dequeue node from queue to replace current node and repeat. Do this until 
all leaves have been reached.

### Whiteboard
[whiteboard](challenges/whiteboards/cc17.png)

----------------------------------------------------------------------------------
# Insert Sort
The insert sort method will take and array of integers and return an array of those
integers organized from smallest to greatest.
Input - int[]
Output - int[]

### Challenges
To move through array passed in comparing and replacing index value as needed without
losing the index value.

### Efficiency & Approach
Time O(n^2)
Space O(1)

### Blog
[Insert Sort Blog](BLOG.md)

### Whiteboard
[whiteboard](challenges/whiteboards/CodeChallenge26InsertSort.PNG)

----------------------------------------------------------------
# Hash Table
A hash table is a array of arraylists of nodes of key : value pairs. A mathematical equation is ran on the key in an 
attempt to create a unique number that is used to determine the index of the array where the arraylist lives that we
will store the key value pair at. This spreads the key value pairs out allowing for fast look up and add to ability.

### Challenges
To create an array of linked list of nodes of key value pairs

### Efficiency and Approach
Time: O(1)
Space: O(1)

* Create an array of a size determined by user
* Create a Node that holds a key value pair
* Create a Hash method that will do some math on the key and the % the size of the array.
* Create a Contains method that takes a key and checks if the key already exist in the array.
* Create a Add method that takes a key value pair. If key doesn't already exist in the array
then it creates a new Node with the key value pair. Runs the Hash method on the key and checks
if the index at the hash spot of the array is empty. If it's empty then create an arraylist and
add new node to it. If it is not empty just add the new node to the arraylist that was found.
* Create a Get method that takes a key runs the hash on it and check the arraylist found at the hash
index for a match. If match is found return the value from the node that contained the key.

---------------------------------------------------
# Repeated Word
Write a method that takes in a string of words and returns the first word that is repeated.

### Challenges
To use regex to rid the input string of punctuations before we grab the words at the whitespaces.

### Efficiency and Approach
Time: O(1)
Space: O(n)

* Use regex to remove punctuations from input string and turn all chars to lower case.
* Split the string into an array of words
* Create a hashtable
* Use a for loop to step through array of words. Make each word a key value pair and see if it exist in 
the hashtable if not add it to the hashtable.
* If it does return that word

### Whiteboard
[whiteboard](challenges/whiteboards/codeChallenge31wb.png)

-----------------------------------------------------------
# Tree Intersection
Write a method that takes in two binary tree's and returns a set of values that are found in both trees.

### Challenges
To find a effecient way to search through a tree and compare it to another tree

### Efficiency and Approach
Time: O(n)
Space: O(n)

Take values in one tree and place in a hashmap as a key/value pair. Recursively step through other 
tree and check to see if current nodes value is in the hashmap. If it is not then add it to a hashset. return the hashset

### Whiteboard
[whiteboard](challenges/whiteboards/codeChallenge32wb.png)

-------------------------------------
# Left Join
Write a method that takes in two hashmaps and returns an array of arrays where each array in the main array contains only a key from the first hashmap and any value associated with that key from both hashmaps.

### Challenge
To figure out how to step through a hashmap and get all keys and values.

### Efficiency And Approach
Time: O(n)
Space: O(n)
* Create new array the size of hashmapA
* Grab all keys from hashmapA and save in an arrayList
* iterate through the new array that was created in step 1
* create a new array with 3 indexes and set the i index of main array to new array
* set 0 index of new array to key from i index of list
* set 1 index of new array to value paired with key
* check if hashmapB contains key if so set 2 index of new array to the value paired with key

### Whiteboard
[whiteboard](challenges/whiteboards/codeChallenge33wb.png)

--------------------------------
# Graph 