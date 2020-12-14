#include<iostream>
#include<string>

using namespace std;
const int ROWS(3), COLUMNS(3), LAYERS(3);  // the size of the grid the game will be played on


void intro();//no input, Output: Game description
void populate(string gameboard[][ROWS][COLUMNS],int layers, int rows, int columns);
void displayGame(string gameboard[][ROWS][COLUMNS], int layers);//input: char 2d array, int arraysize(rows) Output: couts the array elements in tic tac toe format
void turn(string gameboard[][ROWS][COLUMNS], int layers, int& player);//input: char 2d array, int arraysize(rows), int plyrturn. Output: the 2d array game markers in proper spots & player turn int increased
void gameover();//no input, Output: Game over message
void failState(int& valid);
char getChar(string gameboard[][ROWS][COLUMNS], int layers, int spot);

int main()
{
	string gameboard[LAYERS][ROWS][COLUMNS];  //gameboard array
	int plyrTurn(1);                // keeps track of what turn it is

	intro();		                  //introduces the program
	populate(gameboard, LAYERS, ROWS, COLUMNS);
	displayGame(gameboard, LAYERS);     //display's game board
	while(plyrTurn <= (ROWS *COLUMNS) * LAYERS) // loops game till all spots have had a chance to be filled
	{
	turn(gameboard, LAYERS, plyrTurn);  //gets move from player and adjust the board accordingly
	displayGame(gameboard, LAYERS);     //display's game board
	}
	gameover();                       //display's gameover message to user
	return 0;
}
//----------- Functions ---------
//-------------------------------


/*-------- Get char -------------
---------------------------------*/
char getChar(string gameboard[][ROWS][COLUMNS], int layers, int spot)
{
	string mystring("");
	char mychar(' ');

	mystring = gameboard[0][0][spot-1];

	mychar = mystring[0];

	return(mychar);
}

/*-------- Populate Gameboard ---
---------------------------------*/
void populate(string gameboard[][ROWS][COLUMNS],int layers, int rows, int columns) 
{
	int counter(1);
	string square("");

	for(int index1 = 0; index1 < layers; index1++)
	{
		for(int index2 = 0; index2 < rows; index2++)
		{
			for(int index3 = 0; index3 < columns; index3++)
			{
          square = to_string(counter);

			  gameboard[index1][index2][index3] = square;
			  
			  counter++;
			}
		}
	}
}

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
void turn(string gameboard[][ROWS][COLUMNS], int layers, int& player)
{
	int spot(0), valid(0), isAvailable(0);        //variable to hold spot player picks and a variable to be changed if user picks a invalid number
	string firstChar(" ");
	char tester(' ');

	if(player % 2 == 0)           //test to see what players turn it is
	{
		do                                                           //player 2's turn
		{
		cout << "Player 2 were would you like to place your O ? \n";
		cin >> spot;
		failState(valid);                                            //catches if user enters a char

		if(spot > 0 && spot <= (ROWS * COLUMNS)* layers)                     //test to see if user input is within range
		{
			tester = getChar(gameboard, layers, spot);

			if(isdigit(tester))                        //test to see if spot has already been selected (changed from a number to a X or O)
			{
              gameboard[0][0][spot -1] = "O";                          //place players marker in spot selected
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
			cout << "Invalid number. Please select a integer between 1 - " << ROWS * COLUMNS * layers << ". \n";  //message if user picks a number out of range
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

		if(spot > 0 && spot <= (ROWS * COLUMNS)* layers)
		{
			tester = getChar(gameboard, layers, spot);

			if(isdigit(tester))          
			{
              gameboard[0][0][spot -1] = "X";
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
			cout << "Invalid number. Please select a integer between 1 - " << ROWS * COLUMNS * layers << ". \n";
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
void displayGame(string gameboard[][ROWS][COLUMNS], int layers)
{
	int counter(1)
		;
	//Displays element values to screen in tic tac toe format
	for (int index1 = 0; index1 < layers; index1++)
	{
		cout << endl << endl << "Layer " << counter << endl;
		counter++;

	for(int index2 = 0; index2 < ROWS; index2++)        
	{
		cout << endl;
		for(int index3 = 0; index3 < COLUMNS; index3++)
		{
         cout << gameboard[index1][index2][index3] << " ";
		}
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
		 << "   Tic Tac Toe Cubed      \n"
		 << "=======================\n\n\n"
		 << "This is a 2 player Tic Tac Toe game played on " << LAYERS << " layers of gameboards.\n"
		 << "Player 1 will be X's and player 2 will be O's. \n"
		 << "You will each take turns placing an X or a O in a spot on one of the boards.\n"
		 << "Each time a player gets three X's or 3 O's in a row they will get a point. \n"
		 << "If you picture the layers stacked on top of each other \n"
		 << "you can get three in a row - up and down, diagonally, and side to side. \n"
		 << "Good luck!!\n\n\n"
		 << "Press enter to play. \n";

	cin.ignore();
}