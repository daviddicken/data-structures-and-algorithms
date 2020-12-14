/*
Filename: circle.cpp
Author: David Dicken
Date last modified: 5/7/16
Description: cpp file to create a circle
*/
#include "circle.h"
#include<iostream>
using namespace std;

//constructors

/*============= constructor w/o input
no input
output: circle object w/ 0 radius
algorithm: set radius to 0
-------------------------------*/
circle::circle() : shape(0, 0)
{
	setRadius(0);
}

/*============ constructor w/ inputs
input: int newx, newy, newradius
output: circle with newradius at newx and newy
algorithm: set radius to new radius
		   pass newx and newy to shape
---------------------------------------------------------------------*/
circle::circle(int newx, int newy, int newRadius) : shape(newx, newy)
{
	setRadius(newRadius);
}

//destructor
/*=========== destructor
no input
output: circle object destroyed
-----------------*/
circle::~circle()
{

}

//accessors
/*========== get radius
no input
output: int radius
algorithm: return radius
------------------------*/
int circle::getRadius()
{
	return radius;
}

/*=========== compute area
no input
output: area of circle
algorithm: create a const variable to hold PI
		   return PI * radius * radius
----------------------------*/
double circle::computeArea()
{
	const double PI(3.14159);
	return (PI * getRadius() * getRadius());

}

/*=========== compute perimeter
no input
output: perimeter of circle
algorithm: 2 * PI * radius
---------------------------*/
double circle::computePerimeter()
{
	const double PI(3.14159);
	const int multiplier(2);
	return (multiplier * PI * getRadius());
}

//mutators

/*========== set radius
no input
output: circle with new radius
algorithm: radius = newradius
--------------------------------------*/
void circle::setRadius(int newRadius)
{
	radius = newRadius;
}