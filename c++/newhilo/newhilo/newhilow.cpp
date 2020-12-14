/*
filename: Newhilo
Author: David Dicken
Algorithm: rewrite exam 1 with vectors and functions also save to a file
  functions:
            Introduce
			Openfile - create or open file to keeptrack of win/ loss
			InitializeGame - select guesser and number
			NumberGuess - Guess number
			CloseFile - save win loss to file
			EndGame
*/

#include<iostream>
#include<ctime>
#include<fstream>
#include<string>

using namespace std;

//Function Declarations
void intro(int minNum, int maxNum, int numTries);
void openFile(ifstream& stats, ofstream& endstats, string& name, int& win, int& loss);
void closeFiles(ifstream& input, ofstream& output);
void getStats(ifstream& stats, int& win, int& loss);

int main()
{
	const int minNum(0), maxNum(99), numTries(5);
	ifstream stats;
	ofstream endstats;
	int win(0), loss(0);
	string name("");

intro(minNum, maxNum, numTries);
openFile(stats, endstats, name, win, loss);
closeFiles(stats, endstats);

	return 0;
}
/*-------- FUNCTIONS ------------*/
/*-------- Human Guessing -------

---------------------------------*/
void userGuess()
{
cout << "I am thinking of a number.............\n"
<< "Got it!\n";
num = (rand() % 100) + 1;
do                                                                   //guessing number
{
cout << "What is your guess?\n"
	; cin >> guess;
if (guess == num)
{
cout << "Good job! You Win!!! \n"
<< "My number was " << num << endl;
break;
}
else if (guess > num)
{
cout << "Your guess is too high.\n";
}
else if (guess < num)
{
cout << "Your guess is too low.\n";
}
else if (0 == counter && guess != num)
{
cout << "Sorry that was your last guess. You lost \n"
<< "My number was " << num << endl;
}
counter--;
} while (counter > 0); //human guessing
if (0 == counter && guess != num)
{
cout << "Sorry that was your last guess. You lost \n"
<< "My number was " << num << endl;
}
else
{
cout << "\nWould you like to play again? \n"
<< "y for yes or any other key for no \n";
cin >> exit;
}
}
/*-------- Initialize Game-------
algorithm: ask user who will be doing the guessing
           write a case statement to process user input
		   place functions in case statements
         
---------------------------------*/
void whoplays()
{
	char choice(' ');

	cout << "Who's doing the guessing? \n"
		 << "(C)omputer \n (H)uman \n (Q)uit \n";
	cin >> choice;
	choice = toupper(choice);

	switch (choice)
	{
	case 'C':
		{

		break;
		}
	case 'H':
		{

			break;
		}
	case 'Q':
		{

			break;
		}
	default:
		{

			break;
		}
	}
}
void getStats(ifstream& stats, int& win, int& loss)
{
	stats >> win;
	stats >> loss;
}
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
/*-------- OpenFile -------------
algorithm: Ask user for name
             create or open a file with users name
		     test if file is empty
		     if not tell user that it looks like we have played before. Is this you?
           
---------------------------------*/
void openFile(ifstream& stats, ofstream& endstats, string& name, int& win, int& loss)
{
    char correctName('y');

	do
	{
		correctName = 'y';
		closeFiles(stats, endstats);
		win = 0;
		loss = 0;

	cout << "What is your name?\n";
	cin >> name;

	stats.open(name);
	 if(stats.fail())
	 {
		 stats.clear();
		 endstats.open(name);
		 
		 if(endstats.fail())
		 {
			 correctName = 'n';

			 cout << "Please enter a name that I can save as a file. \n"
				  << "I would like to keep track of our wins and losses. \n\n"
				  << "Use your first name and last initial no spaces or symbols. \n\n";
		 }
		 else
		 {
			 cout << "Looks like this is our first time playing. \n"
				  << "Good Luck.\n";
		 }
	 }
	 else
	 {
		 getStats(stats, win, loss);

		 cout << "Looks like we've played before. \n"
			  << "Is this you? \n\n"
			  << name << ": Wins " << win << " Losses " << loss << "\n"
			  << "Press y for yes. Any other key for no. \n";
		 cin >> correctName;
		 correctName = tolower(correctName);
		 
	 }
	}
	while(correctName != 'y');
}

/*-------- Intro ----------------
input: int minNum, maxNum, numTries
---------------------------------*/
void intro(int minNum, int maxNum, int numTries)
{
  cout << "      Hi Lo Game       \n\n"
	   << "Welcome to the Hi Lo Game. \n"
	   << "The rules are simple: \n"
	   << "Either you or me will think of a number between: \n"
	   << minNum << " & " << maxNum << endl
	   << "\nThe other player will then have " << numTries << " to guess that number.\n";
}