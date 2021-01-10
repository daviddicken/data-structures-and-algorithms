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


        for(int i = 0; i < arr.size(); i++){ // length -1 for 10th frame?
            if(arr.get(i).equals("X")){
                int total = 10;

                if(arr.get(i+1).equals("X")){
                    total = 20;
                    //if(arr.get(i))//check next frame for x
                }else if(arr.get(i+1).contains("/")){
                    arr.set(i, "20");
                    break;
                } else{
                    total += Integer.parseInt(String.valueOf(arr.get(i+1).charAt(0)));
                }

            }else if(arr.get(i).contains("/")){

            }

        }



        return 0;
    }
}

