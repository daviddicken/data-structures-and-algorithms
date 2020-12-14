/*
Filename: rectangle.cpp
Author: David Dicken
Date last modified: 5/7/16
Description: cpp file to create a rectangle
*/
#include "rectangle.h"
#include<iostream>
using namespace std;

//Constructors
/*============ constructor w/o input
no input
output: 0 x 0 rectangle object
algorithm: setsides to 0
------------------------------------*/
rectangle::rectangle() : shape(0, 0)
{
	setSides(0, 0);
}

/*=========== construtor w/ inputs
input: int newx, newy, newlength, newwidth
output: a newlength x newwidth rectangle at newx and newy
algorithm: set sides to newlength and newwidth
		   pass newx and newy to shape
---------------------------------------------------------------------*/
rectangle::rectangle(int newx, int newy, int newLength, int newWidth) : shape(newx, newy)
{
	setSides(newLength, newWidth);
}
//Destructor
/*========== destructor
no input
output: rectangle object destroyed
------------------------*/
rectangle::~rectangle()
{

}

//accessors
/*=========== get length
no input
output: int length
algorithm: return length
---------------------------*/
int rectangle::getLength()
{
	return length;
}

/*============ get width
no input
output: int width
algorithm: return width
-------------------------*/
int rectangle::getWidth()
{
	return width;
}

/*=========== compute area
no input
output:area of rectangle
algorithm: return length * width
--------------------------------*/
double rectangle::computeArea()
{
	return (getLength() * getWidth());
}

/*============ compute perimeter
no input
output: perimeter of rectangle
algorithm: length + width * 2
--------------------*/
double rectangle::computePerimeter()
{
	const int multiplier(2);
	return ((getLength() + getWidth())* multiplier);
}

//mutators
/*=========== set sides
input: int newlength and newwidth
output: rectangle object with sides set to newlength and newwidth
algorithm: set length and width to new length and width
-----------------------------------------------------*/
void rectangle::setSides(int newLength, int newWidth)
{
	length = newLength;
	width = newWidth;
}
