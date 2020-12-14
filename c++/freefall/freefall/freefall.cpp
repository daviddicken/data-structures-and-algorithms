// Filename: Freefall   (Chapter 1 Programming Project 4)
// Author:  David Dicken
// Description:  A program that tells how many feet a pumpkin would fall in the amount of seconds the user supplies
//               if it fell at a constant acceleration rate of 32 feet per second.
// Last modified: 1/8/2016

#include <iostream>
using namespace std;

int main()
{
	const double ACCEL(32.0);

	double distance(0.0), time(0.0), fall(0.0), maxfall(1025.0);

	cout << "Please enter how many seconds you would like your pumpkin to fall for? \n";
	        cout << "     ,     \n";
			cout << "  ((^:^))  \n";
			cout << "    ~~~    \n";
			cout << "           \n";
    cin >> time;

		distance = (ACCEL * (time * time)) / 2;
		fall = distance;

		    cout << "     ,     \n";
			cout << "  ((^:^))  \n";
			cout << "    ~~~    \n";
			cout << "          \n";

			if (fall < 1025)                    //To keep the wait time for a splat reasonable
			{ 
				while (fall > 0)
		            {
			        cout << "    ||     \n";
			        fall = fall - 1;
		            }
			}

			else
			{
				while (maxfall > 0)            //Makes the max fall lines till splat to 1025
					{
					cout << "    ||     \n";
			        maxfall = maxfall - 1;
				    }
			}

		 cout << "  ` '' '   \n";
		 cout << " ~ SPLAT! ~ \n";
		 cout << " ~~~~~~~~~~  \n";
		 cout << " \n";
		 cout << "Your pumpkin just fell " << distance << " feet! \n";
		 cout << " \n";
		 cout << "Now go clean up your mess. \n";
		 cout << " \n";
		 cout << ".";

		 return 0;
}




/* 

Algorithm:
We need a program that tells how many feet a pumpkin would fall in the amount of seconds the user supplies
if it fell at a constant acceleration rate of 32 feet per second.

1) Get how many seconds the pumpkin should fall for from user.
2) Multiply (32 * (seconds * seconds)) / 2 to get the distance of fall
3) Set reasonable amount of lines for fall graphic.
4) Test distance of fall against reasonable amount of line that was set.
5) Display the distance that the pumpkin fell.

*/