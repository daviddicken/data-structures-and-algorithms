package hashtable;

import linkedList.LinkedList;
import utilities.HashNode;

import java.util.ArrayList;

public class Hashtable {
    //========= Hashmap constructor ================
    //LinkedList [] buckets = new LinkedList[1];
    ArrayList<HashNode<String>> [] buckets = new ArrayList[1];

    //public Hashtable(LinkedList[] buckets) {this.buckets = buckets;}
    public Hashtable(ArrayList [] buckets) {
        this.buckets = buckets;
    }

    //========= Method to create and return a hashtable =======
    public Hashtable createHashtable(int size) throws Exception {
        //Catch a pointless hashtable
        if(size < 2){
            throw new Exception("Please select a larger size for your Hashtable");
        }

        ArrayList [] buckets = new ArrayList[size];
        Hashtable hashtable = new Hashtable(buckets);
        return hashtable;
    }

    //========== Contains =======================
    public boolean contains(String key){
        int hash = hash(key);
        ArrayList<HashNode<String>> list = buckets[hash];

        if(list == null){
            return false;
        }else{
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getKey() == key) {
                    return true;
                }
            }
            return false;
        }
    }

    //========== Get value =======================
    public String getValue(String key){

        if(this.contains(key)){
            int hash = hash(key);
            ArrayList<HashNode<String>> list = buckets[hash];

            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getKey() == key) {
                   return list.get(i).getValue();
                }
            }
        }
        return "Key not found";

    }

    //========== Hash and Add ====================
    public void add(String key, String value) throws Exception {

        if (contains(key)) {
            throw new Exception("Key has already been used please pick a new key");
        } else {
            int hash = hash(key);
            HashNode<String> newNode = new HashNode<>(key, value);

            ArrayList<HashNode<String>> list = buckets[hash];

            if (list == null) {
                list = new ArrayList<HashNode<String>>();
                list.add(newNode);
                buckets[hash] = list;
            } else {
                list.add(newNode);
            }
        }
    }

    //========== Hash ============================
    public int hash(String key){
        int bucket = 0;
        //allow room to attempt to concatenate most ascii values to the end of the int
        for(int i = 0; i < key.length(); i++){
            bucket = bucket * 100 + key.charAt(i);
        }

        bucket = bucket % buckets.length;
        // for some reason I was ending up with a negative number when hashing large strings
        // Math.abs converts a negative number to a positive number
        //https://stackoverflow.com/questions/493494/make-a-negative-number-positive
        bucket = Math.abs(bucket);
        return bucket;
    }

    //=========== toString ========================
    public String toString(){
        String theString = "[\n";

        for(int i = 0; i < buckets.length; i++){
           theString += i + ": [";
            if(buckets[i] == null){
                theString += "null";
            }else{
                ArrayList<HashNode<String>> list = buckets[i];
                for(int j = 0; j < list.size(); j++){
                    if(j > 0){
                        theString += ", ";
                    }
                    theString +=  list.get(j).getKey() +" : " + list.get(j).getValue();
                }
            }
            theString += "]\n";
        }

        theString += "]";
        return theString;
    }
}

//        int hash = hash(key);
//        HashNode<String> newNode = new HashNode<>(key,value);
//
//        ArrayList<HashNode<String>> list = buckets[hash];
//
//        if(list == null){
//            list = new ArrayList<HashNode<String>>();
//            list.add(newNode);
//            buckets[hash] = list;
//        }else{
//            for(int i = 0; i < list.size(); i++){
//                if(list.get(i).getKey() == key) {
//                    throw new Exception("Key has already been used please pick a new key");
//                }
//            }
//            list.add(newNode);
//        }
