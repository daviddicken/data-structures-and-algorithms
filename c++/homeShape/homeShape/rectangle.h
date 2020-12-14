/*
filename: rectangle.h
author: David Dicken
Date last modified: 5/7/16

Description: header file for rectangle class
*/
#pragma once
#include "shape.h"

class rectangle : public shape
{
	int length, width;

public:
	//Constructors
	rectangle();
	rectangle(int newx, int newy, int newLength, int newWidth);

	//Destructor
	~rectangle();

	//Accessor
	int getLength();
	int getWidth();
	double computeArea();
	double computePerimeter();
	
	//Mutator
	void setSides(int newLength, int newWidth);

};