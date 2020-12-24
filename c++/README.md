# C++

### Data Structures

### Challenges
* [Average Word](#Average-Word)
* [BMR](#BMR)

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
