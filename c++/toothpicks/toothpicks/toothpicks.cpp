/* 
 Filename: Toothpicks         (Chapter 3 Programming Project 12)
 Author:   David Dicken
 Description:  A two player game that starts with 23 toothpicks.  Each player take turns taking 1,2, or 3 toothpicks from the pile until
               there is no toothpicks left.  The loser is the player who takes the last toothpick.  This program is for a human to play against a cpu.
               If there is more then 4 toothpicks left then the computer should take 4 - whatever amount the human took the turn before.
			   If there is 2-4 toothpicks left then the computer should take just enough toothpicks to win the game.
			   If there is 1 left the computer takes it and losses.
			   Make sure to bulletproof the game and keep the user from entering invalid info.

 Date last modified: 1/23/16

 Algorithm:  Output a description and rules of the game.*
             Flip coin to see who goes first*
			 If cpu is first generate random number between 1-3 for the amount the cpu will take on first turn*
			 create a loop for the rest of the turns:
			    Get amount of toothpicks player would like to take*
				Test that it is a valid number between 1-3 and not greater then the amount left*
				Put that number into a variable "plyrsticks"*
				Subtract amount from toothpick pile*
				Test amount of toothpicks left to see if it is greater then 4*
				   If no then subtract 1 from amount of toothpicks left to come up with the number of toothpics the cpu will take this turn*
				   If yes then subtract the variable "plyrsticks" from 4 to determine the amount of toothpicks the cpu will take this turn*
			    Output if the player won or lost and congradulate them*
				Ask if they want to play a new game*
 */

#include <iostream>
#include <ctime>
using namespace std;

int main()
{    
	cout << "\n \n"
		<< "                  23 Toothpicks                   "
		<< "\n \n"
		<< " Description: The game of \"23 Toothpicks\" is a 2 player game that \n"
		<< " starts out with a pile of 23 toothpick.  Every turn each player takes \n"
		<< " 1, 2, or 3 toothpicks from the pile until the pile is gone. \n"
		<< " The loser is the person who takes the last toothpick from the pile \n"
		<< " \n"
		<< " Rules: \n"
		<< " You must take 1, 2, or 3 toothpicks every turn. \n"
		<< " Simple enough right? \n"
		<< "\n \n";

   char play('y'), HorT('t'), exit('y');

	cout << "Would you like to play? (y/n) \n"; cin >> play;
	play = tolower(play);
	 
	if (play == 'y')
	{
		do
		{
		int totalSticks(23), plyrSticks(0), cpuSticks(0);               //variables declared here so they reset w/ every new game

		srand(static_cast<int>(time(0)));                              // coin toss
		cout << "\nLet's flip a coin to see who goes first. \n"
			<< " \n"
			<< "Heads or Tails? (h or t): \n"; cin >> HorT;

		HorT = tolower(HorT);

		if (HorT == 'h')
		{
			HorT = 1;
		}
		else if(HorT == 't')                
		{
			HorT = 2;
		}

		int coin = (rand() % 2) + 1;

		if (coin == 1)
		{
         cout << "\nIt is Heads \n";
		}
		else if(coin == 2)                
		{
			cout << "\nIt is Tails \n";
		}


		if (coin == HorT)
		{
			cout << "You first!";
		}
		else
		{
			cout << "\nMe first.  Good luck!\n";          

			cpuSticks = (rand() % 3) + 1;                     //random # generated if cpu goes first

			cout << "\nI will take " << cpuSticks << endl;

			totalSticks -= cpuSticks;
		}
		while(totalSticks > 0)                                                   //The game loop
		{
			cout << "There are " << totalSticks << " left. \n"
				<< "How many would you like to take? \n"; cin >> plyrSticks;

			if (!cin)          // !cin test if cin is in fail state due to user entering a char
	         {
              cin.clear();                                                       //clears cin fail state
	          cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');     //removes invalid input
	         }

			if ((plyrSticks > 0) && (plyrSticks < 4))
			{
				if(plyrSticks <= totalSticks)
				{
				totalSticks -= plyrSticks;
				 
				if(totalSticks == 0)
				{
					cout << "You lost. Better Luck next time. \n";
					break;
				}
				else if(totalSticks == 1)
				{
					cout << "Great job. You win!!! \n";
					break;
				}
				else if(totalSticks <= 4)
				{
					cpuSticks = totalSticks - 1;
					totalSticks -= cpuSticks;

					cout << "I will take " << cpuSticks << endl;
					cout << "\nYour turn."
						 << "There is " << totalSticks << " left. \n"
                         << "And guess what?  It's yours!! \n";
					totalSticks -= 1;

				}
				else if(totalSticks > 4)
				{
					cpuSticks = (4 - plyrSticks);
					totalSticks -= cpuSticks;

					cout << "I will take " << cpuSticks << endl;
					cout << "\nYour turn.";
				}
				}
				else
				{
					cout << "There aren't enough toothpicks left for that amount.\n"
						<< "Please pick a amount equal to or less then " << totalSticks << endl;
				}
			}
			else
					cout << "Invalid number.  Please pick either 1, 2, or 3 \n";
		}
		cout << "\nWould you like to play again? \n"
	         << "Enter y for yes or any other key to quit. \n"; cin >> exit;
	    cout << "\n";
		}
	while ((exit == 'y') || (exit == 'Y'));
		}


	return 0;
}

