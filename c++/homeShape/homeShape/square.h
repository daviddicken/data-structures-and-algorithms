/*
filename: square.h
author: David Dicken
Date last modified: 5/7/16

Description: header file for square class
*/
#pragma once
#include "shape.h"
class square : public shape
{
	
	int side;                                  

public:
	square();                                  
	square(int newx, int newy, int newSide);  

	//Accessor
	int getSide();                            
	double computeArea();
	double computePerimeter();

	//Mutator
	void setSide(int newSide);

	//Destructor
	~square();
};
