/* 
 Filename: Fibonacci         (Chapter 3 Programming Project 6)
 Author:   David Dicken
 Description:  A program that takes both the initial size of a green crud population (in pounds) and a number of days
               from the user and outputs how many pounds of crud there would be after that many days.
			   Crud stays the same for 4 days and increases on the 5th day.
			   The program needs to allow the user to input as #'s as many times as they would like. 

 Date last modified: 1/23/16

 Algorithm:  Get initial size of green crud from user in pounds
             get number of days from the user
			 create a variable for total weight
			 create two more variables for the two previous weights
			 write a loop that uses a counter to count up to the desired amount of days
			 nest a if statement (if counter is dividable by 5) then increase weight of crud
			 in the if statement create a way to move the most resent weights to proper weight variables
			 Output the total weight to user
			 Ask if user would like to enter new numbers
			 Bulletproof
 */

#include <iostream>
using namespace std;

int main()
{    
	    char exit('y');

	do
	{
		double days(0.0), crud1(0.0), crud2(0.0),total(0.0);
	    int counter(1);
	    

	cout << "How many pounds of crud do you have to start with? \n"; cin >> crud1;
	cout << "How many days will you be keeping this crud? \n"; cin >> days;
	
	if (days >= 10)
	{
	while (counter <= days)
	{
		if (counter%5 == 0)
		{
			total = crud1 + crud2; 
			crud2 = crud1;
            crud1 = total;
		}
		counter++;
	}

	cout << "At the end of " << days << " days you will have " << total << " pounds of crud! \n";
	cout << "\n";
	}
	else if(days > 1)
	{
	cout << "Your crud will still weigh " << crud1 << " pounds " << "after " << days << " days. \n";
	}
	else if(days == 1)
	{
	cout << "Your crud will still weigh " << crud1 << " after " << days << " day. \n";
	}
	else 
	{
     cout << "\nInvalid amount of days or \n"
	      << "Invalid character for crud weight. \n"
		  << "Please use positive integers. \n";
	 cin.clear();                                                       //clears cin fail state
	 cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');     //removes invalid input
	}

	cout << "\nWould you like to enter a different amount? \n";
	cout << "Enter y for yes or any other key for no. \n"; cin >> exit;
	cout << "\n";
	exit = tolower(exit);
	
	}
	while (exit == 'y');

	return 0;
}
