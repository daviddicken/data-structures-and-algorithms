package codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class BowlingScore {
    //split string into a arraylist
    //step through arraylist and convert each fame to total points for that frame
    // if no x or / is found add two digits together
    //  create boolean if x is found to keep adding the next two numbers found to frame
    // if / is found add first value of next frame to frame
    public static int bowling_score(String frames) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(frames.split(" ")));
        int score = 0;
//"11 11 11 11 11 11 11 11 11 11"
//"X X X X X X X X X XXX"   size 10    8
        for(int i = 0; i < arr.size() - 2; i++){
            if(arr.get(i).equals("X")){
                if(arr.get(i+1).equals("X")){
                    if(arr.get(i + 2).charAt(0) == 'X'){
                        score += 30;
                    }else{
                        score += 20 + Character.getNumericValue(arr.get(i+2).charAt(0));
                    }
                }else if(arr.get(i+1).charAt(1) == '/'){
                    score += 20;
                } else{
                   score += 10 + Character.getNumericValue(arr.get(i+1).charAt(0)) + Character.getNumericValue(arr.get(i+1).charAt(1));
                }
            }else if(arr.get(i).charAt(1) == '/'){
                if(arr.get(i+1).charAt(0) == 'X'){
                    score += 20;
                }else{
                    score += 10 + Character.getNumericValue(arr.get(i+1).charAt(0));
                }
            }else{
                score += Character.getNumericValue(arr.get(i).charAt(0)) + Character.getNumericValue(arr.get(i).charAt(1));
            }
        }
    //ninth frame
        if(arr.get(8).equals("X")){
            if (arr.get(9).charAt(0) == 'X'){
                if(arr.get(9).charAt(1) == 'X'){
                    score += 30;
                }else {
                    score += 20 + Character.getNumericValue(arr.get(9).charAt(1));
                }
            }else if(arr.get(9).charAt(1) == '/'){
                score += 20;
            }else{
                score += 10 + Character.getNumericValue(arr.get(9).charAt(0)) + Character.getNumericValue(arr.get(9).charAt(1));
            }
        }else if(arr.get(8).charAt(1) == '/'){
            if(arr.get(9).charAt(0) == 'X'){
                score += 20;
            }else{
                score += 10 + Character.getNumericValue(arr.get(9).charAt(0));
            }
        }else{
            score += Character.getNumericValue(arr.get(8).charAt(0)) + Character.getNumericValue(arr.get(8).charAt(1));
        }
        //10th frame
        if (arr.get(9).charAt(1) == '/'){
            score += 10 + Character.getNumericValue(arr.get(9).charAt(2));
        }else{
            for(int i = 0; i < arr.get(9).length(); i++){
                if(arr.get(9).charAt(i) == 'X'){
                    score += 10;
                }else {
                    score += Character.getNumericValue(arr.get(9).charAt(i));
                }
            }
        }
        return score;
    }
}
