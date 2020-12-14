/* 
 Filename: Date               (Chapter 5 Programming Project 7)
 Author:   David Dicken
 Description:  This is a program that takes a date input from the user and outputs what day off the week it falls on
               

 Date last modified: 2/6/16

 Algorithm: get date from user (has to be a pass by refernce function named getInput)
            write switch statement functions for month codes and century codes
			write a function to calculate year code
			write a function that uses year code month code and calander date to figure a day code
			write a function to test if year is a leap year
			        if it is and month is jan or feb then subtract 1 from day code
		    write a function that takes the day code and runs it through a switch statment to determine what day of the week
 */
#include<iostream>
#include<string>
using namespace std;

// Function calls
void getInput (int& day, int& month, int& year); // Input: empty variable to be changed to user input. Output variables with user input
int dayCode (int day); // Input: day int between 1-31. Output daycode
int monthCode (int month); // Input: month int between 1-12 Output: monthcode
int yearcode (int year); // Input: year int between 100 - 9999 Output: yearcode 
int leapYear (int year, int month); // Input year int between 100-9999 and month int between 1-12.  Output: Leapyear 0 if no or -1 if yes
int calculate (int dayNum, int monthNum, int yearNum, int leapYear); // Input: daycode, monthcode, yearcode, and leapyear
                                                                     // Output: int between 0-6 representing a day of the week
string whatDay (int weekNum); // Input: int between 0-6 representing a day of the week. Output: string with day of week spelled out
void output(int month, int day, int year, string dayOfweek);// input: date user originally enter (int month 1-12, day 1-41, year 100-9999)
                                                            // and a string with day of week. Output: cout to user
int centuryCode (int century); // Input: century code (int between 1 - 99) Output: year cade (int 5,3,1, or 0)



// Program Main
int main()
{
	int dayIn(0), monthIn(0), yearIn(0), dayNum(0), monthNum(0), yearNum(0), leapNum(0), weekNum(0);
	string dayOfweek(" ");

getInput (dayIn, monthIn, yearIn);
dayNum = dayCode (dayIn);
monthNum = monthCode (monthIn);
yearNum = yearcode (yearIn);
leapNum = leapYear (yearIn, monthIn);
weekNum = calculate (dayNum, monthNum, yearNum, leapNum);
dayOfweek = whatDay (weekNum);
output(monthIn, dayIn, yearIn, dayOfweek);

	return 0;
}


//****************************************************************
//                     FUNCTIONS
//****************************************************************




//********************* Get Input Function************************
// Input: int day, month, and year variables
// Output: int day, month and year variables are changed by function to users input
// Algorithm: input day, month and year variables
//            ask user for a date between 1/1/100 and 12/31/9999
//            test to make sure user entered a valid date
//            pass user input to programs variables
//****************************************************************
void getInput (int& day, int& month, int& year)
{
#include<iostream>
	using namespace std;
	const int MONTHSnYEAR(12),minMONTH(1), minDAY(1), DAYSnMONTH(31), minYEAR(100), maxYEAR(9999);
	char valid('f');
	
	while(valid == 'f')
	{
	cout << "Welcome to the What Day Is It program. \n"
	     << "You give me a date and I'll tell you what day of the week it falls on. \n\n"
	     << "Please enter a date between " << minMONTH << " " << minDAY << " " << minYEAR << " and " << MONTHSnYEAR << " "
		 << DAYSnMONTH << " " << maxYEAR << endl   
		 << "in mm dd yyyy format: \n \n"
		 << "Please just use a space between month and day, and between day and year. \n";
	cin >> month;
	cin >> day;
	cin >> year;
	
	//       Test if user entered a valid date
	if(month <= MONTHSnYEAR && month >= minMONTH)
	{
		if(day <= DAYSnMONTH && day >= minDAY)
		{
			if(year >= minYEAR && year <= maxYEAR)
			{
         valid = 't';
			}
		}
  }
	else
	{
		cout << "Invalid Date. \n";
	}
	}
}

//********************* Day Code Function ************************
// Input: day (calender date from user int between 1 - 31)
// Output: day code ( int between 0 - 6)
// Algorithm: Input day date entered by user
//            Mod the day date by the numer of days in a week for day code
//            return day code
//****************************************************************
int dayCode (int day)
{
	const int DAYSnWEEK(7);
	
	day = day % DAYSnWEEK;

	return(day);
}

//********************* Month Code Function **********************
// Input: month (int between 1 - 12)
// Output: month code (int between 0-6)
// Algorithm: input month
//            write variable to hold month code
//            write a switch statement determine what month it is
//            change month code variable to hold proper value depending on what month it is
//            return month code
//****************************************************************
int monthCode (int month)
{
	int mc(0);

	switch(month)
	{
	case 1:
		mc = 6;
		break;
	case 2:
		mc = 2;
		break;
	case 3:
		mc = 2;
		break;
	case 4:
		mc = 5;
		break;
	case 5:
		mc = 0;
		break;
	case 6:
		mc = 3;
		break;
	case 7:
		mc = 5;
		break;
	case 8:
		mc = 1;
		break;
	case 9:
		mc = 4;
		break;
	case 10:
		mc = 6;
		break;
	case 11:
		mc = 2;
		break;
	case 12:
		mc = 4;
		break;
	default:
		break;
	}
	return(mc);
}

//********************* Year code Function ***********************
// Input: year (int entered by user between 100 - 9999)
// Output: year code (int 5,3,1, or 0)
// Alorithm: input year enter by user
//           write variables to hold output, century, year code(from century switch), and last 2 digits of year
//           divide year by 100 to get the century
//             run century through switch statement
//                assign proper value to year code variable
//           mod year to seperate the last two digits
//           return (last two digits of year % 7) + (last two digits / 4) + year code from century switch
//****************************************************************
int yearcode (int year)
{
	const int MODby(7), DIVby(4);
	int output(0), yc(0), century(0),twoDigit(0);

	century = year / 100;
	twoDigit = year % 100;
	yc = centuryCode(century);
	
	output = (twoDigit % MODby) + (twoDigit / DIVby) + yc;

	return(output);

}

//********************* Leap Year Function ***********************
// Input: int year between 100 - 9999 and int month between 1 - 12
// Output: int 0 or -1
// Algorithm: Input year and month that user entered
//            write constants for moding every 4 years and moding every 400 years
//            write constant for days to subtract -1 (DAYSlost)
//            check to see if the month is either jan or feb
//            if yes divide year by 100
//               if that number is 0 check and see if year can be divided by 400 evenly
//                  if so change days DAyslost to -1
//            else if that num was not a 0 and can be divided by 4 evenly
//                change DAYSlost to -1
//            return days lost
//****************************************************************
int leapYear (int year, int month)
{
	const int LEAPYEAR(4), LEAPhundreds(400), DAYSlost(-1);
	int output(0), digits(0);

	if(month == 1 || month == 2)
	{
      digits = year / 100;
	  if(digits == 0)
	  {
	   if(year % LEAPhundreds == 0)
	   {
			output = DAYSlost;
	   }
	  }
	  else if(digits % LEAPYEAR == 0)
	  {
      output = DAYSlost;
	  }
	}
	return(output);
}

//********************* Calculate Function ***********************
// Input: day code (int between 0 - 6), month code (int between 0-6), year code (int 5,3,1, or 0), leap year (int 0, or -1)
// Output: int between 0-6 that represents what day of the week
// Algorithm: input daycode, monthcode, yearcode, and leapyear
//            write a constant for days in a week
//            write variable for output
//            add daycode, monthcode, yearcode, and leapyear together
//              mod that number by days in a week (7)
//            return that number
//****************************************************************
int calculate (int dayNum, int monthNum, int yearNum, int leapYear)
{
	const int DAYSnWEEK(7);
	int output(0);

	output = dayNum + monthNum + yearNum + leapYear;
	output = output % DAYSnWEEK;
		 
	return(output);
}

//********************* What Day Function ************************
// Input: int between 0 -6
// Output: string name of day that matches the inout number
// Algorithm: Input number from calculation function
//            make string variable to hold the day of the week
//            write a switch statement to determine what day of the week if is
//            change string variable to hold day of the week
//            return day of the week string
//****************************************************************
string whatDay (int weekNum)
{
#include<string>

	string day(" ");

	switch(weekNum)
	{
	case 0:
		day = " Sunday ";
		break;
	case 1:
		day = " Monday ";
		break;
	case 2:
		day = " Tuesday ";
		break;
	case 3:
		day = " Wednesday ";
		break;
	case 4:
		day = " Thursday ";
		break;
	case 5:
		day = " Friday ";
		break;
	case 6:
		day = " Saturday ";
		break;
	default:
		break;
	}
	return(day);

}

//********************* Output Function **************************
//Input: month (int between 1 -12), day (int between 1 -31), year (int between 100 - 9999), string (day of the week)
// Output: cout a string 
// Algorithm: cout date entered by user and what day it falls on
//****************************************************************
void output(int month, int day, int year, string dayOfweek)
{
#include<iostream>
#include<string>
	using namespace std;

	cout << "\n" << month << "/" << day << "/" << year << " falls on a " << dayOfweek << endl;
}

//********************* Century Code *****************************
// Input: 1 or 2 digit century int between 1 - 99
// Output: century code (int 5, 3, 1, 0)
// Algorithm: get century digits from the year code function
//            create a variable to hold year code
//            run through a rediculously long switch statement to find out what the year code for century is
//                (I know there is a pattern here and I probably could have come up with a math equation to do
//                 this for me.  But I have spent over 20 hrs this week on homework for this class and 
//                 I am falling behind on homework for my other classes)
//             return year code
//****************************************************************
int centuryCode (int century) 
{
	int yc(0);

	century = century % 4;

	switch(century)
	{   
	  case 1: 
			yc = 5; // 29 % 4 = 1 == yc 5 ---> 1 % 4 = 1
			break;
	  case 2:
		  yc = 3; //30 % 4 = 2 == yc 3 ---> 2 % 4 = 2
			break;
		case 3:
			yc = 1; // 31 % 4 = 3 == yc 1 ---> 3 % 4 = 3
			break;
		case 4:
			yc = 0; // 28 % 4 = 0 = yc = 0
			break;
		// case 5:
		// 	yc = 5;
		// 	break;
		// case 6:
		// 	yc = 3;
		// 	break;
		// case 7:
		// 	yc = 1;
		// 	break;
		// case 8:
		// 	yc = 0;
		// 	break;
		// case 9:
		//   yc = 5;
		// 	break;
	  // case 10:
		//   yc = 3;
		// 	break;
		// case 11:
		// 	yc = 1;
		// 	break;
		// case 12:
		// 	yc = 0;
		// 	break;
		// case 13:
		// 	yc = 5;
		// 	break;
		// case 14:
		// 	yc = 3;
		// 	break;
		// case 15:
		// 	yc = 1;
		// 	break;
		// case 16:
		// 	yc = 0;
		// 	break;
		// case 17:
		//   yc = 5;
		// 	break;
		// case 18:
		// 	yc = 3;
		// 	break;
		// case 19:
		// 	yc = 1;
		// 	break;
		// case 20:
		// 	yc = 0;
		// 	break;
		// case 21:
		// 	yc = 5;
		// 	break;
		// case 22:
		// 	yc = 3; // 22%4 = 2 ==yc3
		// 	break;
		// case 23:
		// 	yc = 1;
		// 	break;
		// case 24:
		// 	yc = 0;
		// 	break;
		// case 25:
		// 	yc = 5;
		// 	break;
		// case 26:
		// 	yc = 3;
		// 	break;
		// case 27:
		// 	yc = 1;
		// 	break;
		// case 28: // 28 % 4 = 0 = yc = 0
		// 	yc = 0;
		// 	break;
		// case 29:
		// 	yc = 5; // 29 % 4 = 1 == yc 5
		// 	break;
		// case 30:  //30 % 4 = 2 == yc 3
		//   yc = 3;  
		// 	break;
		// case 31: // 31 % 4 = 3 == yc 1
		// 	yc = 1;
		// 	break;
		// case 32:
		// 	yc = 0;
		// 	break;
		// case 33:
		// 	yc = 5;
		// 	break;
		// case 34:
		// 	yc = 3;  // mod 4 =2 yc=3
		// 	break;
		// case 35:
		// 	yc = 1;
		// 	break;
		// case 36:
		// 	yc = 0;
		// 	break;
		// case 37:
		//   yc = 5; // mod 4 = 1
		// 	break;
		// case 38:
		// 	yc = 3;
		// 	break;
		// case 39:   // mod 4 = 3 
		// 	yc = 1;
		// 	break;
		// case 40:
		// 	yc = 0;
		// 	break;
		// case 41:
		// 	yc = 5;
		// 	break;
		// case 42:
		// 	yc = 3;
		// 	break;
		// case 43:
		// 	yc = 1;
		// 	break;
		// case 44:
		// 	yc = 0;
		// 	break;
		// case 45:
		// 	yc = 5;
		// 	break;
		// case 46:
		// 	yc = 3;
		// 	break;
		// case 47:
		// 	yc = 1;
		// 	break;
		// case 48:
		// 	yc = 0;
		// 	break;
		// case 49:
		// 	yc = 5;
		// 	break;
		// case 50:
		//   yc = 3;
		// 	break;
		// case 51:
		// 	yc = 1;
		// 	break;
		// case 52:
		// 	yc = 0;
		// 	break;
		// case 53:
		// 	yc = 5;
		// 	break;
		// case 54:
		// 	yc = 3;
		// 	break;
		// case 55:
		// 	yc = 1;
		// 	break;
		// case 56:
		// 	yc = 0;
		// 	break;
		// case 57:
		//   yc = 5;
		// 	break;
		// case 58:
		// 	yc = 3;
		// 	break;
		// case 59:
		// 	yc = 1;
		// 	break;
		// case 60:
		// 	yc = 0;
		// 	break;
		// case 61:
		// 	yc = 5;
		// 	break;
		// case 62:
		// 	yc = 3;
		// 	break;
		// case 63:
		// 	yc = 1;
		// 	break;
		// case 64:
		// 	yc = 0;
		// 	break;
		// case 65:
		// 	yc = 5;
		// 	break;
		// case 66:
		// 	yc = 3;
		// 	break;
		// case 67:
		// 	yc = 1;
		// 	break;
		// case 68:
		// 	yc = 0;
		// 	break;
		// case 69:
		// 	yc = 5;
		// 	break;
		// case 70:
		//   yc = 3;
		// 	break;
		// case 71:
		// 	yc = 1;
		// 	break;
		// case 72:
		// 	yc = 0;
		// 	break;
		// case 73:
		// 	yc = 5;
		// 	break;
		// case 74:
		// 	yc = 3;
		// 	break;
		// case 75:
		// 	yc = 1;
		// 	break;
		// case 76:
		// 	yc = 0;
		// 	break;
		// case 77:
		//   yc = 5;
		// 	break;
		// case 78:
		// 	yc = 3;
		// 	break;
		// case 79:
		// 	yc = 1;
		// 	break;
		// case 80:
		// 	yc = 0;
		// 	break;
		// case 81:
		// 	yc = 5;
		// 	break;
		// case 82:
		// 	yc = 3;
		// 	break;
		// case 83:
		// 	yc = 1;
		// 	break;
		// case 84:
		// 	yc = 0;
		// 	break;
		// case 85:
		// 	yc = 5;
		// 	break;
		// case 86:
		// 	yc = 3;
		// 	break;
		// case 87:
		// 	yc = 1;
		// 	break;
		// case 88:
		// 	yc = 0;
		// 	break;
		// case 89:
		// 	yc = 5;
		// 	break;
		// case 90:
		// 	yc = 3;
		// 	break;
		// case 91:
		// 	yc = 1;
		// 	break;
		// case 92:
		// 	yc = 0;
		// 	break;
		// case 93:
		// 	yc = 5;
		// 	break;
		// case 94:
		// 	yc = 3;
		// 	break;
		// case 95:
		// 	yc = 1;
		// 	break;
		// case 96:
		// 	yc = 0;
		// 	break;
		// case 97:
		// 	yc = 5;
		// 	break;
		// case 98:  //mod 4 = 2 yc==3
		// 	yc = 3;
		// 	break;
		// case 99:
		// 	yc = 1;
		// 	break;
		// default:
		// 	break;
	}
	return(yc);
}
