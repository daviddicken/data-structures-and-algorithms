/* 
 Filename: WaitTime               (Chapter 5 Programming Project 3)
 Author:   David Dicken
 Description:  This is a program that takes the current time and wait time as to integers (hours and minutes) provided by the user.
               And outputs what time it will be after the wait time is over.  This program needs to allow the user to enter times as
			   many times as they want.

 Date last modified: 2/3/16

 Algorithm: Introduce program
            get curent time from user (hour, minute, am/pm)
			get wait time in hours and then minutes from user
			write a function to convert time to 24 hour
			    read hour variable and am/pm variable to function
				if pm add 12 hours to hour variable
		   write function to add wait hours and minutes to time hours and minutes
		        plus plus
		   write function to convert back to 12 hour format.
		        read in time hour and minute am/pm& variable
				if hour between 12 - 24 
				   change am/pm to pm
				if hour between 13 - 24 
				   subtract 12 from hour
				if minutes are over 59
				   add 1 to hour variable
				   subtract 60 from minutes
			Output time after wait.
			ask if user wants to run program again 
 */

//#include"stdafx.h"
#include<iostream>
using namespace std;

void introduce(); //no input. outputs the introduction to the program
void getInput(int& startH, int& startM, char& startA, int& waitH, int& waitM); //input hours, minutes, am/pm, waitHour, and waitMin variables
                                                                               //Outputs: The users input into the variables
void convert24(int& hour, char ampm); // input: int hour(time) and char (am or pm). Outputs hour variable in 24hr format
void addWait(int& hour, int& min, int waitingHour, int waitingMin); // input: int hour, minutes, waitinghour, and waitingMin variables
                                                                   // outputs: hour and minutes variable with wait time added to them
void convert12(int& hour, int& min, char& pm); // input: int hour, minutes, and char am/pm variable. 
                                               // Output: hour, and minutes converted back to 12 hr format with char = proper am or pm
void output(int hour, int min, char pm);   // input: int hour, minutes and char am/pm variables. Outputs end time to user
void done(char& yesNo);                    // input: yes no variable. Output: User input yes or no

int main()
{
	char exit ('y');

	 introduce();

	do
	{

    char endPm('p');
	int waitHour(0), waitMin(0), endHour(0), endMin(0);
	                                                                                
	getInput(endHour, endMin, endPm, waitHour, waitMin);
	convert24(endHour, endPm);
	addWait(endHour, endMin, waitHour, waitMin);
	convert12(endHour, endMin, endPm);
	output(endHour, endMin, endPm);
	done(exit);
	}
	while(exit == 'y');

	return 0;
}
//********************** Introduction Function ***************************************
// no input/ output: description of program to the user
// algorithm: cout a discription of what the program is going to do.
//************************************************************************************
 void introduce() 
 {
#include<iostream>
using namespace std;

	 cout << "This program will tell you what time your wait will be over at. \n"
		<< "Just enter the current time and how many hours and minutes you are \n"
		<< "expected to wait. \n"
		<< "And I will tell you what time your wait will be over at. \n \n";
 }

 //*******************************getInput function*******************************************
 //Input: Int - hour, minute, waithour, waitminute. variables to be changed by the function
 //       Char - am/pm
 // Output: Function can change all variable
 // Algorithm: cout user for current time
 //            cin current time
 //            cout user for wait time
 //            cin wait time
 //*******************************************************************************************
void getInput(int& startH, int& startM, char& startA, int& waitH, int& waitM) 
{
#include<iostream>
using namespace std;

    cout << "What is the current time? (example: 3 00 p) \n"
		<< "Use a for am and p for pm. \n"
		<< "Don't forget to put a space between hours_minutes and the a or p: \n";

	cin >> startH; cin >> startM; cin >> startA;
	
	startA = tolower(startA);

	cout << "How long do you have to wait for? \n"
		 << "How many hours? "; cin >> waitH;
	cout << "\nHow many minutes? "; cin >> waitM;
}

//******************************* Convert to 24 function ********************************************
// Inputs: hour, ampm  (hour variable to be changed by function)
// Output: Function can change hour variable
// Algorithm: create const for 12
//            if ampm = p and hours does not = 12
//				add 12 to hours
//            if ampm = a and hours = 12
//              add 12 to hours
//***************************************************************************************************
void convert24(int& hour, char ampm)
{
#include<iostream>
using namespace std;

	const int format(12);      //if this constant is changed the 12hr format convertion will not work right
	
	if(ampm == 'p' && hour != format || ampm == 'a' && hour == format)
	{
		hour = hour + format;
	}
}

//********************** Add Wait function ************************************************
// Input: int - starting hours, starting minutes, waiting hours, waiting minutes  (Hours and Minutes to be changed by the function)
// Output: Function can change hours and minutes
// Algorithm: add the swaiting time to the starting times (hours and minutes)
//*****************************************************************************************
void addWait(int& hour, int& min, int waitingHour, int waitingMin)
{
#include<iostream>
	using namespace std;

	hour = hour + waitingHour;
	min = min + waitingMin;
}

//*************** Convert to 12 hr function *************************************
// Input: int - end hours, end minutes 
//        char - am/pm
// Outout: Function can make changes to all input variables
// Algorithm:   if minutes are over 59
//				   add 1 to hour variable
//				   subtract 60 from minutes
//				if hour between 12 - 23 
//				   change am/pm to pm
//				if hour between 13 - 24 
//				   subtract 12 from hour
//*******************************************************************************			
void convert12(int& hour, int& min, char& pm)
{
#include<iostream>
using namespace std;
const int hoursNday(24), minNhour(60), lastAm(11), noon(12);
int min2hour(0);

if (min >= minNhour)
{
	min2hour = min / minNhour;
	hour = hour + min2hour;

	while(min >= minNhour)
	{
		min = min - minNhour;
	}
}

if(hour > hoursNday)
{
	while(hour > hoursNday)
	{
     hour = hour - hoursNday; 
	}
}
if(hour > lastAm && hour < hoursNday)
{
	pm = 'p';
}
else
{
	pm = 'a';
}
if(hour > noon && hour <= hoursNday)
{
	hour = hour - noon;
}
}
//********************** Output Function *****************************************
// Inputs: final hours, final minutes, final am/pm
// Output: cout to user
// Algorithm: Write cout to tell user what time wait is over
//********************************************************************************
void output(int hour, int min, char pm)
{
#include<iostream>
using namespace std;

	cout << "\nYour wait will be over at " << hour << ":";
	cout.width(2);          // next two lines make sure that two digits are output for minutes (00 instead of 0)
	cout.fill('0');
	cout << min << " ";
	cout << pm << "m \n";
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

	cout << "\nWould you like to enter a different start time and wait time? \n"
		<< "Enter y for yes or any other key to exit \n";
	cin >> yesNo;
	yesNo = tolower(yesNo);
}


