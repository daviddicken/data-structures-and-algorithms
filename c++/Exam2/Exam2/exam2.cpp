/*
Filename: exam2
Author: David Dicken
Description: This program will convert a integer between 1 - 3999 into roman numerals.
             This program needs to ask the user for the name of the file to be read and the name of file to be saved.
			 This program will use atleast 2 functions and an assertion.

Algorithm:  Introduce program*
            Get name of files from user*
			Test that files are valid*
			open files*
			convert integers in file into roman numerals*
			save to output file*
			close files*
*/

#include<iostream>
#include<fstream>
#include<string>
#define NDEBUG
#include <cassert>
using namespace std;

//FUNCTION CALLS
void intro(); //No input. Outputs a description of the program
void getFiles(ifstream& input, ofstream& output); //Input ifstream and ofstream variables. Output ifstream and ofstream variables with open files attached
void readFile(ifstream& input, ofstream& output);//Input ifstream and ofstream variables. Output sends a integer read from file to convert function or inserts
// a message to of file if number read is invalid
void convertNum(int num, ofstream& output); //Input integer between 1-3999 and ofstream to be written to
void closeFiles(ifstream& input, ofstream& output); //Input ifstream and ofstream variables Output closes files that are attached to variable

int main()
{

	ifstream input;
	ofstream output;

	intro();
	getFiles(input, output);
	readFile(input, output);
	closeFiles(input, output);
	return 0;
}

/*---------------------------------------
------------ Functions ------------------
-----------------------------------------*/

/*---------- Close files function -------
input: ifstream and ofstream variables
output: closes files attached to if and of streams
algorithm: close files
-----------------------------------------*/
void closeFiles(ifstream& input, ofstream& output)
{
	input.close();
	output.close();
}

/*-------- Convert Function -------------
input: ifstream and ofstream variables
output: ifstream file converted into roman numerals and saved to ofstream file
algorithm: make loop to read numbers till next whitespace or end of file into a variable
           test if number is between 1-3999
		   test if number is over 1000
		      if not a valid number output invalid message
-----------------------------------------*/
void readFile(ifstream& input, ofstream& output)
{
	const string INVALID("Invalid # ");
	int num(0);
	

	do
	{
		input >> num;
		if (!input.eof())
		{
			if (num > 0 && num < 4000)
			{
				convertNum(num, output);
				num = 0;
			}
			else
			{
				output << INVALID;
				output << endl;
			}
		}
	} 
	while (!input.eof());

}

/*-------- Convert Function -------------
input: num to be converted. ofstream to write converted number to
output: ifstream file converted into roman numerals and saved to ofstream file
algorithm:test if number if > 1000
          seperate out the 1000's divide that number by 1000 and add that many M's to roman variable
		  subtract the 1000's from number to get hundreds
		  test if number left is greater then 100
		  seperate out the 100's divide that number by 100 to figure out what roman numeral to add to roman variable
		  cm=900 d=500 cd=400 c=100 cm=9 d-dccc=5-8 cd=4 i-iii=1-3
		  subtract 100's from numbers to get 10's
		  ect
		  ect
		  when finished write roman string to ofstream file
		  clear roman variable
-----------------------------------------*/
void convertNum(int num, ofstream& output)
{
	string roman("");
	int section(0);

	assert((num > 0) && (num < 4000));
	if (num >= 1000)
	{
		section = (num / 1000);      // divide out 1000's

		for (int i = 0; i < section; i++)
		{
			roman += 'M';           // M = 1000
		}
		num %= 1000;                // subtract 100's from number
	}
	if (num >= 100)
	{
		section = (num / 100);      // divide out 100's

		if (section == 9)
		{
			roman += "CM";            // CM = 900
		}
		else if (section >= 5)
		{
			roman += 'D';             // D = 500
			for (int i(0); i < section - 5; i++)
			{
				roman += 'C';        // C= 100
			}
		}
		else if (section == 4)
		{
			roman += "CD";          // CD = 400
		}
		else if (section >= 1)
		{
			for (int i(0); i < section; i++)
			{
				roman = +'C';      // C = 100
			}
		}
		num %= 100;               // subtract 100's from number
	}
	if (num >= 10)
	{
		section = (num / 10);    // divide out 10's from number

		if (section == 9)
		{
			roman += "XC";       // XC = 90
		}
		else if (section >= 5)
		{
			roman += 'L';       // L = 50
			for (int i = 0; i < section - 5; i++)
			{
				roman += "X";     // X = 10
			}
		}
		else if (section == 4)
		{
			roman += "XL";      // XL = 40   
		}
		else if (section >= 1)
		{
			for (int i(0); i < section; i++)
			{
				roman += 'X';    // X =10
			}
		}
		num %= 10;    // subtract 10's from number
	}
	if (num >= 1)
	{
		if (num == 9)
		{
			roman += "IX";      // IX = 9
		}
		else if (num >= 5)
		{
			roman += 'V';       // V = 5

			for (int i(0); i < num - 5; i++)
			{
				roman += 'I';      // I = 1
			}
		}
		else if (num == 4)
		{
			roman += "IV";        // IV = 4
		}
		else if (num >= 1)
		{
			for (int i(0); i < num; i++)
			{
				roman += 'I';     // I = 1
			}
		}
	}
	output << roman;        // output roman numeral to ofstream file
	output << endl;
	roman = "";                      // clears roman variable
}

/*-------- Get Files --------------------
input: ifstream and ofstream variables to be changed by function
output: ifstream and of stream variables with files attached
algorithm: Ask user for name of input file
           test if program can open file
		     if not ask again inside of a loop till file can be opened
		   do the same steps for the output file
-----------------------------------------*/
void getFiles(ifstream& input, ofstream& output)
{
	string infile(""), outfile("");

	do
	{
	cout << "What file would you like me to convert? \n";
	cin >> infile;
	input.open(infile);

	if (input.fail())
	{
		cout << "Invalid file name \n"
			<< "Please enter a different file name. \n\n";
	}
	}
	while(input.fail());

	do
	{
		cout << "\nPlease enter were you would like the converted file saved: \n";
		cin >> outfile;
		output.open(outfile);

		if (output.fail())
		{
			cout << "Invalid output file name \n"
				<< "Please enter a differnt name to save file as.";
		}
	} 
	while (output.fail());
}

/*-------- Intro Function ---------------
Input: none
Output: cout's to user to explain what the program will do
Algorithm: Write cout's explaining the program
-----------------------------------------*/
void intro()
{
	cout << "**************************\n"
		<< "  Roman Numeral Converter        \n"
		<< "***************************\n\n"
		<< "This program wil read a file that you tell it to \n"
		<< "and convert the integers in that file into roman numerals. \n"
		<< "It will then save the roman numerals to a file of your choice. \n\n";
}