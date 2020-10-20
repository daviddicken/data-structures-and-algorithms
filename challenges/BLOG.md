# Insert Sort
 Insert sort is a sorting algorithm where as you step through an array you move the smaller value to the 
 left.

 ### Pseudo code
    InsertionSort(int[] arr)
    FOR i = 1 to arr.length
 
     in j = i - 1
     int temp = arr[i]
     
     WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] = arr[j]
        j = j - 1
        
     arr[j +1] = temp
 
    return arr
 
 ### Step Through
 Sample Array: [8,4,23,42,16]
 
 Pass 1:
 i = 1
 j = 0
 temp = 4
 
 When the for loop is entered the variables are set as above and j is evaluated
 to be equal to 0 AND temp *(4)* is less then arr[j] *8*. So the
 while loop is entered. 
 In the while loop we will set the value of arr[j + 1] to the value that is at arr[j] *8*.
 This will move the greater value to the next index.
 Our array is now [8,8,23,42,16]
 We make j equal to j-1 *-1* allowing us to exit the while loop.
 Now we can set the value of arr[j+1] to the value in our temp array moving the smaller integer back a
 index. Our array is now [4,8,23,42,16]
 
 pass 2:
 i = 2
 j = 1
 temp = 23
 
 In this pass when the while loop is entered j is greater then 0 but temp *23* is not less then arr[j] *8*.
 So the while loop is not entered and when we set the value of arr[j+1] to the temp value nothing changes
 arr[j+1] is 23 and temp is 23
 our array is still [4,8,23,42,16]
 
 pass 3:
 i = 3
 j = 2
 temp = 42
 
 Same as above on this pass nothing will change in our array 
 our array is still [4,8,23,42,16]
 
 pass 4:
 i = 4
 j = 3
 temp = 16
 
 On this pass when the while loop conditionals are evaluated j is greater then 0 and temp *16* is less
 then arr[j] *42* so we will enter the while loop.
 In the while loop we set the value of arr[j+1] to the value found at arr[j]
 Our array is now [4,8,23,42,42]
 We decrement j by 1 and re-evaluate our while loop conditionals: j is 2 which is greater then 0 and 
 temp *16* is less then arr[j] *23* so we re-enter the while loop.
 We will set the value of arr[j+1] to the value at arr[j] to continue moving the larger values to the right.
 Our array is now [4,8,23,23,42]
 Again we will decrement j by 1 and re-evaluate our while loop conditionals and this time j is 1 which
 is greater then 0 but the value at arr[j] is 8 which is less then the value stored in the temp variable *16*.
 We will exit the while loop and set the value at arr[j+1] to the value stored in the temp variable *16*.
 Our array is now [4,8,16,23,42]
 
 On our next pass i will not be less then arr.length and we will exit our for loop and return our array.
 
 Thank you for reading this. I hope you found it helpful. I did :)
 

 
   
 
 
 
 
 
 