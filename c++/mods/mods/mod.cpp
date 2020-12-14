/*
Author: David Dicken
Description: This is a program that takes two integers and outputs integer divide quotient, double divide quotient,
               and the remainder using mod.
Last edited: 2/4/16
*/

#include<iostream>
using namespace std;
int divide(int num1, int num2); // input to integers and output quotient
int mod(int num1, int num2);    // input two integers and output mod

int main()
{
	char exit('y');
	do
	{
	int num1(0), num2(0);
	double num3(0.0), num4(0.0);
	cout << "Give me two whole numbers to divide. \n"
		<< "Example: number1 divided by number2. \n\n"
		<< "Number1: "; cin >> num1;
	cout << "Number2: "; cin >> num2;

	num3 = num1;
	num4 = num2;

	cout << "\n"
		//<<  "The way you learned how to divide\n"
		//<<   num3 << " / " << num4 << " = " << num3 / num4 << endl 
		/*<<  "Or "*/ << num2 << " goes into " << num1 << " ... " << divide(num1, num2) << " times. With a remainder of " << mod(num1, num2) << endl << endl
        <<  "C+ integer divide   /   \n"
		<<   num1 << " / " << num2 << " = " << divide(num1, num2) << endl << endl
		<<  "Modulus Function   %    \n" 
		<<   num1 << " % " << num2 << " = " << mod(num1, num2) << endl << endl;

	cout << "Did you want to try it again with different numbers? \n"
		<< "Enter y for yes or any other key to end. \n";
		cin >> exit;
		exit = tolower(exit);

	}
	while(exit == 'y');

	
	return 0;
}
//************************divide function
int divide(int num1, int num2)
{
	int quotient(0);

	quotient = num1 / num2;

	return quotient;
}
//*************************mod function
int mod(int num1, int num2)
{
	int modulus(0);

	modulus = num1 % num2;

	return modulus;
}
