/*
Filename: hanoi4.cpp
Author: David Dicken
Date last modified: 4/13/16

Description:
This is a program that will play the Hanoi tower puzzle. The program will move all of the numbers from the start tower to the
final tower one at a time without ever placing a larger number om top of a smaller number(use an assert to test this). This
program will display the starting and ending conditions of all 3 towers and this program will out put every disc move to the
screen. This program also needs to track how many moves it takes to complete and display that amount to the user.
*/

#include "stdafx.h"
#include<iostream>
#define NDEBUG
#include<cassert>
#include"peg.h"
using namespace std;

//========= Function Declarations
void hanoi(int numDisks, peg& startPeg, peg& finishPeg, peg& tempPeg, int& moves); // input: int numberOfdisks, moves and 3 peg objects
                                                          // output: all disks moved from start peg object to finish peg object in the correct order and the amount of moves it took
void moveDisk(peg& startPeg, peg& finishPeg, int& moves); // input: two peg objects and int moves Output: end element value moved from start peg vector to end of end peg vector
                                                          //        and move counter increamented by one


int main()
{
	const int NUM_DISKS(8);
	peg peg1("Peg1"), peg2("Peg2"), peg3("Peg3");                      //create peg objects
	int moves(0);

	peg1.fillPeg(NUM_DISKS);                                           //initialize first peg with disks

	cout << "Starting Conditions: \n" << peg1 << peg2 << peg3;         //output starting condition of pegs


	cout << "\n";
	

	hanoi(NUM_DISKS, peg1, peg3, peg2, moves);                      //call to hanoi function

	cout << "\nEnding Conditions: \n" << peg1 << peg2 << peg3;     //output ending condition of pegs
	
	cout << "\n";

	cout << "Number of moves: " << moves << endl << endl;           //display amount of moves used to complete

	return 0;
}

//========== Functions ======================================================

//========== Hanoi
/*input: int numDisks, moves & 3 peg objects (start, temp, finish)
 output: all disks moved from start peg to finish peg in correct order
 algorithm: 
move n -1 disc to temp peg
move 1 disc from start to goal peg
do same steps using start as temp peg
 --------------------------------------------------------------------------------*/
void hanoi(int numDisks, peg& startPeg, peg& finishPeg, peg& tempPeg, int& moves)
{

	if (numDisks > 0)
	{
		hanoi(numDisks - 1, startPeg, tempPeg, finishPeg, moves);
		moveDisk(startPeg, finishPeg, moves);
		cout << "Move disk from " << startPeg.getName() << " to " << tempPeg.getName() << endl;
		hanoi(numDisks - 1, tempPeg, finishPeg, startPeg, moves);
	}

}

//========== Move Disk
/*input: int moves & two peg objects (start, finish)
 output: end disk value moved from start peg to end of finish peg
 algorithm:
 create int variable "disk" to hold value from start peg
 test that pegs aren't already empty
 if finish peg is not empty
   read end disk value of each peg
   test that start disk value is not greater then finish disk value
if not
store startPeg disk value in disk variable
remove end disk from start peg
add disc to finish peg
add one to moves counter
 -------------------------------------------------------*/
void moveDisk(peg& startPeg, peg& finishPeg, int& moves)
{
	int disk(0);

	assert(startPeg.readDisk() > 0);

	if (finishPeg.numDisk() > 0)
	{
		assert(startPeg.readDisk() < finishPeg.readDisk());
	}

	disk = startPeg.readDisk();
	startPeg.removeDisk();
	finishPeg.addDisk(disk);

	moves++;
}

