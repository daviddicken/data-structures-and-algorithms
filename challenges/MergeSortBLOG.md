# Merge Sort
 Merge Sort is a sorting algorithm where we recursively split an array in half until arrays only have one 
 index. We then use a merge function to piece the arrays back together placeing the smaller values to the 
 left. 

 ### Pseudo code
    MergeSort(arr)
      DECLARE n = arr.length
    
       if n > 1
         DECLARE mid = n/2
         DECLARE left = arr[0-mid]
         DECLARE right = arr[mid-n]
         MergeSort(left)
         MergeSort(right)
    
       Merge(left, right, arr)
    ---------------------
    Merge(left, right, arr)
       DECLARE i = 0
       DECLARE j = 0
       DECLARE k = 0
    
       WHILE i < left.length && j < right.length
            if left[i] <= right[i]
                arr[k] = left[i]
                i = i + 1
           else
              arr[k] = right[j]
              j = j + 1
    
       k = k+ 1
        if i = leftlength
           set remaing index values in arr
            to remaining values in right
        else
            set remaing index values in arr
            to remaining values in left
 
 ### Step Through
 
 We first will set *n* to be the value of the length of the array passed in. We can use this variable to 
 find the middle of the array as well as to tell if the array passed in only has 1 index.
 
 We then use a if statement to check if there is more then one index in the array. If not we return the array.
 It is sorted and we are most likely going to be working our way back through the stack of recursive calls.
 
 If there is more than 1 index in the array we step into the if statement where we will divide *n* by 2 to 
 find the middle index value of the array. Using the middle value we will copy the first half of the array into 
 a new array named *left* and the other half into an array named *right*. 
 
 We then will recursively call mergeSort method on the left array. After we have worked our way down the left
 arrays splitting them in half until they only have one element, we will recursively call mergeSort on the right
 arrays splitting them in half until the only have one element.
 
 At that point we will call our merge method and pass in the left right and original array as we work our way 
 through the recursive call stack.
 
 In the merge method we set three variables *i,j,k* to 0 to be used to step through each of our arrays.
 We will then enter a while statement that checks if we have come to the end of either right or left arrays. 
 If not then we enter the while loop and compare which ever index we are on in the right and left arrays to
 each other. The value that is less get placed in the index spot we are at in the original array. 
 Then we increment the index variable that we are using for the array that we copied a value from and we 
 increment the index variable that we are using to track our position in the original array.
 
 We go through the while loop until the end of the left or right array is reach.At which point we will exit
 the while loop and enter a if statement where we will check one of our index variable that we were using to
 through the left array against the left arrays length to see if there is any left over elements if there is then 
 we will use a while loop to continue populating the original array with the left over elements. If there is 
 not any left over elements in the left array we will use a while loop to check and move any extra elements that
 might still be in the right array. 
 We then have a sorted array to return :)
 
 [whiteboard](whiteboards/mergeSortWhiteboard.png)