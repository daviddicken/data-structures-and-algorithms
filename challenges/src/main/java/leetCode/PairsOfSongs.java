package leetCode;

import java.util.HashMap;
import java.util.Map;

//   You are given a list of songs where the ith song has a duration of time[i] seconds.
//    Return the number of pairs of songs for which their total duration in seconds is divisible by 60.
//    Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.
//    Example:
//    Input: time = [30,20,150,100,40]
//    Output: 3
//    Explanation: Three pairs have a total duration divisible by 60:
//            (time[0] = 30, time[2] = 150): total duration 180
//            (time[1] = 20, time[3] = 100): total duration 120
//            (time[1] = 20, time[4] = 40): total duration 60
//    Constrants:
//    1 <= time.length <= 6 * 104
//    1 <= time[i] <= 500
public class PairsOfSongs {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> evens = new HashMap();
        HashMap<Integer, Integer> odds = new HashMap();
        int pairs = 0, aKey = 0, bKey = 0, aVal = 0, bVal = 0;

        for(int i = 0; i < time.length; i++){
            if(time[i] % 2 == 0){
                if(evens.containsKey(time[i])){
                    evens.put(time[i], evens.get(time[i])+1);
                }else{
                    evens.put(time[i],1);
                }
            }else{
                if(odds.containsKey(time[i])){
                    odds.put(time[i], odds.get(time[i])+1);
                }else{
                    odds.put(time[i],1);
                }
            }
        }
//        pairs += getPairs(evens, pairs);
//        pairs += getPairs(odds, pairs);

         for(Map.Entry a : odds.entrySet()){
             aKey = (Integer) a.getKey();
             aVal = (Integer) a.getValue();

             for(Map.Entry b : odds.entrySet()){
                 bKey = (Integer) b.getKey();
                 if(aKey != bKey){
                     bVal = (Integer) b.getValue();
                     if((aKey + bKey) % 60 == 0) pairs += aVal * bVal;
                 }
             }
             if((aKey * 2) % 60 == 0) pairs += (aVal*(aVal - 1))/2;
             odds.replace(aKey, 0);
         }
         aKey = 0; bKey = 0; aVal = 0; bVal = 0;

         for(Map.Entry a : evens.entrySet()){

             aKey = (Integer) a.getKey();
             aVal = (Integer) a.getValue();
             for(Map.Entry b : evens.entrySet()){
                 bKey = (Integer) b.getKey();
                 if(aKey != bKey){
                     bVal = (Integer) b.getValue();
                     if((aKey + bKey) % 60 == 0) pairs += aVal * bVal;
                 }
             }
             if((aKey * 2) % 60 == 0) pairs += (aVal*(aVal - 1))/2;
             evens.replace(aKey, 0);
         }
        return pairs;
    }
    //-------------------------
    public int getPairs(HashMap<Integer, Integer> map, int pairs){
        int aKey = 0, bKey = 0, aVal = 0, bVal = 0;

        for(Map.Entry a : map.entrySet()){

            aKey = (Integer) a.getKey();
            aVal = (Integer) a.getValue();
            for(Map.Entry b : map.entrySet()){
                bKey = (Integer) b.getKey();
                if(aKey != bKey){
                    bVal = (Integer) b.getValue();
                    if((aKey + bKey) % 60 == 0) pairs += aVal * bVal;
                }
            }
            if((aKey * 2) % 60 == 0) pairs += (aVal*(aVal - 1))/2;
            map.replace(aKey, 0);
        }
        return pairs;
    }


}
