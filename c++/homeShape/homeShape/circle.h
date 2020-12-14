/*
filename: circle.h
author: David Dicken
Date last modified: 5/7/16

Description: header file for circle class
*/
#pragma once
#include "shape.h"
class circle : public shape
{
	int radius;

public:
	//constructors
	circle();
	circle(int newx, int newy, int newRadius);

	//Accessor
	int getRadius();
	double computeArea();
	double computePerimeter();

	//Mutator
	void setRadius(int newRadius);

	//destructor
	~circle();
};