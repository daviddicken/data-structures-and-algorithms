/*
File Name:  MergeSort.cpp
Author:  David Dicken
Date Last Modified: 4/6/16

Description:  This is a function that will take the contents of an array and sort them. It will return the array sorted.
Algorithm: if list-size = 1, return
           mergesort 1st half of the list
           mergesort 2nd half of the list
           merge the 2 sorted halves into a sorted list
*/




//#include "stdafx.h"
#include <iostream>
#include <assert.h>
using namespace std;

//sub function
void mergeBack(int a[], int numElements); // input: int array(section), int numElements. Output: array with elements sorted



/*------- mergesort ----------------
input: int array with more then 1 element in it. int numElements
output: int array with elements sorted using mergesort method
algorithm: loop
           set middle point of array
           send first half of array back into merge sort
		   send second half of array into another merge sort call
		   end loop when numElements = 1
           work your way back through the stack sorting and merging sections of the array back together
-----------------------------------*/
void mergeSort(int a[], int numElements)
{

	assert(numElements > 0);                             // test that array has a size of at least 1

	if (numElements > 1)

	{
		int middle(0);

		middle = numElements / 2;                       // set middle variable to half of the array
		                                                
		mergeSort(a, middle);                           // send first half of the array back into merge sort
		mergeSort(&a[middle], numElements - middle);    // send second half of array to merge sort
		mergeBack(a, numElements);                      // send sections to be sorted and merged back
	}

}
/*---------- Merge Back --------
input: int array, int numElements, int low, middle, and high elements
output: array merged back together in proper order
algorithm: 
declare temp array
declare 2 int's at 0 for stepping through each array
declare 2 int's at the middle element of array (one to set a boundary and one to step through the second half of the temp array)
copy array into temp array
loop while pointers are in bounds
  compare 1st half elements to second half elements in temp array
    if 1st half element is lower copy it to first element in org array
      increase the left temp pointer by one 
	else copy 2nd half element to to first element in org array
	  increase right temp pointer by one
  increase org array element by one
end loop
check to see if there is any values left in either half of temp array
copy those values to end or org array
delete temp array
-------------------------------*/
void mergeBack(int a[], int numElements)
{
	assert (numElements > 1);

	int left(0), right(numElements/2), final(0), middle(numElements/2);  // left side pointer/ right side pointer/ org array element / middle bound marker
	
	int* temp = new int[numElements];                   

	for (int i(0); i < numElements; i++)                   // copy array elements into temp array
	{
		temp[i] = a[i];
	}




		while (left < middle && right < numElements)      // check that left pointer hasn't reached middle of array and right pointer hasn't reached end of the array
		{
			if (temp[left] <= temp[right])               // compare left element to right element
			{
				a[final] = temp[left];                   // copy lower element to org array
				left++;                                  // move pointer one spot
			}
			else
			{
				a[final] = temp[right];
				right++;
			}
			final++;                                    // increase org array element by 1
		}
		
	
	while (left < middle)                             // check if still un-copied elements in one of the halves
	{
		a[final] = temp[left];                        // copy remaining temp elements to end of org array
		final++;                                      // increase the org array element and temp array element
		left++;
	}
	while (right < numElements)
	{
		a[final] = temp[right];
		final++;
		right++;
	}
	delete[] temp;                                   // delete temp array
}