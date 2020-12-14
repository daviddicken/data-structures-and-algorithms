/*
filename: shape.h
author: David Dicken
Date last modified: 5/7/16

Description: header file for shape class
*/
#pragma once
class shape
{
	//--------- x, y position
	int x;
	int y;

protected:
	//Constructors
	shape();
	shape(int newx, int newy);

public:

	//Accessors
	int getx();
	int gety();
	virtual double computeArea();
	virtual double computePerimeter();

	//Mutators
	void moveTo(int newx, int newy);          

	//Detructor
	~shape();
};