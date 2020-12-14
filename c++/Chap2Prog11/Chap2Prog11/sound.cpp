/* 
 Filename: Sound               (Chapter 2 Programming Project 11)
 Author:   David Dicken
 Description:  A program that allows the user to enter a starting temperature and ending temperature.  Then within the 
               temperature range the program needs to calculate and display velocity of sound (meters/sec) by 1 degree 
			   increments.

 Date last modified: 1/13/16

 Algorithm:  Get starting and ending temperatures (in celsius) from user
             Display the velocity of sound for each degree in the selected temperature range
			 velocity = 331.3 + 0.61 x temperature
            
 */

#include <iostream>
using namespace std;

int main()
{
	double start(0.0), end(0.0), velocity(0.0), temp(0.0);

	
    cout << "Please enter a starting temperature and ending temperature (celsius). \n";
	cout << "Starting Temp: "; cin >> start; 
	cout << "Ending Temp: "; cin >> end;
    
	temp = start;

	while (temp <= end)
	{
		velocity = 331.3 + 0.61 * temp;

		cout.setf(ios::fixed);
	    cout.setf(ios::showpoint);
	    cout.precision(1);

		cout << "At " << temp << " degrees Celsius the velocity of sound is " << velocity << " m/s. \n";

		temp++;
	}

	return 0;
}