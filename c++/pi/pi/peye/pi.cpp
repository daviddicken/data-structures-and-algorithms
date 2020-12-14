/* 
 Filename: Pi               (Chapter 3 Programming Project 8)
 Author:   David Dicken
 Description:  A program to calculate the approximate value of pi using
               pi = 4 [1-1/3+1/5-1/7+1/9.... + ((-1)/(2n+1)]
			   The user inputs the number of iterations the program is to do.  This program needs to allow the user to retry different iterations 
			   until they wish to exit.

 Date last modified: 1/23/16
 */
 /*Algorithm:  Ask user for number of iterations they want to run to generate PI value
               Initialize a variable (answer) to one to start the algebraric equation.
			   Initialize a variable (sign) to one
			   Loop the "number of iteration" times
			   Flip the sign of the value sign + or - by multiplying by -1
			   Add the value "sign/(2n+1)" to answer
			   After running the "number of iterartion" times, multiply answer by 4
			   Output the result
			   Bulletproof
 */

#include <iostream>
using namespace std;

int main()
{    
	char exit('y');

	do
	{
	double answer(1.0), sign(1.0), iteration(0.0), flipper(-1.0), counter(1.0);

	cout << "How many iterations would you like? \n"; cin >> iteration;


	while(!cin)                  // !cin test if cin is in fail state due to user entering a char
	{
     cin.clear();                                                       //clears cin fail state
	 cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');     //removes invalid input
	 
	 cout << "Invalid amount.  Please use integer. \n"
		 << "How many iterations would you like? \n"; cin >> iteration;
	}


	while ( iteration > 0)
	{	
		sign = sign * flipper;
		answer += sign/ (2 * counter + 1);
		//cout << sign << "* 1/" << (2 * counter + 1) << endl;      // I left this line here so I can look back and remember the steps 
		counter++;                                                  // took to problem solve it
	    iteration--;
	}
	    answer = 4.0 * answer ;

	cout << "Pi is : " << answer << endl;

	cout << "\nWould you like to enter a different amount? \n";
	cout << "Enter y for yes or any other key for no. \n"; cin >> exit;
	cout << "\n";
	exit = tolower(exit);
	
	}
	while (exit == 'y');

	return 0;
}
