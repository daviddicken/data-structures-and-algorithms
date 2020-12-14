/* 
 Filename: dous              (Chapter 6 Programming Project 14)
 Author:   David Dicken
 Description:  This program will read a file named word.txt and search for any words ending with dous 
               It will output the words to the screen

 Date last modified: 2/12/16

 Algorithm: Functions:
            Introduce the program
            open file
			search file for words ending with dous
			output those words to the screen
			close word.txt   
 */

#include<iostream>
#include<string>
#include<fstream>
using namespace std;

//--- Function Calls ---
void introduce(); // no input. Introduces program
void getFile(ifstream& input); // input: ifstream. Output: ifstream w/ open file attached 
void search(ifstream& input, string& words); // input: ifstream, string words. Output: words variable will hold any words found matching in file.
void closeFile(ifstream& input); // input: ifstream. Output: closes ifstream file
void output(string words); //input: words. Output: displays words matching found in file.

int main()
{
	ifstream input;
	string words("");

	introduce();
	getFile(input);
	search(input, words);
	closeFile(input);
	output(words);


return 0;
}
/*---------------- Functions --------------------------
-----------------------------------------------------*/

/*--------------- Output Function --------------------
input: string words
output: cout's to user showing list of words
algorithm: test if words is empty
             display message to user that no words were found
           cout message to user
           cout words variable
----------------------------------------------------*/
void output(string words)
{
	if("" == words)
	{
		cout << "\nNo words ending 'dous' were found in that file. \n";
	}
	else
	{
		cout << "\nHere are the words I found in that file ending with 'dous' \n" << words << endl;
	}
}

/*-------------- Close File Function -----------------
Input: ifstream
Outut: closes file
Algorithm: close file
----------------------------------------------------*/
void closeFile(ifstream& input)
{
	input.close();
}


/*--------------- Search function ---------------------
input: ifstream, string words
output: words variable to be changed by function
algorithm: read each alpha char into hold array
		   keep counter of alpha chars in array
		   when alpha char is not read use (counter -1, -2, -3, -4) to test those elements and see if they match d,o,u,s
			  if match write char in elements up to (counter#) into string 
			  also enter \n to string after word
			clear array and counter
			loop till end of file
-----------------------------------------------------*/
void search(ifstream& input, string& words)
{
	const char MATCH[ ] = {'d','o','u','s'};
	const int MAXSIZE(50), MINarray(2);
	int counter(0), minus1(0),minus2(0),minus3(0),minus4(0);
	char hold[MAXSIZE] = {' '}, tempChar(' ');

	do                          //main loop
	{
	do                          //this loop runs as long as char read is a letter
	{
	input.get(tempChar);
	if(input.eof())                 //catches eof failure if file ends on a letter and breaks out of loop
	{
		break;
	}
	if (isalpha(tempChar))           //tests if char is a letter
	{
     hold[counter] = tempChar;      //stores char in hold array matching counter
	 counter++;                    
	}
	}
	while (isalpha(tempChar));
	if (counter > MINarray)         // test that word stored in array is long enough to end in dous
	{
     minus1 = counter - 1;          //set variables to be able to pull up last four char's
	 minus2 = counter - 2;         // stored in hold array for comparison to d,o,u,s in if statement below
	 minus3 = counter - 3;         
	 minus4 = counter - 4;
	 if (hold[minus1] == MATCH[3] && hold[minus2] == MATCH[2] && hold[minus3] == MATCH[1] && hold[minus4] == MATCH[0])
	 {
      for(int i(0); i <= counter; i++)
	  {
		  words += hold[i];            //rebuild word from array to word string
	  }
	  words += '\n';                  // add's a carage return after word
	 }
	}
	counter = 0;                            //reset counter
	for(int i(MAXSIZE - 1); i >= 0; i--)    
	  {
		 hold[i] = ' ';                     //reset array
	  }
	}
	while(! input.eof());                  // catches eof if file ends on something other then a letter
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
		string fileIn("");
	do
	{
	cout << "What file would you like to search? \n"; 
	cin >> fileIn;
	input.open(fileIn);
	 if(input.fail())
	 {
		 cout << "File name not found \n"
			 << "Please enter a different file name \n\n"
			 << "If using Visual Studio please make sure that the \n"
			 << "the file you want is in the same folder as the cpp file \n";
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
		 << "        Words Ending in dous            \n"
		 << "*****************************************\n\n"
		<< "This program will find all words ending with dous in a file for you. \n\n";
}