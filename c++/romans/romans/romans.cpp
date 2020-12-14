/* 
 Filename: Roman               (Chapter 3 Programming Project 3)
 Author:   David Dicken
 Description:  A program that takes a four digit year between 1000 and 3000 from the user and converts it to roman numerals.
               Allow user to enter another date into the converter if they want.
               

 Date last modified: 1/23/16

 Algorithm:  Get a four digit year from the user and put in "date" variable
             Test if input from user is between 1000 and 3000
             Create a string variable "roman" to store Roman Numerals
             Seperate out 1000's from date divide that number by 1000 and add that many M's to "roman" variable
1000's    ** M = 1000 (1-3 = M-MMM)
			 Subtract the thousands from the "date" variable
			 Seperate 100's divide by hundreds by 100. Use that # to figure out what roman numerals to add to roman variable
100's     ** CM = 900    D = 500    CD = 400   C = 100
		     9 = CM     (5-8 = D-DCCC)  4 = CD  (1-3 = I-III)
			 Subtract 100's from the date variable.
		     Seperate 10's from date divide 10's by 10.  Use that # to figure out what roman numerals to add to roman variable
 10's 	  ** XC = 90     L = 50     XL = 40  X = 10
		     9 = XC     (5-8 = L-LXXX) 4 = XL (1-3 = X-XXX)
			 Subtract 10's from the date variable.
			 Use the number left in the date variable to figure out what roman numerals to add to the roman vaiable for the ones
  1's     ** IX = 9      V = 5      IV = 4    I = 1
		     9 = IX   (5-8 = V-VIII) 4 = IV  (1-3 = I-III)
			 Output "roman" string
			 Ask user if they would like to play again.
			 Bulletproof

 */
#include<iostream>
#include<string>
using namespace std;

int main()
{
	
	char exit('Y');
	int date(0), sec(0);    // sec stands for section

	cout << "\n"
	     << "\n"
	     << "                Roman Numeral Year Converter               \n"
         << "\n"	
	     << "Please enter a four digit year to be converted to Roman Numerals \n"
	     << "Between 1000 & 3000 A.D. \n"
	     << "Example: 1999 \n"
		 << "\n";
	do
	{
		cout << "Date: ";
	    cin  >> date;
		string roman(" ");

	if ((date > 3000) || (date <= 999))
	{
		cout << endl << "Invalid Date" << endl;
	}
	else 
	{
		if (date >= 1000) 
		{
         sec = (date / 1000);            // divide out 1000 section to figure out how many M's

		 for (int i = 0; i < sec; i++) 
		 {
			 roman += 'M';              // M = 1000
		 }
		 date %= 1000;                  // subtract 1000's from date with the mod
		}
		if (date >= 100) 
		{
			sec = (date / 100);         // divide out hundreds from date

			if (sec == 9)
			{
				roman += "CM";         // CM = 900   
			}
			else if (sec >= 5)
			{
				roman += 'D';          // D = 500

				for (int i(0); i < sec - 5; i++)
				{
					roman += 'C';      // C = 100
				}
			}
			else if (sec == 4)
			{
				roman += "CD";         // CD = 400
			}
			else if (sec >= 1)
			{
				for (int i(0); i < sec; i++)
				{
					roman += 'C';       // C = 100
				}
			}
			date %= 100;                // mod 100's (subtract) from of the date
		}
		if (date >= 10)
		{
			sec = (date / 10);         // divide out 10's from the date

			if (sec == 9) 
			{
				roman += "XC";          // XC = 90
			}
			else if (sec >= 5) 
			{
				roman += 'L';           // L = 50

				for (int i = 0; i < sec - 5; i++)
				{
					roman += 'X';        // X = 10
				}
			}
			else if (sec == 4) 
			{
				roman += "XL";           // XL = 40
			}
			else if (sec >= 1) 
			{
				for (int i(0); i < sec; i++)
				{
					roman += 'X';        // X = 10
				}
			}
			date %= 10;                  // mod (subtract) 10's from date
		}
	if (date >= 1) 
	{
		if (date == 9)
		{
			roman += "IX";               // IX = 9
		}
		else if (date >= 5)
		{
			roman += 'V';                // V = 5

			for (int i(0); i < date - 5; i++)
			{
				roman += 'I';            // I = 1
			}
		}
		else if (date == 4) 
		{
			roman += "IV";               // IV = 4
		}
		else if (sec >= 1) 
		{
			for (int i(0); i < date; i++) 
			{
				roman += 'I';           // I = 1
			}
		}
	}
	cout << "\nRoman numeral: " << roman << endl;
	cout << "\n";
	}

	if (!cin)          // !cin test if cin is in fail state due to user entering a char
	{
     cin.clear();                                                       //clears cin fail state
	 cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');     //removes invalid input
	}

	cout << "Would you like to try a different date? \n";
	cout << "Enter y for yes or any other key to exit. \n"; cin >> exit;
	cout << "\n";
	}
	while ((exit == 'y') || (exit == 'Y'));
	return 0;
}