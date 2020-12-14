/* 
 Filename: names                (Chapter 6 Programming Project 10)
 Author:   David Dicken
 Description:  This program will allow the user to enter a name.  Then the program will search a file containing the top 1000 baby names for
               2012.  The program will the ranking of that name for boys and girls or will let the user no if the name is not ranked.
			   Example output: "Name" is ranked 376 in popularity among boys.
			                   "Name" is not ranked in popularity among girls.

 Date last modified: 2/12/16

 Algorithm: Introduce the program
			open names file
			Get name user would like to check
			search for names that match 
			display the name and rank like in the example above
			close names file
			close program
       
 */

#include<iostream>
#include<fstream>
#include<string>
using namespace std;

//--- Function Calls ---
void introduce(); // no input. introduces program
void openFile(ifstream& input); // input: ifstream Output: ifstream w/open file linked to it
void getInput(string& name); // input: string name variable Output: name variable with user entered value
void search(ifstream& input, string& bRank, string& gRank, string name); // input: ifstream, string boyRank, girlRank, name
                                                                         // output: boy and girl rank variables to be passed to another function
                                                                         // to have value changed. name variable to be passed to function to be read
void compare(string userName, string boyname, string girlname, string rank, string& bRank, string& gRank); // input:string name, boyname, girlname,
                                                                         // rank, boy rank and girl rank variables.
                                                                         // Output: boy and girl variable values to be changed
void closeFile(ifstream& input);// input: ifstream. Output: closes file
void output(string name, string boyRank, string girlRank); // input: string name, boyRank, girlRank. Output: cout's to user to display names ranking

int main()
{
	ifstream input;
	string userName(" "), boyRank(" "), girlRank(" ");

	introduce();
	openFile(input);
	getInput(userName);
	search(input, boyRank, girlRank, userName);
	closeFile(input);
	output(userName, boyRank, girlRank);

return 0;
}
//_____________________________________________
//______________FUNCTIONS______________________

/*-------------- Output function ---------------------
Input: string name, boy rank, and girl rank variables
Output: cout's to user 
Algorithm: Input variables
           test if boy rank is > 0
		     if so output name and rank like in the example above
		   if boy rank is not > 0 
		     output name not ranked like in example above
		   test the girl rank and do the same steps you did with boy rank
----------------------------------------------------*/
void output(string name, string boyRank, string girlRank)
{
	cout << "\n\n";

	if(" " == boyRank)
	{
    cout << name << " is not ranked in popularity among boys. \n";
	}
	else
	{
		cout << name << " is ranked " << boyRank << " in popularity among boys. \n";
	}
	if(" " == girlRank)
	{
		cout << name << " is not ranked in popularity among girls. \n";
	}
	else
	{
		cout << name << " is ranked " << girlRank << " in popularity among girls. \n";
	}
}

/*------------- Close File Function ------------------
   Input: ifstream
   Outut: closes file
   Algorithm: close file
----------------------------------------------------*/
void closeFile(ifstream& input)
{
	input.close();
}
/*-------------- Get Input function ------------------
input: string name. 
output: name value to be changed to user input.
algorithm: cout to user for name
           store user input in name variable
----------------------------------------------------*/
void getInput(string& name)
{
    cout << "What name would you like to check? \n"
		 << "Please remember to capitalize the first letter and \n"
		 << "don't use spaces if you need a space use a underscore _ .\n";
	 cin >> name;
}
/*-------------- Search function ---------------------
   Input: string name, boy rank, and girl rank variable, ifstream
   Output: variable values changed
   Algorithm: write variables for temp boys name, temp girls name, temp char, temp rank, and a counter
              read characters into a string until first whitespace
                test if it is a int
                  save to rank variable
              read next set of character into boys name variable until next whitespace
              read next set of characters into girls name variable until end of line or whitespace
			  send rank boy name and girl name to be compared
			  reset boy and girl name variables
			  repeat reading to the end of file
//-----------------------------------------------------*/
void search(ifstream& input, string& bRank, string& gRank, string name)
{
	while(! input.eof())  // catches eof if it happens in main loop
	{
		int counter(0);              // set variables in a place were they can be reset after every compare
	    string tempBname(""), tempRank(""), tempGname("");
	    char tempChar(' ');
	do
	{
	if(input.eof())      // this catches the eof if it happens in the inner loop and breaks the loop
	{
		break;
	}
	
	input.get(tempChar);
	if(isdigit(tempChar))                     //test char read if digit
	{
		tempRank += tempChar;                //if digit adds char to rank string
	}
	if(isalpha(tempChar) && 1 == counter)    //test if letter and counter is at 1
	{
		tempBname += tempChar;               //adds char to boys name string
	}
	if(isalpha(tempChar) && 2 == counter)    //test if letter and counter is at 2
	{
		tempGname += tempChar;               //adds char to girls name string
	}
	if(' ' == tempChar)                      //test if whitespace
	{
		counter++;                           //if whitespace is found increase counter by 1
	}
	}
	while(tempChar != '\n');                 //test and build strings until end of line is reached

	compare(name, tempBname, tempGname, tempRank, bRank, gRank);

	} 
}
/*-------------- Compare function ---------------
Input: string user name, boyname, girl name,rank, boy rank, girl rank variables
Output: boy rank and girl rank variables changed if name matches
Algorithm: input variables
           compare user name to boy name
		     if matches store rank in boy rank
		   compare user name to girl name
		     if matches store rank in girl rank
-----------------------------------------------*/
void compare(string userName, string boyname, string girlname, string rank, string& bRank, string& gRank)
{
	if(userName == boyname)
	{
		bRank = rank;
	}
	if(userName == girlname)
	{
       gRank = rank;
	}
}

//--------------- Open file function ------------------
// Input: ifstream
// Output: ifstream attached to opened file
// Algorithm: try to open file babynames2012.txt
//            if file doesn't exist inform user
//-----------------------------------------------------
void openFile(ifstream& input)
{

	input.open("babynames2012.txt");
	 if(input.fail())
	 {
		 cout << "File: babynames2012.txt \n"
			 << "Not Found \n\n"
			 << "Please make sure babynames2012.txt is in the right folder. \n\n"
			 << "If you are working with Visual Studio please put the file in \n"
			 << "the same folder as the cpp file.  Thank you. \n\n";
		 exit(0);     //exits program. not nice but this program was designed to work with babynames2012.txt
	 }

}

//----------------Introduction Function----------------
// no input/ output: description of program to the user
// algorithm: cout a discription of what the program is going to do.
//-----------------------------------------------------
void introduce()
{
	cout << "*****************************************\n"
		 << "       2012 Baby Name Rankings       \n"
		 << "*****************************************\n\n"
		<< "Would you like to know how popular a \n"
		<< "name was in 2012? \n\n";
		
}