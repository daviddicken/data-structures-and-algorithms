/*
Filename: Bottles               (Chapter 4 Programming Project 4)
Author:   David Dicken
Description:  A program that outputs lyrics to the song ninty-nine bottles of beer on the wall.
              It needs to spell out the numbers ninety-eight not 98

Date last modified: 1/30/16

Algorithm: Lets sing a song
           create counter variable set at 99
		   do while counter > 0
		   create if statement for counter variable being between 2 - 19 (if(counter > 1 && counter < 20)
		   create case statement for 2-19 (function)
		   create else for counter variable = 1
		       add no more bottles of beer to end of one more bottle output
		   create tens function
		        counter / 10
				make case statement to return written number (ninety, eighty, ect)
		   create ones function
		        counter % 10
				make case statement to return written number (one, two, ect)
		  
*/
#include<iostream>
#include<string>
//#include <stdlib.h>  /

using namespace std;

string tens(int num); // input counter. Seperates the 10's and returns the correct string (Ninety, Eighty, ect)
string ones(int num); // input counter. Seperates the 1's and returns the correct string  (Nine, Eight, ect)
string teens(int num); // input counter. Returns the correct string (Nineteen, Eighteen, ect)

int main()
{
//         create counter variable set at 99
	int counter(99);
//	       Lets sing a song
	cout << "Let's sing a song... \n";
	_sleep(3000);      //pause 

//		   do while bottles > 0
	while(counter > 0)
	{
		string bottles1(" "), bottles2(" ");

//		   create if statement for counter variable being between 2 - 19 (if(counter > 1 && counter < 20)
		if(counter > 1 && counter < 20)
		{
			bottles1 = teens(counter);                    //get #'s spelled out two - nineteen

			cout << "\n" << bottles1 << "bottles of beer on the wall. \n"
			     << "     " << bottles1 << "bottles of beer.   \n"
			     << "\nTake one down, pass it around...\n";
			_sleep(5000);     //pause between lyrics
		}
		else if(counter > 19 && counter < 100)
		{
			bottles1 = tens(counter);                     //get 10's string (ninety,eighty, ect)
			bottles2 = ones(counter);                    //get 1's string (one, two, ect)

			cout << "\n" << bottles1 << bottles2 << "bottles of beer on the wall. \n"              
			     << "     " << bottles1 << bottles2 << "bottles of beer.   \n"
			     << "\nTake one down, pass it around...\n";
		      _sleep(5000);      //pause between lyrics
		}
		else if(counter == 1)                                //end song
		{
         cout << "\nOne more bottle of beer on the wall. \n"
			 << "     One more bottle of beer.   \n"
			 << "\nTake one down, pass it around...\n";

		 _sleep(5000);      //pause between lyrics

		cout << "\nNo more bottles of beer on the wall. \n"
		     << "     No more bottles of beer!!!     \n"
		     << "\nWho's going to the store? \n";
		 
		}
		counter--;
	}
	return 0;
}
string tens(int num)
	 /************************************************************************************************
	******************** Tens Function ***************************************************************
	**************************************************************************************************
	*** Input: integer counter             ***********************************************************
	*** Algorithm: divide counter by 10 to isolate the integer in the ten spot    ********************
	***            create variables to hold that number and the string to return  ********************
	***            use a case statement to assign the proper string to the variable to be returned ***
	***** Output: string ("Ninety" for 9, "Eighty for 8, ect)   **************************************
	**************************************************************************************************/
{
	int tenSpot(0);
	string output;

	tenSpot = num / 10;

		switch(tenSpot)
	{
		case 9:
			output = "Ninety";
			break;
		case 8:
			output = "Eighty";
			break;
		case 7:
			output = "Seventy";
			break;
		case 6:
			output = "Sixty";
			break;
		case 5:
			output = "Fifty";
			break;
		case 4:
			output = "Fourty";
			break;
		case 3:
			output = "Thirty";
			break;
		case 2:
			output = "Twenty";
			break;
		default:
			output = " ";
			break;
	}
return(output);
}

 /****************************************************************************************************
	******************** Ones Function ***************************************************************
	**************************************************************************************************
	*** Input: integer counter             ***********************************************************
	*** Algorithm: Mod counter by 10 to isolate the integer in the ones spot      ********************
	***            create variables to hold that number and the string to return  ********************
	***            use a case statement to assign the proper string to the variable to be returned ***
	***** Output: string ("nine" for 9, "eight" for 8, ect)   ****************************************
	**************************************************************************************************/

string ones(int num)
{
	int oneSpot(0);
	string output(" ");

	oneSpot = num % 10;

		switch(oneSpot)
	{
		case 9:
			output = "-nine ";
			break;
		case 8:
			output = "-eight ";
			break;
		case 7:
			output = "-seven ";
			break;
		case 6:
			output = "-six ";
			break;
		case 5:
			output = "-five ";
			break;
		case 4:
			output = "-four ";
			break;
		case 3:
			output = "-three ";
			break;
		case 2:
			output = "-two ";
			break;
		case 1:
			output = "-one ";
			break;
		default:
			output = " ";
			break;
	}
return(output);
}

/****************************************************************************************************
	******************** Teens Function ***************************************************************
	**************************************************************************************************
	*** Input: integer counter             ***********************************************************
	*** Algorithm: Create a variable to hold the correct string to be returned ***********************
	***            Use a switch statement to find the correct string to return ***********************
	***** Output: string ("Nineteen" for 19, "Two" for 2, ect)   ****************************************
	**************************************************************************************************/
string teens(int num)
{
	string output(" ");
 
		switch(num)
	{
		case 19:
			output = "Nineteen ";
			break;
		case 18:
			output = "Eighteen ";
			break;
		case 17:
			output = "Seventeen ";
			break;
		case 16:
			output = "Sixteen ";
			break;
		case 15:
			output = "Fifteen ";
			break;
		case 14:
			output = "Fourteen ";
			break;
		case 13:
			output = "Thirteen ";
			break;
		case 12:
			output = "Twelve ";
			break;
		case 11:
			output = "Eleven ";
			break;
		case 10:
			output = "Ten ";
			break;
		case 9:
			output = "Nine ";
			break;
		case 8:
			output = "Eight ";
			break;
		case 7:
			output = "Seven ";
			break;
		case 6:
			output = "Six ";
			break;
		case 5:
			output = "Five ";
			break;
		case 4:
			output = "Four ";
			break;
		case 3:
			output = "Three ";
			break;
		case 2:
			output = "Two ";
			break;
		default:
			output = " ";
			break;
	}
return(output);
}

