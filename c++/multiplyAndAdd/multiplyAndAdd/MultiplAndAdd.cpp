// Filename: Multiply And Add               (Chapter 1 Programming Project 1)
// Author:  David Dicken
// Description:  A program that displays the sum and product of two integers entered by the user.
// Date last modified: 1/7/16

#include <iostream>
using namespace std;

int main()
{
	cout << "I am about to amaze you with my ability to add and multiply \n";
    cout << "any two integers between 0 and 10000 you give me!\n";
	cout << "\n";

	int multiResult(0), addResult(0), num1(0), num2(0);

	cout << "Press return after entering a number.\n";
	cout << "Enter first number:\n"; cin >> num1;
	cout << "Enter second number:\n"; cin >> num2;

	multiResult = num1 * num2;
	addResult = num1 + num2;

	cout << "Multiplication Result: " << multiResult << endl;
	cout << "Addition Results: " << addResult << endl;
	cout << "\n";
	cout << "Well are you amazed?\n";

	return (0);
}


/* 

Algorithm:
We need a program that outputs the sum and product of two numbers entered by a user.

1) Get two integers from user.
2) Multiply the integers to get the product.
3) Add the integers to get the sum.
4) Display the product and sum.

*/