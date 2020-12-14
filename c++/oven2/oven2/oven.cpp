/*
Filename: Oven                 (Chapter 4 Programming Project 8)
Author:   David Dicken
Description:  A program that help user test the tempurature that the user would like to use to see if any broken key pad
              numbers would need to be used.If so then display the next highest and lowest temp that the user could use 
			  that doesn't use the broken keys 1, 4, and 7

Date last modified: 1/29/16

Algorithm: Introduce Program
           get tempurature from user
		   seperate 100's, 10's, and 1's
		   test seperated number's to see if they match bad buttons (write a function)
		   calculate and output the higher temp and lower temp possible or let user know if the temp they entered will work.
		   */

#include<iostream>
using namespace std;
bool containsDigit(int num, int digit);  // input number and bad button digit.  Output true if they match or false if they don't.

int main()
{
	// Global variables
	int temp(0),orgTemp(0), hundreds(0), tens(0), ones(0);
	// Intro
	cout << "Hi, I know what buttons are broken on your oven. \n"
		<< "Tell me what temperature you would like to cook at \n"
		<< "and I'll tell you the closest temperature's that you can enter. \n"
		<< "Higher and Lower. \n\n"
	    << "What temperature would you like to cook with? \n";
	cin >> temp;
	orgTemp = temp;               //keep original temp

	hundreds = temp / 100;        //seperate 100's
		 if(hundreds > 0)
		 {
			 temp = temp % 100;
		 }

	tens = temp / 10;            // seperate 10's
		if (tens > 0)
		{
			temp = temp % 10;
		}

	ones = temp;                // ones
//************************************test
	do                                                   //allows me to break out of loop when I need to
	{
		bool test1(true), test2(true), test3(true);      //local variables and const
		const int BADbut1(1), BADbut2(4), BADbut3(7);     
		
		//***********************************test hundreds
	test1 = containsDigit(hundreds, BADbut1);
	test2 = containsDigit(hundreds, BADbut2);
	test3 = containsDigit(hundreds, BADbut3);
	if(true == test1 || true == test2 || true == test3)
	{
		int higher(0), lower(0);

		lower = (hundreds - 1) * 100 + 99;    //if button is bad find the high and low temp
	    higher = (hundreds + 1) * 100;

		cout << "Instead of cooking at " << orgTemp << ". You can either cook at " << lower << " or " << higher << endl <<endl;
		break;  // exit
	}
	else 
	{
		hundreds = hundreds * 100;        // if button is good turn back into hundreds
	}
//****************************************************tens
	test1 = containsDigit(tens, BADbut1);
	test2 = containsDigit(tens, BADbut2);
	test3 = containsDigit(tens, BADbut3);
	if(true == test1 || true == test2 || true == test3)
	{
		int higher(0), lower(0);

		lower = (tens - 1) * 10 + 9;      //if button is bad calculate high and low temp
	    higher = (tens + 1) * 10;

		cout << "Instead of cooking at " << orgTemp << ". You can either cook at " << hundreds + lower << " or " << hundreds + higher << endl << endl;
		break;  //exit
	}
	else
	{
		tens = tens *10;               //if button is good turn back to tens
	}
//****************************************ones
	test1 = containsDigit(ones, BADbut1);
	test2 = containsDigit(ones, BADbut2);
	test3 = containsDigit(ones, BADbut3);
	if(true == test1 || true == test2 || true == test3)
	{
		int higher(0), lower(0);

		lower = ones - 1;             //if button is bad calculate high and low temp
	    higher = ones + 1;

		cout << "Instead of cooking at " << orgTemp << ". You can either cook at " << hundreds + tens + lower << " or " << hundreds + tens + higher << endl << endl;
		break;  //exit
	}
	else
	{
    cout << "All of those buttons still work.  You can cook at " << orgTemp << ". \n\n";  //if all buttons are good
	break; //exit
	}
	}
	while( 1 == 2);   //should never be tested
	return 0;
}
bool containsDigit(int num, int digit)
/*****************BrokenButton Function*******************
*** Inputs: number to be tested, broken button digit******
*** Algorithm: num == digit              *****************
*** Output: True or False                *****************
*********************************************************/
{
	return (num == digit);
}