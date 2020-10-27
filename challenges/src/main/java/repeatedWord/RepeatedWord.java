package repeatedWord;

//import Hashtable;

import datastructures.hashtable.Hashtable;

import java.util.ArrayList;

public class RepeatedWord {





    public String firstDouble(String words) throws Exception {
        String firstRepeated = "";

        words = words.replaceAll("\\p{P}","").toLowerCase();
        String[] arrayOfWords = words.split("\\s+");

        if(arrayOfWords.length <= 1){
            throw new Exception("Not enough words to compare.");
        }

        ArrayList [] buckets = new ArrayList[arrayOfWords.length];
        Hashtable hashtable = new Hashtable(buckets);

        for(int i = 0; i< arrayOfWords.length; i++){

            if(hashtable.contains(arrayOfWords[i])){
                return arrayOfWords[i];
            }else {
                hashtable.add(arrayOfWords[i], arrayOfWords[i]);
            }

        }
        return "No duplicate words found.";
    }
}
