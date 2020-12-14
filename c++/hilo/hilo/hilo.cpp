/*
Filename: HighLow (Exam1)
Author: David Dicken
Description: A game to be played against the cpu were either the user or the cpu thinks of a number between 1-100.
Depending on who thinks the number the other player trys to guess what the number is. Everytime a player guess
the othher player lets them know if the number they guessed is "too high", "too low", or "correct". The player guessing has
5 guesses and if they can't guess by then they lose. This game needs to let the user play as many times as they like.
Date last modified: 01/25/16
*/
//#include "stdafx.h"
#include <iostream>
#include <ctime>
using namespace std;
int main()
{
char play('y'), exit('y'), correct('c');
cout << "\n \n"
<< " HiLo \n"
<< "\nWelcome to David's HiLo game.\n"
<< "The rules are simple.\n"
<< "Either you or me will think of a number between 1-100.\n"
<< "The other player will then try to guess the number in 5 guesses \n"
<< "After each guess the guesser will find out if the guess was \n"
<< "Too Low, too high, or correct.\n\n"
<< "Would you like to play? \n"
<< "y for yes or any other key for no \n"; cin >> exit;
exit = tolower(exit);
while ('y' == exit)
{
srand(static_cast<int>(time(0)));
char player('c');
int num(5), guess(0), counter(5), high(100), low(1), cpuGuess(50);
cout << "Who is doing the guessing? \n"
<< "C = me(the computer)\n"
<< "U = you(the human)\n"; cin >> player;
player = tolower(player);
if ('u' == player) //human guessing
{
cout << "I am thinking of a number.............\n"
<< "Got it!\n";
num = (rand() % 100) + 1;
do
{
cout << "What is your guess?\n"; cin >> guess;
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
else if ('c' == player) //cpu guessing
{
cout << "I am going to close my eyes now. \n"
<< "Please enter your number you would like me to guess. \n"; cin >> num;
do
{
cpuGuess = (rand() % (high + 1 - low)) + low;
cout << "Is your number " << cpuGuess << endl;
cout << "H = too high \n"
<< "L = too low \n"
<< "C = correct \n";
cin >> correct;
correct = tolower(correct);
if ('c' == correct)
{
cout << "Wow, I got it. \n"
<< "That was fun \n ";
break;
}
else if ('h' == correct)
{
high = cpuGuess - 1;
}
else if ('l' == correct)
{
low = cpuGuess + 1;
}
counter--;
} while (counter > 0);
if (0 == counter && guess != num)
{
cout << "That was my last guess. I lost. \n"
<< "Your number was " << num << endl;
cout << "\nWould you like to play again? \n"
<< "y for yes or any other key for no \n";
cin >> exit;
}
else
{
cout << "Would you like to play again? \n"
<< "y for yes or any other key for no \n";
cin >> exit;
}
}
}
return 0;
}
/*
Algorithm: Introduce the game and explain the rules.*
Ask user if they would like to select the number or do the guessing*
If user is doing the guessing create a random number*
write a loopthat runs 5 times
and compares the users guesses and lets the user know if the guess is too high, too low, or correct
If they havn't guess in five guesses let them know they lost and ask to play again
If the program is doing the guessing ask the user for a number
(rand() % (high + 1 - low)) + low
high starts out at 100
low starts out at 1
if user says guess is to high change high variable to guess
if user says guess is to low cahnge low variable to low
congradulate the user if they win
ask to play again
bulletproof
　
　
*/