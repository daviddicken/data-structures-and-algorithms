/*
Filename: square.cpp
Author: David Dicken
Date last modified: 5/7/16
Description: cpp file to create a square
*/
#include "square.h"
#include<iostream>
using namespace std;

//Constructors

/*========== Constructor w/ no input
input: none
Output: 0 x 0 square object
algorithm: setsides to 0
-------------------------------*/
square::square() : shape(0, 0)
{
	setSide(0);
}

/*========== Constructor w/ inputs
input: int newx, newy, newside
Output: newside x newside square object at newx and newy
algorithm:set sides to newside
		  pass newx and newy to shape
-------------------------------------------------------------------*/
square::square(int newx, int newy, int newSide) : shape(newx, newy)
{
	setSide(newSide);
}


//Destructor
/*===========Destructor
no input
output: destroyed square object
------------------*/
square::~square()
{

}

//accessors
/*=========== get side
no input
output: length of side
algorithm: return side
---------------------*/
int square::getSide()
{
	return side;
}

/*=========== compute area
no input
output:area of square
algorithm: return side * side
----------------------------*/
double square::computeArea()
{
	return (getSide() * getSide());
}

/*=========== compute perimeter
no input
output: perimeter of square
algorithm: return side * 4
---------------------------*/
double square::computePerimeter()
{
	const int numSides(4);
	return (getSide() * numSides);
}

//mutators
/*========= set side
input: int newside
output: object with sides set to newside
algorithm: side = newside
---------------------------------*/
void square::setSide(int newSide)
{
	side = newSide;
}

