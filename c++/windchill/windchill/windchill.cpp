/* 
 Filename: windchill               (Chapter 5 Programming Project 5)
 Author:   David Dicken
 Description:  This is a function that returns the windchill index

 Date last modified: 2/4/16

 Algorithm: get temperature in Celsius from user
            get wind speed in m/sec from user
			write formula in a function:
			windchill = 13.12 + 0.6215 * temp - 11.37 * (windspeed ^ 0.16) + 0.3965 * temp * (windspeed ^ 0.016)
			write driver to test function
 */

//#include"stdafx.h"
#include<iostream>
#include<cmath>
using namespace std;
double windchill(double temp, double speed); // Input: temp (celsius double <= 10); windspeed (double)
                                             // Output: windchill (double)

//*********************Driver
int main()
{
	double windspeed(0.0), temp(0.0), chill(0.0);

	cout << "Windspeed in m/sec  "; cin >> windspeed;
	cout << "Temperature in Celsius "; cin >> temp;

	chill = windchill(temp, windspeed);

	cout << "Windspeed : " << windspeed << endl
		<< "Temp       : " << temp << endl
		<< "Windchill  : " << chill << endl;

	return 0;

}
//**********Windchill Function ***********************
// Input: Temperature(double) and windspeed(double)
// Output: Windchill(double)
// Algorithm: input tempurature and windspeed
//            test if temp is <= 10
//               if yes run formula 
//               windchill = 13.12 + 0.6215 * temp - 11.37 * pow(speed, 0.16) + 0.3965 * temp * pow(speed, 0.016)
//               find variables for hard coded numbers in formula
//            else
//               output a message to let user know invalid temp
//            return windchill
//********************************************************
double windchill(double temp, double speed)
{
#include<cmath>
	using namespace std;
	const double NUM1(13.12), NUM2(0.6215), NUM3(11.37), NUM4(0.16), NUM5(0.3965), NUM6(0.016);
	double chill(0.0);

	if(temp <= 10)
	{
	chill = NUM1 + NUM2 * temp - NUM3 * pow(speed, NUM4) + NUM5 * temp * pow(speed, NUM6);
	}
	else
		cout << "Windchill Temperature is only defined for temperatures at or below 10 Celsius. \n";

	return(chill);
}
