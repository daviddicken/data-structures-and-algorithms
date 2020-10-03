package utilities;

public class MultiBracketValidation {
    public static void main(String[] args) {

    }

    public static boolean multiBV(String input) {
        //check if input string has less then 2 chars & make sure string doesn't start with a closing bracket
        if(input.length() < 2){ return false; }
        if(input.charAt(0) == '}' || input.charAt(0) == ')' || input.charAt(0) == ']'){
            return false;
        }
        //set variables
        Q<Character> nextQ = new Q<>();
        char searchChar;
        int i = 0;
        int j;

        while(i < input.length()){ //This is one of the while loops that will be used to cycle through all chars in string
            searchChar = input.charAt(i); //set search char
            j = i + 1;
                                     //check if j is bigger then length then make sure that there isn't a left over bracket in q
            if(j > input.length()){  // or that the last left over char of string is a bracket
                if (nextQ.size() > 0 || searchChar == '(' || searchChar == ')'
                    || searchChar == '{' || searchChar == '}'
                    || searchChar == '[' || searchChar == ']'){
                    return false;
                }else{
                    return true;
                }
            }
                    // This do loop allows me to keep searching the string if I come across back to back ((( ect
            do{
                if(nextQ.size() > 0 && j > input.length()){ // if j is bigger then length and there
                    return false;                           // is something in the Q then not all brackets were closed
                }
                if(nextQ.size() > 0){                   // check if Q has something then deQ it and assign its value as new search char
                    searchChar = nextQ.dequeueFromFront();
                }
                while (j < input.length()){  // This loop allows me to compare search char to to each char in string until it closes or throws a false
                    if(doesBreak(searchChar, input.charAt(j))){ //send to switch statement to check if an illegal char is found
                        return false;
                    }
                    if(doesClose(searchChar, input.charAt(j))){ // send to switch statement to check if closing bracket is found
                        break;                                 // if found break out of while loop into do loop
                    }
                    if(searchChar == input.charAt(j)){         // if matching brackets are found send to Q continue searching with first search char
                        nextQ.enqueueToFront(input.charAt(j)); // a matching closing bracket will have to be found for this one before being allowed
                    }                                          // to leave the do loop and get another char to search with

                 j++;                                         // increment j to compare search char to next char
                }
                j++;                                         // increment j if a closing bracket was found and while loop was broken out before j incremented
                i = j;                                       // set i to j in case this goes back out to th first while loop so that we don't research chars
            }while (nextQ.size() > 0);  //check if any chars in Q before letting it back out to the first while
        }
    return true;                       // if we make it here all brackets were closed :)
    }

    // Borrowed switch idea from Paul.... and not giving it back :)
    //====================== does close ======================
    public static boolean doesClose(char open, char close) {
        switch (open) {
            case '[':
                if (close == ']') {
                    return true;
                }
                return false;
            case '(':
                if (close == ')') {
                    return true;
                }
                return false;
            case '{':
                if (close == '}') {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    //====================== does break ======================
    public static boolean doesBreak(char open, char close) {
        switch (open) {
            case '[':
                if (close == '{' || close == '}' || close == '(' || close == ')') {
                    return true;
                }
                return false;
            case '(':
                if (close == '{' || close == '}' || close == '[' || close == ']') {
                    return true;
                }
                return false;
            case '{':
                if (close == '[' || close == ']' || close == '(' || close == ')') {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}

