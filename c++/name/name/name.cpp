/*
Filename: name         (chapter 8 program 4)
Author: David Dicken
Description: This is a program that get a first name, middle name, and last name from the user
             in that order.  It then will output the last name, first name and midde initial.
			 If the user enters no middle name then it should be just last name, first name.
			 Always place a period after the middle initial.
Date last modified: 3/3/16

Algorithm: Introduce program
           get names from user
		   split fullname into sub string first, last, middle
		   test if there is a middle name
		     if there is a middle name delete all char except 1st and add a .
		   output last name, first name, middle initial
*/

#include<iostream>
#include<string>
using namespace std;

void getNames(string& fullname);                                                //input: string fullname Output: fullname with input userer entered attached
void splitNames(string fullname, string& first, string& middle, string& last); //input: string fullname, firsy, middle, last Output: fullname sustrings in other variables
string separate(string fullname, int& pos, int& lastpos);                      //input: string fullname, int pos, lastpos Output: string substring of fullname
void testMid(string& middle, string last);                                     //input: string middle, last Output: middle string in correct format 
void output(string first, string middle, string last);                         //input: string first, middle, last Output: couts to user in correct order

int main()
{
	string fullname(""), first(""), middle(""), last("");

	getNames(fullname);                             //get users name
	splitNames(fullname, first, middle, last);      // seperate user name into substrings
	testMid(middle, last);                          // test for middle name and adjust middle string accordingly
	output( first, middle, last);                   // output name in different format to screen

	return 0;
}
/*========= Functions ===========*/


/*========= Output ==============
input: string first, middle and last variables
output: couts to user in correct order
algorithm: couts in correct order
=================================*/
void output(string first, string middle, string last)
{
	cout << "\n\n"
		<< "Your name: \n\n"
		<< last << ", " << first << " " << middle << endl << endl;
}
/*========= Test middle =========
input: string middle & last variables
output:middle variable with corrcet string
algorithm: test if middle == last
           if so middle = ""
		   else
		   middle = middle(0)
		   middle += "."
=================================*/
void testMid(string& middle, string last)
{
	if(middle == last)
	{
		middle = "";
	}
	else
	{
		middle = middle[0];
		middle += ".";
	}
}
/*========= Split names =========
input: string fullname, first, middle, last variables
output: fullname split into 2 or 3 string variables (first, middle, last)
algorithm: declare pos and last pos variables
           send each string variable to the "separate" function
=================================*/
void splitNames(string fullname, string& first, string& middle, string& last)
{
	int pos(0), lastpos(0);

		first = separate(fullname, pos, lastpos);
		middle = separate(fullname, pos, lastpos);
		last = separate(fullname, pos, lastpos);
			
}
/*======== Seperate ==============
input:string fullname, int pos & lastpos
output: substring
algorithm: declare "section" string variable
           find whitespace
		   if found set local string variable to substring
		   lastpos = pos +1
		   else set local string variable to substring
		   return "section"
==================================*/
string separate(string fullname, int& pos, int& lastpos)
{
	string section("");

	pos = fullname.find(" ", lastpos);
	if (pos >= 0)
	{
		section = fullname.substr(lastpos, pos - lastpos);
		lastpos = pos + 1;
	}
	else
	{
		section = fullname.substr(lastpos, pos - lastpos);
	}
	return(section);
}
/*
========== Get names ============
input: string fullname
output: string fullname with user input attached
Algorithm: ask user for name
           save to fullname variable
		     use getline
==================================*/
void getNames(string& fullname)
{
	cout << "Please enter your name (first middle last): \n";

	getline(cin, fullname);

}
