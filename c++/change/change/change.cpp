/* 
 Filename: change               (Chapter 5 Programming Project 4)
 Author:   David Dicken
 Description:  This is a program that tells the users what coins to give for change. The till is out of nickles and half dollars.

 Date last modified: 2/4/16

 Algorithm: Introduce program
            Get amount of change that is needed from user
			Convert to coins (quarters, dimes, pennies)
			         to get quarters needed divide change by 25
					 mod change by 25 to get remaining amount

					     to get dimes needed divide change by 10
						 mod change by 10 to get remaining amount

						     to get pennies needed divide change by 1
							 
			include the books void compute_coins function
			output coins needed to make change
			repeat until user says they are done


 */

//#include"stdafx.h"
#include<iostream>
using namespace std;
void intro(); // No input: Output: cout's introducing the program
void getAmount(int& amount); // Input: variable to hold amount enter by user Output: variable changed to hold amount entered by user (int 1-99)
void notInt(); // Input: cin Output: cleared cin if it was in a fail state
void compute_coins(int coin_value, int& num, int& amount_left); // Precondition: 0 < coin_value < 100; 0 <= amount_left < 100.
                                                                // Postcondition: num has been set equal to maximum number of
                                                                // coins of denomination coin_value cents that can be obtained
                                                                // from amount_left. additionally, amount_left has been decreased
                                                                // by the value of the coins, that is, decreased by num * coin_value
void output(int quarters, int dimes, int pennies, int totalChange); // Input: number of quarters, dimes, and pennies; total change entered by user
                                                                    // Output: cout to tell user quarter, dimes and pennies needed
void done(char& yesNo); // Input: exit variable Output: exit variable changed to user input

int main()
{
	char exit('y');

	intro();

	do
	{
		const int QUARTERS(25), DIMES(10), PENNIES(1);
		int changeNeeded(0), numOfquarters(0), numOfdimes(0), numOfpennies(0), startValue(0);

		getAmount(changeNeeded);
		startValue = changeNeeded;
		compute_coins(QUARTERS, numOfquarters, changeNeeded);
		compute_coins(DIMES, numOfdimes, changeNeeded);
		compute_coins(PENNIES, numOfpennies, changeNeeded);
		output(numOfquarters, numOfdimes, numOfpennies, startValue);
		done(exit);
	}
	while(exit == 'y');
		return 0;
}
 //***************** intro function**************
// No Input
// Output: couts introducing the program
//***********************************************
void intro() 
 {
#include<iostream>
using namespace std;

	 cout << "This program will tell you what coins to give your customer \n"
		<< "to make change. \n \n";
 }

//******************* getAmount function *********
// Input: amount int to be changed by function to the users input
// Output: int between 1 - 99
// Algorithm: input amount variable to be chaged
//            write constant for min change and max change
//            write a bool variable to use in testing wether user use a integer between 1-99
//            get change neede from user
//            test if amount is between 1 - 99
//                if not output "invalid input" and change bool to false
//            put everything in a do while loop
//            test bool value to end loop
//**************************************************
void getAmount(int& amount)
{
#include<iostream>
using namespace std;

const int MIN_AMOUNT(1), MAX_AMOUNT(99);
bool validNum(true);

do
{
     cout << "How much change does the customer need? \n"
	      << "Please enter a amount between " << MIN_AMOUNT << " - " << MAX_AMOUNT << endl;
	 cin >> amount;

	 if(amount >= MIN_AMOUNT && amount <= MAX_AMOUNT)
	 {
		 validNum = true;
	 }
	 else
	 {
		 notInt();

		 validNum = false;
		 cout << "Invalid amount. \n \n";
	 }
}
while(validNum != true);
}

//****************** Not INT Function **************
// Input: cin
// Output: cin cleared if it was in fail state
// Algorithm: test to see if cin is in a fail state
//            if it is clear the fail state and remove the invalid input
//**************************************************
void notInt()
{
	if (!cin)          // !cin test if cin is in fail state due to user entering a char
	{
     cin.clear();                                                       //clears cin fail state
	 cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');     //removes invalid input
	}
}

//****************** computeCoin function **********
// Input: coin value (int 25, 10, or 1), a variable to hold the amount of coin's of that value that 
// can be used for change (to be changed by function), a variable holding amount needed (int between 1 -99) to be
// changed by the function.
// Output: amount of coin of that value that can be used for change, and new amount needed after the coins of that value have been taken out
// Algorithm: input coin value, amount left and variable to hold coins used
//            divide amount left by coin value to find out how many coins to use of that value
//            mod amount left by coin value to find out how much change is still needed
//***************************************************
void compute_coins(int coin_value, int& num, int& amount_left)
{
	num = amount_left / coin_value;
	amount_left = amount_left % coin_value;
}

//***************** output function ****************
// Input: number of quarters, dimes, and pennies needed. And the initial amount user entered for change
// Output: cout how many quarters, dimes, and pennies are needed reach the amount the user input
// Algorithm: cout's
//**************************************************
void output(int quarters, int dimes, int pennies, int totalChange)
{
#include<iostream>
	using namespace std;

	cout << "\n" << totalChange << " cent(s) can be given as: \n "
		<< quarters << " quarter(s) " << dimes << " dime(s) " << pennies << " penny (pennies). \n";
}
//******************* Done Function ***********************************************
// Input: char - yes / no
// output: Function changes variable to user input
// Algorithm: Ask user if they want to run program again
//            Save responce to yesNo
//*********************************************************************************
void done(char& yesNo)
{
#include<iostream>
	using namespace std;

	cout << "\nWould you like to enter a different amount? \n"
		<< "Enter y for yes or any other key to exit \n";
	cin >> yesNo;
	yesNo = tolower(yesNo);
}