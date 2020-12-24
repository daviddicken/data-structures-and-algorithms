# C++

### Data Structures

### Challenges
* [Average Word](#Average-Word)
* [BMR](#BMR)
* [Ninty Nine Bottles](#Ninety-Nine-Bottles)

## Average Word
Date: 2/11/16  
This is a program that reads a text file and outputs the avg lenth of the words found in the file.
A word is defined as a string of symbols followed by a whitespace, comma, period, or end of line.
The program will define a function that is called with input-file stream as a argument
The function will also work with the stream cin as the input stream

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
Date 1/13/16  
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
Date 1/30/16  
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

________________________________________________________________________________
