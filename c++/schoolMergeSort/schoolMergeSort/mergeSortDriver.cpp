// File Name:  MergeSortDriver.cpp
// Author:  Cliff Snyder (csnyder@everett.edu)
// Description:  Driver for a function that implements a merge sort
// Date last modified: 4/6/16 (by: David Dicken)
// David Dicken added a clock to time how long the merge took on 4/6/16 (lines 36,46,49, and 54)
//
// Top Down Design
//    Load an array with random numbers
//    Display the array contents (comment out for larger arrays)
//    Sort the array
//    Display the array contents (comment out for larger arrays)



//#include "stdafx.h"
#include <iostream>
#include <ctime>
#include <string>
#include "mergesort.h"

using namespace std;

// Global types

// Global consts
const int NUM_INTS(10);

// Declare functions to do the actual work
void displayArray(string name, int array[], int numElements);

void main()
{
	//  Initialize variables
	int array[NUM_INTS];
	srand(static_cast<unsigned int> (time(0)));
	clock_t startTime, endTime;

	// Load random numbers into the array
	for (int i = 0; i < NUM_INTS; i++)
	{
		array[i] = rand();
	}
	//displayArray("Before: ", array, NUM_INTS);

	// start timing here
	startTime = clock();
	mergeSort(array, NUM_INTS);
	// end timing here
	endTime = clock();

	//displayArray("After : ", array, NUM_INTS);

	//Display the total time taken
	cout << endl << "Time: " << endTime - startTime << endl << endl;
	return;
}

// Functions

// Function to display the contents of an array
void displayArray(string name, int array[], int numElements)
{
	cout << name;
	for (int i = 0; i < numElements; i++)
	{
		cout << array[i];
		if (i < numElements - 1)
		{
			cout << ", ";
		}
	}
	cout << endl;
}