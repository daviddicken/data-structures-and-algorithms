/*
Filename: peg.cpp
Author: David Dicken
Date last modified: 4/13/16

Description: File to hold constructor and peg function descriptions
*/

#include "stdafx.h"
#include <iostream>
#define NDEBUG
#include"cassert"
#include "peg.h"


using namespace std;

//================== Constructors ==================================

/*========== construstor with no input
input: none
output: peg object created with empty vector and blank name
algorithm: leave blank
------------*/
peg::peg()
{

}
/*========== constructor with name
input: string name
output: peg object created with name in peg name variable
algorithm: pegName variable = name variable
---------------------*/
peg::peg(string name)
{
	pegName = name;
}
/*========== constructor with name and number of elements
input: string name, int numDisks
output: peg object created with name in peg name variable and a vector populated with numDisks # of elements
algorithm: pegName variable = name variable
           call fill peg function to populate vector
-----------------------------------*/
peg::peg(string name, int numDisks)
{
	pegName = name;
	fillPeg(numDisks);
}
/*========== constructor with number of elements
input: int numDisks
output: peg object created with a vector populated with numDisks # of elements
algorithm: call fill peg function to populate vector
----------------------*/
peg::peg(int numDisks)
{
	fillPeg(numDisks);
}

//================== Functions ================================================

//================== Fill Peg
/*input: int num disks
 output: peg vector populated with disks
 algorithm: use a loop to add int's to vector
            use numDisk for value to add to elements
			count down numdisk and count up element every loop
			end loop when numdisk reaches 0
-------------------------------*/
void peg::fillPeg(int numDisks)
{
	assert(numDisks > 0);
	

	for (int i = numDisks; i > 0; i--)
	{
		stakk.push('A' + (i-1));
	}
}
//================== Overload <<
/*
input:  ostream and peg class
output: status of the peg
algorithm:
read peg name and vector size to the outStream
test if vector has any elements
if vector has elements
write loop to step through each element and output value of element to the OutStream
else
end line to outStream

return ostream (outStream)

------------------------------*/
ostream& operator <<(ostream& outStream, const peg& pegg)
{
	int stacksize(0);

	stacksize = pegg.stakk.size();

	outStream << pegg.pegName << " has " << stacksize << " disk: ";
	if (stacksize > 0 )
	{
		outStream << " " << pegg.stakk ;
		outStream << endl;
	}
	else
	{
		outStream << " \n";
	}

	return (outStream);
}

//==================== Remove Disk
/*input: none
 output: peg vector with last elements removed
 algorithm: make sure vector has a element
            use pop_back to remove last element
----------------------*/
void peg::removeDisk()
{
	stakk.pop();
}

//=================== Add disk
/*input: int disk 
 output: peg vector with disk value added to a new element at the end of the vector
 algorithm: if vector has elements
              test to make sure disk value is less then the last element value of vector
			if it is use push_back to add disk value to new element at the end of the vector
---------------------------*/
void peg::addDisk(int disk)
{
	if (stakk.size() > 0)
	{
		assert(disk < stakk.back());
	}
	stakk.push(disk);
}

//==================== Read Disk
/*input: none
 output: the value stored in the last element of peg vector
 algorithm: return .back() to return the value stored in last element
-------------------*/
int peg::readDisk() 
{
	return(stakk.back());
}

//==================== clear disk
/*input: none
 output: empty peg vector
 algorithm: use .clear all elements in vector
---------------------*/
void peg::clearDisk()
{
	stakk.clear();
}

//================== get name
/*input: none
 output: string peg's name
 algorithm: return pegname variable
---------------------*/
string peg::getName() const
{
	return(pegName);
}

//================= set name
/*input: string name
 output: peg name set to name
 algorithm: copy name variable to pegname variable
------------------------------*/
void peg::setName(string name)
{
	pegName = name;
}

//================= numDisk
/*input: none
 output: int size of vector
 algorithm: return .size() of vector
 -----------------*/
int peg::numDisk() const
{
		return(stakk.size());	
}


//=================== destructor ===============================
/*input: none
 output: peg destroyed
 algorithm: write destructor
 -----------*/
peg::~peg()
{

}

