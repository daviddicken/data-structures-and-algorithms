/*
Filename: main.cpp
Author: David Dicken
Date last modified: 5/7/16

Description: driver file to test shape cpp's
*/
#include<iostream>
#include "shape.h"
#include "circle.h"
#include "square.h"
#include "rectangle.h"

using namespace std;

int main()
{
	shape *shape;
	shape = new circle(15, 25, 8);
	//shape = new square(15, 25, 10);
	//shape = new rectangle(15, 25, 10, 5);
	cout << shape->computeArea() << endl;
	cout << shape->computePerimeter() << endl;
	delete shape;

	return 0;
}