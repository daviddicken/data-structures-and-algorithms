# Quick Sort
Quick sort is a sorting algorithm that can use any index as a pivot.
You would then compare all index values to one side of that index moving higher values to the right of the index
and lower values to the left.


## Step Through
Sample array to be sorted [8, 4, 23, 16]

On our call to the quick sort method we just pass in the array and that method will call an overloaded helper method and 
pass in the array, 0 for left and array.length - 1 for right.

We then check if left is less then right which it is so we enter the if statement. In the if statement we will set a 
position variable to the int that is returned from a call to the partition method passing in the array left *0*
and right *3*

In the partition method we set our pivot to arr[right] *16* and we set a low variable to left - 1 *-1*.
We then enter a for loop setting i to left *0* and incrementing until i is not less then right *3*.

There is a if statement in the for loop that checks if arr[i] *8* is less then or equal to the pivot *16*. It is so
we enter the if statement were we will increment low making it 0 we will then pass in i *0* and low *0* to our swap
method but since the values we are passing in represent the indexes that we will swap nothing is going to happen this 
time.
Our partition method will now return low + 1 *1* to our quick sort. The next line of code there is a recursive call 
to quick sort passing in the array, left *0* and position -1 *0*
We call partition again this time passing in left = 0 and right = 0. In the partition method we set the pivot to 
arr[i] *8* and low to left -1 *-1*. This time since left and right are equal we will not enter the for loop.
We will call the swap method passing in the array, right *0*, Hey guess what we are going to end up with 0 and 0
again and end up doing nothing.....

But in our next recursive call we will do something!!
We then make another recursive call to quicksort passing in the array, left = position +1 *2*, right *4*
partition is called left = 2 and right = 3 
the pivot is set to arr[3] *16*
low is set to left - 1 *1*
for loop i = 2 while i < 4
if arr[i] *23* < 16 
swap array, i = 3, low = low + 1 *2*
temp = arr[i] *16*
arr[3] = arr[2]
arr[2] = 16
the array is now [8,4,16,23]

It's getting late hopefully you can see how this is working I will have to revisit this blog another time.

 [whiteboard](../whiteboards/quickSortWhiteboard.png)whiteboards/
