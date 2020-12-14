/*
Filename: Metal        (Chapter 2 Programming Project 15)
Author:   David Dicken
Description:  A program that has user input coefficient for linear expansion, initial length of material, and the change in temperature (celsius).
              Then calculates and outputs the linear displacement. If the output is a positive then output "The material will expand by ______"
			  If the output is a negative # then output "The material will contract by ______"  DO NOT OUTPUT A NEGATIVE #

Date last modified: 1/13/16

Algorithm:  Get user to input initial length of the material, the coefficient for the material, and the change in temperature.
            Calculate the linear displacement. displacement = coefficient * initial length * temp change
			If it is a positive output "The material will expand by (linear displacement)
			If it is a negative convert it to a positive and output "The material will contract by (linear displacement)
			negative linear displacement / -1 = positive linear displacement
*/  

#include <iostream>
using namespace std;

int main()
{
	double initLength(0.0), coefficient(0.0), temp(0.0), displacement(0.0);

	cout << "Please enter the initial length of the material in meters: \n"; cin >> initLength;
	cout << "Please enter the coefficient of the material: \n"; cin >> coefficient;
	cout << "Please enter the expected change in temperature (Celsius): \n"; cin >> temp;

	displacement = coefficient * initLength * temp;

	if (displacement < 0)
	{
		displacement = displacement / -1;

		cout << "The material will contract by " << displacement << " meters. \n";
	}
	else if (displacement > 0)
	{
		cout << "The material will expand by " << displacement << " meters. \n";
	}
	else
	{
		cout << "The material will remain the same. \n";
	}

	return 0;
}