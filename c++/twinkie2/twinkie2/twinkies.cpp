/*
Filename: Twinkies             (Chapter 4 Programming Project 6)
Author:   David Dicken
Description:  A program that simulates a vending machine selling deep fried twinkies for $3.50.  The program only takes
              dollars, quarters, dimes, nickles.  And simulates a customer putting coins in one by one.  It will output 
			  the total entered so far after every coin and after $3.50 is reached output "enjoy your deep fried twinkie"
			  and amount of change due.

Date last modified: 1/30/16

Algorithm: Introduce Program
           Write variable for total amount due
		   ask user for coin to input
		   write function to determine the value of coin entered
		        write constants for dollars, quarters, dimes, nickles
		        write a switch to figure out coin used and value of coin
		   subtract that amount from amount due
		   if total amount due is =< 0 output 'enjoy your deep fried twinkie'
		   turn total amount due to a possitive number (*-1) and output it as change due
		   if total amount due is > 0 loop the switch again
*/
#include<iostream>
using namespace std;

double coinValue(char coin); //Input char representing the coin entered.  Outputs the value of the coin(double)

int main()
{   
	double totalDue(3.50), change(0.0);
	
//         Introduce Program
	cout << "Buy a deep fried twinkie for only $3.50 \n"
		 << "\nI am only able to take dollars, quarters, dimes, and nickles.\n";
		 while(totalDue > 0)
		 {
    char coin(' ');
	double amountInput(0.0);

	cout << "Amount Due: " << totalDue << endl;
//        Get coin from user
   cout << "Please enter a coin: \n"
		<< "($)dollar \n"
		<< "(Q)uarter \n"
		<< "(D)ime    \n"
		<< "(N)ickle  \n";
		cin >> coin;
		cout << "\n";

	coin = tolower(coin);
	amountInput = coinValue(coin);
	totalDue = totalDue - amountInput;      //subtract coin amount from amount due

		 }
		 cout << "Enjoy your deep fried twinkie! \n";

			 change = totalDue * -1;          // turn's totalDue to a possitive number to display as change due

		 cout << "Change: " << change << endl;  // display change due

	return 0;
}

double coinValue(char coin)

	/********************Coin value function**********************
	Algorithm: Write constants for value of dollars, quarters, dimes, and nickles.
	           write variable "value" to hold value of coin
			   write switch statement 
			   output = double value
	**************************************************************/
{
	const double dollar(1.0), quarter(.25), dime(.10), nickle(.05);
		double value(0.0);

	switch(coin)
	
	{
		// figure out value of coin 
	case '$':
		value = dollar;
		break;
	case 'q':
		value = quarter;
		break;
	case 'd':
		value = dime;
		break;
	case 'n':
		value = nickle;
		break;
	
	}
	return(value);
}