# C++

### Data Structures

### Challenges
* [Average Word](#Average-Word)
* [BMR](#BMR)
* [Ninty Nine Bottles](#Ninety-Nine-Bottles)
* [Change](#Change)
* [Sound](#Sound)
* [Clothing](#Clothing)
* [Cubed Tic Tac Toe](#Cubed-Tic-Tac-Toe)

## Average Word
Date: 2/11/16  
This is a program that reads a text file and outputs the avg lenth of the words found in the file.
A word is defined as a string of symbols followed by a whitespace, comma, period, or end of line.
The program will define a function that is called with input-file stream as a argument
The function will also work with the stream cin as the input stream.

### Approach
* Introduce - cout's to user
* openfile - ask user what file and open
* calculate - count the characters and count the words divide the characters by the words to find out average word length
* closefile - close the file
* output - use cout's to output amount of words in the file and the average word legnth
* Figure out how to get this program to accept cin stream
* bulletproof

### Code
[Code](avgWord/avgWord/avgWord.cpp)
_________________________________________________________________________________
## BMR
Date: 1/13/16  
A program that gets the user to enter their weight in pounds, height in inches, age in years, 
and either a M for male or F for female. 
Then using the BMR formula calculate how many chocolate bars at 230 calories each 
they would have to eat a day to maintain their weight.

### Algorithm
* Get weight, height, age, and male or female from user.
* Calculate either female bmr or male bmr (to get calories) depending on user input.
* Calories / 230 to find out how many chocolate bars are needed to mantain user weight.
* Display the amount of chocolate bars the user needs to eat every day.

### Code
[Code](bmr/Chap2Proj13/bmr.cpp)
_______________________________________________________________________________
## Ninety Nine Bottles
Date: 1/30/16  
A program that outputs lyrics to the song ninty-nine bottles of beer on the wall.
It needs to spell out the numbers ninety-eight not 98.

### Algorithm
* create counter variable set at 99
* do while counter > 0
* create if statement for counter variable being between 2 - 19 (if(counter > 1 && counter < 20)
* create case statement for 2-19 (function)
* create else for counter variable = 1
* add no more bottles of beer to end of one more bottle output
* create tens function
* counter / 10
* make case statement to return written number (ninety, eighty, ect)
* create ones function
* counter % 10
* make case statement to return written number (one, two, ect)

### Code
[Code](Bottles/Bottles/bottles.cpp)
________________________________________________________________________________
## Change
Date: 2/4/16
This is a program that tells the users what coins to give for change.  
The till is out of nickles and half dollars.

### Algorithm
* Introduce program
* Get amount of change that is needed from user
* Convert to coins (quarters, dimes, pennies)
* To get quarters needed divide change by 25 mod change by 25 to get remaining amount
* To get dimes needed divide change by 10 mod change by 10 to get remaining amount
* To get pennies needed divide change by 1
* Include the books void compute_coins function
* Output coins needed to make change
* Repeat until user says they are done

### Code
[Code](change/change/change.cpp)
________________________________________________________________________________
## Sound
Date: 1/13/16  
This is a program that allows the user to enter a starting temperature and ending temperature.  
Then within the temperature range the program needs to calculate and display velocity of sound (meters/sec) 
by 1 degree increments.

### Algorithm
* Get starting and ending temperatures (in celsius) from user
* Display the velocity of sound for each degree in the selected temperature range
  velocity = 331.3 + 0.61 x temperature
   
### Code
________________________________________________________________________________
## Clothing
Date: 1/27/16  
This program will asks user for their height, weight, and age. Then calculates and outputs hat size, jacket size, and wait size.

### Algorithm
* Introduce Program
* Get height, weight, and age from user
* Write function to calculate hat size
	(w/h) * 2.9
* write function to calculate jacket size
	((h * w)/288) + (y * .125)     (make variable names for 288 & .125)
	 if a > 39 then  a - 30 = x
	  x / 10 = y   (use integers)
* write function to calculate waist size
	(w / 5.7) + (y * .1)           (make variable names for 5.7 & .1)
		if a > 29 then a - 28 = x
		  x / 2  = y      (use integers)
* output hat size, jacket size, and waist size
* ask if user would like to enter different height, weight and age
* end program

### Code
________________________________________________________________________________
## Cubed Tic Tac Toe
This is a 2 player three layered tic tac toe game. Player 1 is X's and player 2 is  O's.  
Players will take turns placing X's and O's in ome of the 27 spots on a three layer tic tac toe board.  
Each time a player gets three X's or 3 O's in a row they score a point. If you picture the gameboard as   
three tic tac toe boards lying on top of eachother to form a cube, a player can get three in a row -
up and down, diagonally, and side to side.

### Algorithm
* Indtroduce the game and explain the rules
* Write function to build out board
  * Next
________________________________________________________________________________
