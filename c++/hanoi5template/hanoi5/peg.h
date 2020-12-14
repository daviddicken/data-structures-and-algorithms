/*
Filename: peg.h
Author: David Dicken
Date last modified: 4/13/16

Description: header file for peg class
*/

#pragma once
#include "stdafx.h"
#include "stack.h"
#include <string>

using namespace std;

class peg
{
public:
	//constructors
	peg();                          // no input Output: peg object created
	peg(string name);               // input: string name Output: peg object created w/ string name
	peg(string name, int numDisks); // input: string name, int number of disk Output: peg object created w/string name and populated with disks
	peg(int numDisks);              // input: int number of disks Output: peg object created populated with disk

	//functions
	friend ostream& operator <<(ostream& outStream, const peg&);
	void fillPeg(int numDisks);     // input: int numDisks Output: peg vector populated with disks
	void printPeg();                // no input Output: cout peg status to screen
	void clearDisk();               // no input Output: elements in peg vector cleared
	int readDisk();                 // no input Output: int value of last element in peg vector
	void addDisk(int disk);         // input: int disk Output: peg vector with value of disk stored in new element at the end of the peg vector
	void removeDisk();              // no input Output: peg vector with last element removed
	string getName() const;         // no input Output: string pegName (name of peg)
	void setName(string name);      // input: string name Output: name saved to pegName
	int numDisk() const;            // no input Output: int number of elements in peg vector
	
	//destructor
	~peg();                         // no input Output: peg object destroyed

 private:
   //class variable
	string pegName;                 // name of peg
	stack<char> stakk;                             
	
};