/*
Filename: shape.cpp
Author: David Dicken
Date last modified: 5/7/16
Description: cpp file to create a shape
*/
#include "shape.h"
#include<iostream>
using namespace std;

//Constructors

/*============= constructor w/o input
no input
output: shape at 0, 0
algorithm: set x and y to 0
---------------*/
shape::shape()
{
	moveTo(0,0);
}

/*============= constructor w/ input
input: int newx newy
output: shape at newx, newy
algorithm: set x an y to new x and y
--------------------------------*/
shape::shape(int newx, int newy)
{
	moveTo(newx, newy);
}

//Destructor

/*=========== destructor
no input
output: shape destroyed
----------------*/
shape::~shape()
{

}

//Accessors

/*========== getx
no input
output: int x
algorithm: return x
------------------*/
int shape::getx()
{
	return x;
}

/*========== gety
no input
output: int y
algorithm: return y
------------------*/
int shape::gety()
{
	return y;
}

/*============ compute area
no input
output: double area of object that calls function
algorithm: add virtual to .h
----------------------------*/
double shape::computeArea()
{
	return(0.0);
}

/*========== compute perimeter
no input
output: double perimeter of object that calls fuction
algorithm: add virtual to .h
----------------------------*/
double shape::computePerimeter()
{
	return(0.0);
}

//Mutator

/*============ move to
input: int newx and newy
output: shape moved to newx, newy
algorithm: set x and y to newx an y
--------------------------------------*/
void shape::moveTo(int newx, int newy)
{
	x = newx;
	y = newy;
}
