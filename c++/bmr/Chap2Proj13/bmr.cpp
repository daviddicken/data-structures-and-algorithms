/* 
 Filename: BMR               (Chapter 2 Programming Project 13)
 Author:   David Dicken
 Description:  A program that gets the user to enter their weight in pounds, height in inches,
               age in years, and either a M for male or F for female.
			   Then using the BMR formula calculate how many chocolate bars at 230 calories each
			   they would have to eat a day to maintain their weight.

			   Female BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age)
			   Male BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age)

 Date last modified: 1/13/16

 Algorithm:  Get weight, height, age, and male or female from user.
             Calculate either female bmr or male bmr (to get calories) depending on user input
			 Calories / 230 to find out how many chocolate bars are needed to mantain user weight
			 Display the amount of chocolate bars the user needs to eat every day.
            
 */

#include <iostream>
using namespace std;

int main()
{
	double weight(0.0), height(0.0), age(0.0), calories(0.0), bars2eat(0.0), calories_per_bar(230.0), femalebmr(655.0), malebmr(66.0),
		   female_bmr_weight(4.3), male_bmr_weight(6.3), female_bmr_height(4.7), male_bmr_height(12.9), female_bmr_age(4.7),
		   male_bmr_age(6.8), feet(0.0), inches(0.0);
	char sex('f');
	
    cout << "Please enter your height feet then inches. \n";
	cout << "Feet: "; cin >> feet;
	cout << "Inches: "; cin >> inches;

	height = (feet * 12) + inches;

	cout << "Please enter your weight in pounds. \n"; cin >> weight;
	cout << "How old are you? \n"; cin >> age;
	cout << "Are you a male or female? \n";
	cout << "Enter a M for male or a F for female: \n"; cin >> sex;
	
	if (sex == 'f' || sex == 'F')
	{
		calories = femalebmr + (female_bmr_weight * weight) + (female_bmr_height * height) - (female_bmr_age * age);
		bars2eat = calories / calories_per_bar;

		cout.setf(ios::fixed);
	    cout.setf(ios::showpoint);
	    cout.precision(2);

		cout << "You should sit on the couch and eat " << bars2eat << " chocolate bars everyday to mantain \n";
		cout << "that beautiful body of yours! \n";
	}
	else if (sex == 'm' || sex == 'M')
	{
		calories = malebmr + (male_bmr_weight * weight) + (male_bmr_height * height) - (male_bmr_age * age);
		bars2eat = calories / calories_per_bar;

		cout.setf(ios::fixed);
	    cout.setf(ios::showpoint);
	    cout.precision(2);

		cout << "You should sit on the couch and eat " << bars2eat << " chocolate bars everyday to mantain \n";
		cout << "that beautiful body of yours! \n";
	}
	else
	{
		cout << "Don't feed chocolate to dogs. \n";
	}

	return 0;
}