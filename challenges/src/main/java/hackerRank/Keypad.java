package hackerRank;

import java.util.*;
import java.util.*;
import java.util.LinkedHashMap;

public class Keypad {

    /*
    Algo:
    create array of hashsets
    step through each lock in lock and turn to a hashset
    declare a counter = 0
    for each word in words check each letter if contained in hashset
      if a letter is not found in hashset move to next word
      if all letters a found in hashset increment counter by one and move to next word
    after all words have been evaluated add counter to return arr
    reset counter and move to next hashset
                                                                                                    hel
    might need to convert words to hashset to cut down on time if passed in word is something like "helloooooooooooooooooo"
     */
    public int[] Decoder(String[] locks, String[] words) {
        int[] returnArr = new int[locks.length];
        HashSet[] hashes = new HashSet[locks.length];
        int counter = 0, index = 0;
        boolean flag;

        // Go through each lock and turn it to a hashset then store it in the hashset array
        for (String lock : locks) {
            HashSet set = new HashSet();

            for (char c : lock.toCharArray()) {
                set.add(c);
            }
            hashes[counter] = set;
            counter++;
        }
        counter = 0;

        // take each lock and got through word to see how many words are contained in the hashset
        for (HashSet set : hashes) {
            for (String word : words) {
                flag = false;
               //if (word.contains(locks[index].charAt(0))) {
                    flag = true;
                    for (char c : word.toCharArray()) {
                        if (!set.contains(c)) {
                            flag = false;
                            break;
                        }
                    }
              // }
                if (flag) counter++;
            }
            returnArr[index] = counter;
            counter = 0;
            index++;
        }

        return returnArr;
    }

    //===============================================================
    public int[] DoubleHash(String[] locks, String[] words) {
        int[] returnArr = new int[locks.length];
        HashSet[] wordHashes = HashMaker(words);
        HashSet[] lockHashes = HashMaker(locks);
        int counter = 0, index = 0;
        boolean flag;

        for (HashSet lock : lockHashes) { //set
            for (HashSet word : wordHashes) {
                flag = false;
                if (word.contains(locks[index].charAt(0))) {
                    flag = true;
                    for (Object letter : word) {
                        if (!lock.contains(letter)) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) counter++;
            }
            returnArr[index] = counter;
            counter = 0;
            index++;
        }

        return returnArr;
    }

    private HashSet[] HashMaker(String[] input){
        HashSet[] hashes = new HashSet[input.length];
        int index = 0;
        for (String str : input) {
            HashSet set = new HashSet();

            for(char c : str.toCharArray()){
                set.add(c);
            }
            hashes[index] = set;
            index++;
        }
        return hashes;
    }



    //["asdrfg", "asgdtdv"]
    //============================================
    public int[] CheckFirst(String[] locks, String[] words) {
        int[] returnArr = new int[locks.length];
        HashSet[] wordHashes = HashMaker(words);
        HashSet[] lockHashes = HashMaker(locks);
        int counter = 0, index = 0;
        boolean flag;

        for (HashSet lock : lockHashes) {
            for (HashSet word : wordHashes) {
                flag = false;
                if (word.contains(locks[index].charAt(0))) { //check if first letter
                    // if word.Contains(locks[index].charAt(0))
                    flag = true;
                    for (Object letter : word) {
                        if (!lock.contains(letter)) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) counter++;
            }

            returnArr[index] = counter;
            counter = 0;
            index++;
        }

        return returnArr;
    }

    //==============================================
    public ArrayList<Integer> Simple(List<String> keypads, List<String> words){
        ArrayList<Integer> returnArr = new ArrayList<>();
        int counter;

        for (String keypad : keypads) {
            counter = 0;
            for(String word : words){
                if(word.indexOf(keypad.charAt(0)) != -1){
                    if(checkletters(keypad, word)) counter++;
                }
            }
            returnArr.add(counter);
        }

        return returnArr;
    }

//    public boolean checkletters(String keypad, String word){
//
//        for (int i = 1; i < word.length(); i++){
//            if (keypad.indexOf(word.charAt(i)) == -1) return false;
//        }
//
//        return true;
//    }
    //===============================================
    public ArrayList<Integer> WithMap(List<String> keypads, List<String> words){
        ArrayList<Integer> returnArr = new ArrayList<>();
        HashMap<String, Integer> map  = new HashMap<>();
        int counter;

        for (String keypad : keypads) {
            counter = 0;
            if(map.containsKey(keypad)){
                returnArr.add(map.get(keypad));
            }else{
                for(String word : words){
                    if(word.indexOf(keypad.charAt(0)) != -1){
                        if(checkletters(keypad, word)) counter++;
                    }
                }
                returnArr.add(counter);
            }
        }
        return returnArr;
    }

    public boolean checkletters(String keypad, String word){

        for (int i = 1; i < word.length(); i++){
            if (keypad.indexOf(word.charAt(i)) == -1) return false;
        }

        return true;
    }

    //===============================================

//    public int[] HashAsNeeded(String[] locks, String[] words){
//        int[] returnArr = new int[locks.length];
//        HashSet[] wordHashes = HashMaker(words);
//        int counter = 0, index = 0;
//        boolean flag = true;
//        for (String lock: locks) {
//            for (HashSet word : wordHashes) {
//                if(lock.contains(words[index])){
//                    for (Object letter: word) {
//                        if (!lock.contains(letter)) {
//                            flag = false;
//                            break;
//                        }
//                    }
//                }
//
//            }
//        }
//
//
//
//        return returnArr;
//    }




    //==============================================
    public int[] WithMaps(String[] locks, String[] words) {
        int[] returnArr = new int[locks.length];
        HashSet[] wordHashes = HashMaker(words);

        HashMap<Character, LinkedHashMap<HashSet, Integer>> map = new HashMap<>();

        for (String lock : locks) {
            LinkedHashMap<HashSet, Integer> temp = new LinkedHashMap<>();
            if (map.containsKey(lock.charAt(0))) temp = map.get(lock.charAt(0));

            temp.put(SingleSetMaker(lock), 0);
            map.put(lock.charAt(0), temp);
        }


        boolean flag = true;
        for (HashSet word : wordHashes) {
            for (Character c : map.keySet()) {
                if (word.contains(c)) {
                    for (HashSet lock : map.get(c).keySet()) {
                        for (Object letter : word) {
                            if (!lock.contains(letter)) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            map.get(c).replace(lock, map.get(c).get(lock) + 1);
                            //map.get(c).get(lock) = map.get(c).get(lock) + 1;
                        }
                        flag = true;
                    }
                }
            }
        }
        //      HashMap<Character,HashMap<HashSet, Integer>> map = new HashMap<>();

//        for (HashSet lock : map.
//             ) {
//
//        }
        return returnArr;
    }


    //========= 1st hash maker =====================
//    private HashSet[] HashMaker (String[] input){
//        HashSet[] hashes = new HashSet[input.length];
//        int index = 0;
//        for (String str : input) {
//            HashSet set = new HashSet();
//
//            for (char c : str.toCharArray()) {
//                set.add(c);
//            }
//            hashes[index] = set;
//            index++;
//        }
//        return hashes;
//    }








    //================= single hashset maker
    private HashSet SingleSetMaker (String input){
        HashSet hash = new HashSet();

        for (char c : input.toCharArray()) {
            hash.add(c);
        }

        return hash;
    }

}


//============== Zombie land ===================
//HashMap<HashSet, Integer> temp = map.get(lock.charAt(0));
//                temp.put(SingleSetMaker(lock), 0);
//                map.put(lock.charAt(0), temp);
//else{
//                HashMap<HashSet, Integer> temp = new HashMap<>();
////                temp.put(SingleSetMaker(lock), 0);
////                map.put(lock.charAt(0), temp);
//            }