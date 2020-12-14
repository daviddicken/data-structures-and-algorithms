/* 
 Filename: avgWord               (Chapter 6 Programming Project 4)
 Author:   David Dicken
 Description:  This is a program that reads a text file and outputs the avg lenth of the words found in the file.
               A word is defined as a string of symbols followed by a whitespace, comma, period, or end of line.
			   The program will define a function that is called with input-file stream as a argument
			   The function will also work with the stream cin as the input stream

 Date last modified: 2/11/16
 Algorithm: Functions:
              Introduce - cout's to user
			  openfile - ask user what file and open
			  calculate - count the characters and count the words
			            divide the characters by the words to find out average word length
			  closefile - close the file
			  output - use cout's to output amount of words in the file and the average word legnth
            Figure out how to get this program to accept cin stream
			bulletproof
 */

#include<iostream>
#include<fstream>
#include<string>

using namespace std;

//FUNCTION CALLS
void introduce(); //no input introduces the program
void getFile(ifstream& input); //input: ifstream. Output: ifstream w/ open file attached
void readCalc(istream& input, double& wordCount, double& avgWord); // input: ifstream, double wordcount, and avgword variables
                                                                    // output: wordcount and avgword variables values changed by the function
void closeFile(ifstream& input);  // input: ifstream. output: closes file
void output(double wordCount, double avgWord); // input: double wordcount and avgword. Output: cout the word count and avg word legnth to user

int main()
{
	ifstream file;
	double wordCount(0.0), avgWord(0.0);
	
	introduce();
	getFile(file);
	readCalc(file, wordCount, avgWord);
	closeFile(file);
	output(wordCount, avgWord);

return 0;
}

//******************* Functions ***************************
//*********************************************************

//********************** Output Function ******************
// Input: double wordcount variable and average word size variable
// Output: cout's to tell user average word size in file
// Algorithm: input variables
//            write code to keep numbers after dec to 3
//            write cout's to user
//                convert wordcount variable to integer
//*********************************************************
void output(double wordCount, double avgWord)
{
cout.setf(ios::fixed);
cout.setf(ios::showpoint);
cout.precision(3);

cout << "\nThere is " << static_cast<int>(wordCount) << " words in that file. \n"
	 << "And the average word length is " << avgWord << ". \n\n"; 
}

//********************** Close File Function **************
// Input: ifstream
// Outut: closes file
// Algorithm: close file
//*********************************************************
void closeFile(ifstream& input)
{
	input.close();
}

//******************** Read & Calc function ***************
// Input: ifstream, double wordCount and avgWord variables to be changed by program
// Output: variable values changed
// Algorithm: input int word count variable, double variable for avg word, ifstream*
//            make variables to hold char count*
//            and a variable to hold the last char read and one to hold current char read.*
//            if char read is a symbol(add to char count)
//            if char read is a (, . space or end of line) and last char is a symbol then add one to word count*
//            double divide char count by word count for average*
//            return changed double avg word and double word count values*    
//*********************************************************
void readCalc(istream& input, double& wordCount, double& avgWord)
{
	double countChar(0.0);
	char lastRead(' '), current(' ');

	while(! input.eof())
	{
     input.get(current);

	 if(! isspace(current) && ',' != current && '.' != current)               
	 {
      countChar++;
	 }
	 else if(! isspace(lastRead) && ',' != lastRead  && '.' != lastRead)
	 {
      wordCount++;
	 } 
	 lastRead = current;
	}                                                               //end of while loop
	
	if(countChar > 0)
	{
	  if(! isspace(current) && ',' != current && '.' != current)    // to catch if the file ended with a word
	  {
		wordCount++;
		countChar--;                                                // subtract 1 for the extra time the last char got ran through the loop
	  }
	}
	else                                                           // message if no words were found in selected file
	{
		cout << "No words were found in that file. \n\n";
		exit(0);
	}

	avgWord = countChar / wordCount;                               // find avg
}

//********************** Get File *************************
// Input: ifstream
// Output: ifstream with open file attached
// Algorithm: Ask user for filename
//            test for filename
//            open file
//*********************************************************
void getFile(ifstream& input)
{

	string fileIn(" ");
	do
	{
	cout << "What file would you like to know the average word length? \n"; 
	cin >> fileIn;
	input.open(fileIn);
	 if(input.fail())
	 {
		 cout << "File name not found \n"
			 << "Please enter a different file name \n";
	 }
	}
	while(input.fail());
}

//********************** Introduction Function ***************************************
// no input/ output: description of program to the user
// algorithm: cout a discription of what the program is going to do.
//************************************************************************************
void introduce()
{
	cout << "*****************************************\n"
		 << "         Average Word Length            \n"
		 << "*****************************************\n\n"
		<< "This program can calculate the average word length of words in a file \n"
		<< "Word's are defined as any symbols that are followed by one of the \n"
        << "following at each end: a blank, a comma, a period, the beginning of \n"
        << "a line, or the end of a line.\n\n";
}