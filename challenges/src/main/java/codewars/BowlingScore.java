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
                        score += 20 + arr.get(i+2).charAt(0);
                    }
                }else if(arr.get(i+1).contains("/")){
                    score += 20;
                } else{
                   score += 10 + arr.get(i+1).charAt(0) + arr.get(i+1).charAt(1);
                }
            }else if(arr.get(i).contains("/")){
                if(arr.get(i+1) == "X"){
                    score += 20;
                }else{
                    score += 10 + arr.get(i+1).charAt(0);
                }
            }else{
                score += arr.get(i).charAt(0) + arr.get(i).charAt(1);
            }
        }
//ninth frame
        if(arr.get(8).equals("X")){
            if (arr.get(9).charAt(0) == 'X'){
                if(arr.get(9).charAt(1) == 'X'){
                    score += 30;
                }else {
                    score += 20 + arr.get(9).charAt(1);
                }
            }else if(arr.get(9).charAt(1) == '/'){
                score += 20;
            }else{
                score += 10 + arr.get(9).charAt(0) + arr.get(9).charAt(1);
            }
        }else if(arr.get(8).contains("/")){
            if(arr.get(9).charAt(0) == 'X'){
                score += 20;
            }else{
                score += 10 + arr.get(9).charAt(0);
            }
        }else{
            score += arr.get(8).charAt(0) + arr.get(8).charAt(1);
        }
//10th frame
        


        return score;
    }
}
//total += Integer.parseInt(String.valueOf(arr.get(i+1).charAt(0)));
