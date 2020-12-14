/* 
 Filename: junkMail                (Chapter 6 Programming Project 1)
 Author:   David Dicken
 Description:  This is a program to generate junk mail.  It will take input from a file and from a keyboard.  The input from the file will be a letter.
               The leter will contain "#N#" and the program will replace all of the "#N#" with a name the user has entered.  And then save to a
			   different file

 Date last modified: 2/11/16

 Algorithm: Introduce the program
              ask user what file to read
			  ask user what file to save to
			  ask user what name to replace with
			  open file to read
			  search file for #N#
			  replace #N# with name user entered
			   
			write to save file
			close both files
       
 */

#include<iostream>
#include<string>
#include<fstream>
using namespace std;

// FUNCTIONS
void introduce(); //no input. outputs the introduction to the program
void getInput(ifstream& input, ofstream& output, string& name); // input: ifstream, ofstream, string variable Output: gets input from user to make
                                                                // adjustment to values stored in variables
void searchReplace(ifstream& input, ofstream& output, string name); // input: ifstream, ofstream, string variable Output: ofstream file with names replaced
void closeFiles(ifstream& input, ofstream& output); // input: ifstream, ofstream. Output: closes files


int main()
{
	ifstream inputFile;
	ofstream outputFile;
	string name(" ");

	introduce();
	getInput(inputFile, outputFile, name);
	searchReplace(inputFile, outputFile, name);
	closeFiles(inputFile, outputFile);

return 0;
}
//******************** FUNCTIONS ****************************************************
//***********************************************************************************


//********************** Close Files Function ***************************************
// Input: ifstream, ofstream
// Outut: closes files
// Algorithm: close files
//***********************************************************************************
void closeFiles(ifstream& input, ofstream& output)
{
	input.close();
	output.close();
}

//********************** Search and Replace function ********************************
// Input: ifstream, ofstream, string variable containing name
// Output: reads ifstream and write to ofstream making proper substitiutions
// Algorithm: read char from file
//             if matches the first char store in variable
//                  read next char if matches store in another variable
//                     read next char if matches store in another variable
//                       read next char if matches (whitespace)
//                          send user input string to output file
//           else if any of the if's fail send char's to the output file
//***********************************************************************************
void searchReplace(ifstream& input, ofstream& output, string name)
{
	const char match1('#'), match2('N'), match3('#'), match4(' ');
	char hold1(' '), hold2(' '), hold3(' ');

	do
	{
		input.get(hold1);
		if(hold1 == match1)
		{
         input.get(hold2);
		 if(hold2 == match2)
		 {
			 input.get(hold3);
			 if(hold3 == match3)
			 {
              output << name;
			 }
			 else
			 {
              output.put(hold1);
		      output.put(hold2);
			  output.put(hold3);
			 }
		 }
		 else
		 {
          output.put(hold1);
		  output.put(hold2);
		 }
		}
		else
		{
			output.put(hold1);
		}
	}
	while( ! input.eof());
}

//********************** get Input Function *****************************************
// Input: ifstream, ofstream, string variable for name
// Output: test and open files given by user. Makes adjustments to variables
// Algorithm: write variables to hold the filenames entered by the user
//           Ask user for filename of file to read
//           open the file
//           test if filename is valid (if statement)
//           put everything in a do while loop until filenmame is valid
//           Do the last four steps again exept for the save file      
//           Ask user for name to replace
//***********************************************************************************
void getInput(ifstream& input, ofstream& output, string& name)
{
	string fileIn(" "), fileOut(" ");

	//----------------------ifstream
	do
	{
	cout << "Please enter file name of letter: \n"; cin >> fileIn;
	input.open(fileIn);
	 if(input.fail())
	 {
		 cout << "File name not found \n"
			 << "Please enter a different file name \n";
	 }
	}
	while(input.fail());

	//-----------------------ofstream
	do
	{
	cout << "Please enter what you would like to have the new file saved as:\n"; cin >> fileOut;
	output.open(fileOut);
	if(output.fail())
	 {
		 cout << "Invalid file name \n"
			 << "Please enter a different file name \n";
	 }
    }
	while(output.fail());

	cout << "What name would you like to have inserted into the letter? \n";
	cin >> name;
}

//********************** Introduction Function ***************************************
// no input/ output: description of program to the user
// algorithm: cout a discription of what the program is going to do.
//************************************************************************************
void introduce()
{
	cout << "*****************************************\n"
		 << "          Junk Mail Generator       \n"
		 << "*****************************************\n\n"
		<< "You need to tell this program the file name of your letter.\n"
		<< "The file name that you would like the new letter saved at. \n"
		<< "And the name you would like to have inserted into it. \n\n";
}