/*
Filename: Oven                 (Chapter 4 Programming Project 8)
Author:   David Dicken
Description:  A program that help user test the tempurature that the user would like to use to see if any broken key pad
              numbers would need to be used.If so then display the next highest and lowest temp that the user could use 
			  that didn't use the broken keys 1, 4, and 7

Date last modified: 1/29/16

Algorithm: Introduce Program
           get tempurature from user
		   test the tempurate to see if 1, 4, or 7 are in it 
		   if there is a broken number 
		   seperate the the broken number out and replace with the next highest number
		   store in a high variable
		   and replace the broken number with the next lowest number
		   store in low variable
		   output high variable and low variable
		   */

#include<iostream>
using namespace std;
bool containsDigit(int number, int digit);

int main()
{
	const int BADnum1(1), BADnum2(4), BADnum3(7);
	int inputTemp(0), hundreds(0), tens(0), ones(0), hiTemp(0), loTemp(0);

//	       Introduce Program
	cout << "This is a program to help you figure out how to avoid the broken buttons on your oven. \n"
		<< "Enter the temperature that you would like to cook at and I will check if it uses any of your \n"
		<< "broken buttons. \n"
		<< "If it does I will give you the closest availble tempuratures that you can use higher and lower. \n"
//         get tempurature from user
		<< "\nWhat temp would you like to cook at? \n";
	cin >> inputTemp;
	//     seperate the 100's, tens, and one's
//		   test to see if 1, 4, or 7 are in it (write function)
	do
	{
 if(inputTemp > 99 && inputTemp < 1000)
 {
	 bool test1(true), test2(true), test3(true);
	 int hiTemp100(0), hiTemp10(0), hiTemp1(0), loTemp100(0), loTemp10(0), loTemp1(0), outHtemp(0), outLtemp(0);

hundreds = inputTemp / 100;
test1 = containsDigit(hundreds, BADnum1);
test2 = containsDigit(hundreds, BADnum2);
test3 = containsDigit(hundreds, BADnum3);

if(true == test1 || test2 || test3)
{
	hiTemp100 = hundreds + 1;
    loTemp100 = hundreds - 1;

	loTemp = (hundreds * 100) + 99;
	hiTemp = hundreds * 100;

	outHtemp = hiTemp;
	outLtemp = loTemp;
	break;
}

inputTemp = inputTemp % 100;


tens = inputTemp / 10;
test1 = containsDigit(hundreds, BADnum1);
test2 = containsDigit(hundreds, BADnum2);
test3 = containsDigit(hundreds, BADnum3);

if(true == test1 || test2 || test3)
{
	hiTemp10 = tens + 1;
    loTemp10 = tens - 1;

	loTemp = (tens * 10) + 9;
	hiTemp = tens * 10;
}
inputTemp = inputTemp % 10;

ones = inputTemp / 1;
test1 = containsDigit(hundreds, BADnum1);
test2 = containsDigit(hundreds, BADnum2);
test3 = containsDigit(hundreds, BADnum3);

if(true == test1 || test2 || test3)
{
	hiTemp1 = ones + 1;
    loTemp1 = ones - 1;

}

 }
 else if(inputTemp < 100 && inputTemp > 10)
 {
tens = inputTemp / 10;
inputTemp = inputTemp % 10;

ones = inputTemp / 1;
 }
 else if(inputTemp < 10 && inputTemp > 0)
 {
	 ones = inputTemp / 1;
 }
 else
 {
	 cout << "Your oven does not cook at that tempurature. \n";
 }
 }
 while (inputTemp > 0);
//		   if there is a broken number 
//		   seperate the the broken number out and replace with the next highest number
//		   store in a high variable
//		   and replace the broken number with the next lowest number
//		   store in low variable
//		   output high variable and low variable


	return 0;
}
bool containsDigit(int number, int digit)
{
	return (number == digit);
}
int oneLess(int number)
{
	return (number - 1);
}
int oneMore(int number)
{
	return (number + 1);
}