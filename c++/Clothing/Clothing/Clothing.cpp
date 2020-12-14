
/*
Filename: Clothes               (Chapter 4 Programming Project 2)
Author:   David Dicken
Description:  A program that asks user for their height, weight, and age. Then calculates and outputs hat size, jacket size, and wait size.
              This program needs to allow the user to input their 

Date last modified: 1/27/16

Algorithm: Introduce Program
           Get height, weight, and age from user
		   write function to calculate hat size
		   (w/h) * 2.9
		   write function to calculate jacket size
		   ((h * w)/288) + (y * .125)     (make variable names for 288 & .125)
		     if a > 39 then  a - 30 = x
			                 x / 10 = y   (use integers)
		   write function to calculate waist size
		   (w / 5.7) + (y * .1)           (make variable names for 5.7 & .1)
		   if a > 29 then a - 28 = x
		                  x / 2  = y      (use integers)
		   output hat size, jacket size, and waist size
		   ask if user would like to enter different height, weight and age
		   end program
		  
*/
#include<iostream>
using namespace std;
double headSize(double weight, double height); //computes the hat size using weight and height then returns hat size
double chestSize(double weight, double height, double age); // computes the jacket size using weight height and age then returns jacket size
double pantSize(double weight, double age);  // computes waist size using age and weight then returns waist size

int main()
{
	char exit('y');
	do
	{
	
	double weight(0.0), age(0.0),hatSize(0.0), jacketSize(0.0), waistSize(0.0), height(0.0);
	
//	       Introduce Program
	cout << "\n             Size Finder             \n\n"
		 << "This program will use your height, weight, and age \n"
		 << "to try and calculate what size clothing should fit you. \n\n"

//         Get height, weight, and age from user
		 << "What is your height in inches? \n";
     cin >> height; 
	 cout << "\nWhat is your weight in pounds? \n";
	 cin >> weight;
	 cout << "\nWhat is your age in years? \n";
	 cin >> age;
	 cout << "\nThank you. \n\n";

	 hatSize = headSize(weight, height);
     jacketSize = chestSize(weight, height, age);		  
	 waistSize = pantSize(weight, age);

//		   output hat size, jacket size, and waist size
	 cout << "Hat Size:    " << hatSize << endl
		  << "Jacket Size: " << jacketSize << endl
		  << "Waist Size:  " << waistSize << endl;

//		   ask if user would like to enter different height, weight and age
	 cout << "\n\n Would you like to enter a different height, weight and age? \n"
		  << "Press 'Y' for yes or any other key to quit. \n";
	 cin  >> exit;
	 exit = tolower(exit);
	}
	while (exit == 'y');
	return 0;
}

	 double headSize(double weight, double height)
    /******************************************************************************************************
	************************* Hat Size Function ***********************************************************
	*******************************************************************************************************
	***** Inputs: Weight and Height             ***********************************************************
	***** Algorithm: (weight / height) * 2.9    ***********************************************************
	***** Output: Hat size  *******************************************************************************
	******************************************************************************************************/
	 {
		 #include<iostream>
         using namespace std;

		 const double SIZER(2.9);
	 
		 return ((weight / height) * SIZER);
	 }
	 
	 double chestSize(double weight, double height, double age)
    /******************************************************************************************************
	************************* Jacket Size Function ********************************************************
	*******************************************************************************************************
	***** Inputs: Height, Weight and Age                                               ********************
	***** Algorithm:  ((height * weight)/288) + (y * .125)     (make variable names for 288 & .125)********
	*****                if age > 39 then  age - 30 = x              **************************************
	*****       	                         x / 10 = y        (output a integer) *************************
	***** Output: Jacket size  ****************************************************************************
	******************************************************************************************************/		                   
	 {
         #include<iostream>
		 using namespace std;

		 const double CHESTconst(288.0), AGEconst(.125);
		 const int MINage(30), YEARSincrease(10);
		 double ageAdjust(0);

		 if(age > 39)
		 {
			 ageAdjust = (age - MINage) / YEARSincrease; 
			 ageAdjust = static_cast<int>(ageAdjust);
		 }
			 
		 return(((height * weight)/CHESTconst) + (ageAdjust * AGEconst)); 
	 }

	 double pantSize(double weight, double age)
	/******************************************************************************************************
	************************* Waiste Size Function ********************************************************
	*******************************************************************************************************
	***** Inputs: Weight and Age                                                      *********************
	***** Algorithm: (weight / 5.7) + (y * .1)     (make variable names for 5.7 & .1) *********************
	*****       if age > 29 then age - 28 = x                     *****************************************
	*****       	               x / 2  = y      (output a integer) *************************************
	***** Output: Waiste size  ****************************************************************************
	******************************************************************************************************/
	 {
         #include<iostream>
		 using namespace std;

		 const double WEIGHTconst(5.7), AGEconst(.1);
		 const int MINage(28), YEARSincrease(2);
		 double ageAdjust(0);

		 if(age > 28)
		 {
			 ageAdjust = (age - MINage) / YEARSincrease; 
			 ageAdjust = static_cast<int>(ageAdjust);
		 }
			 
		 return(((weight / WEIGHTconst)+ (ageAdjust * .1))); 
	 }