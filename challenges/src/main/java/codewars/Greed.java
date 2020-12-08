package codewars;

import java.util.HashMap;
import java.util.Map;

public class Greed{
    public static int greedy(int[] dice){
        int points = 0;
        HashMap<Integer, Integer> rolls = new HashMap<>();
        for(int num : dice){
            if(rolls.containsKey(num)){
                rolls.put(num, rolls.get(num) + 1);
            }else{
                rolls.put(num, 1);
            }
        }
        for(Map.Entry d : rolls.entrySet()){
            int val = (Integer) d.getValue(), key = (Integer) d.getKey();
            if(val > 2) points += (val / 3) * (key * 100);
            if(key == 1) points += ((val / 3) * 900) + ((val % 3) * 100);
            if(key == 5) points += val % 3 * 50;
        }
        return points;
    }
}


