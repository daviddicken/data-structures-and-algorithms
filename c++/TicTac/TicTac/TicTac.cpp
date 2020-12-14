/*
Filename: TicTac              (Chap 7 Program 10)
Author: David Dicken
Description: This is a program to allow two users to play tic tac toe.
Date Last Modified: 2/26/16

Algorithm: Introduce program
		   Set up gameboard (create multideminsion array)*
		      Output gameboard*
		   get spot player one would like to place X from user
		      match to proper array
			  test if value held in chosen array is a digit
			    if it is let user know that spot has been taken try again
				if it is a digit replace with X
           switch player and follow same steps for player two except replace with O
		   write in a way to concede the game if player lost
		   write a for statement to switch players for the amount of spaces on the board 
           
*/
#include<iostream>

using namespace std;
const int ROWS(3), COLUMNS(3);  // the size of the grid the game will be played on


void intro();//no input, Output: Game description
void displayGame(char gameboard[][COLUMNS], int ROWS);//input: char 2d array, int arraysize(rows) Output: couts the array elements in tic tac toe format
void turn(char gameboard[][COLUMNS], int rows, int& player);//input: char 2d array, int arraysize(rows), int plyrturn. Output: the 2d array game markers in proper spots & player turn int increased
void gameover();//no input, Output: Game over message
void failState(int& valid);

int main()
{
	char gameboard[ROWS][COLUMNS] = {'1','2','3','4','5','6','7','8','9'};  //gameboard array
	int plyrTurn(1);                // keeps track of what turn it is

	intro();		                  //introduces the program
	displayGame(gameboard, ROWS);     //display's game board
	while(plyrTurn <= (ROWS *COLUMNS)) // loops game till all spots have had a chance to be filled
	{
	turn(gameboard, ROWS, plyrTurn);  //gets move from player and adjust the board accordingly
	displayGame(gameboard, ROWS);     //display's game board
	}
	gameover();                       //display's gameover message to user
	return 0;
}
//----------- Functions ---------
//-------------------------------

/*---------- Cin Fail -----------
input: cin state
output: if cin was in a fail state. fail state and cin cleared
algorithm:cut and paste
---------------------------------*/
void failState(int& valid)
{
if (!cin)          // !cin test if cin is in fail state due to user entering a char
	{
     cin.clear();                                                       //clears cin fail state
	 cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');     //removes invalid input
	}
}

/*---------- Game Over ----------
No input
Output: GameOver message
Algorithm: use cout to say Game Over
---------------------------------*/
void gameover()
{
	cout << "          GAME OVER            \n\n"
		 << "Thanks for playing. \n";
}

/*---------- Player Turn --------
input: gameboard array, player variable
output: gameboard array with element changed to X or O and player variable changed to next player
algorithm: read in array and player variable
           if variable is odd player is X if even player is O
		   ask user what number they would like to place there marker at
		   test to make sure number is within range
		   if so change change matching element with correct O or X
		     (subtract 1 from number user gives then put that number in gameboard[0][#])
		   check if isdigit first 
		     if not inform user spot is taken
---------------------------------*/
void turn(char gameboard[][COLUMNS], int rows, int& player)
{
	int spot(0), valid(0);        //variable to hold spot player picks and a variable to be changed if user picks a invalid number

	if(player % 2 == 0)           //test to see what players turn it is
	{
		do                                                           //player 2's turn
		{
		cout << "Player 2 were would you like to place your O ? \n";
		cin >> spot;
		failState(valid);                                            //catches if user enters a char

		if(spot > 0 && spot <= (ROWS * COLUMNS))                     //test to see if user input is within range
		{
			if(isdigit(gameboard[0][spot-1]))                        //test to see if spot has already been selected (changed from a number to a X or O)
			{
              gameboard[0][spot -1] = 'O';                          //place players marker in spot selected
			  valid = 0;                                            //reset valid to 0 so loop can exit
			  player++;                                            // increase turn by 1
			}
			else
			{
				cout << "Sorry that spot is already taken. \n"    //message if spot was already picked
					 << "Please pick a different spot. \n";
				valid = 1;             //change valid to one to cause loop to run again
			}
		}
		else
		{
			cout << "Invalid number. Please select a integer between 1 - " << ROWS * COLUMNS << ". \n";  //message if user picks a number out of range
			valid = 1;                //change valid to one to cause loop to run again
		}
		}
		while(valid == 1);
	}
	else
	{
        do                         //Player 1's loop       same as above
		{
		cout << "Player 1 were would you like to place your X ? \n";
		cin >> spot;
		failState(valid);

		if(spot > 0 && spot <= (ROWS * COLUMNS))
		{
			if(isdigit(gameboard[0][spot-1]))
			{
              gameboard[0][spot -1] = 'X';
			  valid = 0;
			  player++;
			}
			else
			{
				cout << "Sorry that spot is already taken. \n"
					 << "Please pick a different spot. \n";
				valid = 1;
			}
		}
		else
		{
			cout << "Invalid number. Please select a integer between 1 - " << ROWS * COLUMNS << ". \n";
			valid = 1;
		}
		}
		while(valid == 1);
	}
}

/*---------- Display Board ------
Input: Gameboard array
Output: cout array elements
Algorithm: use couts to display the array elements with spaces in between
---------------------------------*/
void displayGame(char gameboard[][COLUMNS], int ROWS)
{
	//Displays element values to screen in tic tac toe format
	for(int index1 = 0; index1 < ROWS; index1++)        
	{
		cout << endl;
		for(int index2 = 0; index2 < COLUMNS; index2++)
		{
         cout << gameboard[index1][index2] << " ";
		}
	}
	cout << endl << endl;
}

/*---------- Intro func ---------
No input
Output: couts to user explaining the game
Algorithm: Write couts to explain the game
---------------------------------*/
void intro()
{
	cout << "=======================\n"
		 << "     Tic Tac Toe       \n"
		 << "=======================\n\n\n"
		 << "This is a 2 player Tic Tac Toe game.\n"
		 << "Player 1 will be X's and player 2 will be O's. \n"
		 << "You will each take turns placing an X or a O in a spot on the board.\n"
		 << "The winner is the first player to get three X's or O's in a row. \n\n";
}