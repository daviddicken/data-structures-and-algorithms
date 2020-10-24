package hashtable;

public class Hashtable {
    //========= Hashmap constructor ================

    int [] buckets = new int[1];

    public Hashtable(int[] buckets) {
        this.buckets = buckets;
    }

    //========= Method to create and return a hashtable =======
    public Hashtable createHashtable(int size) throws Exception {
        //Catch a pointless hashmap
        if(size < 2){
            throw new Exception("Please select a larger size for your Hashmap");
        }
        int [] buckets = new int[size];
        for(int i = 0; i < buckets.length; i++){
            // populate indexs with linked list here
        }
        // Maybe write a for loop to populate each index with an arraylist
        Hashtable hashtable = new Hashtable(buckets);
        return hashtable;
    }

    //========== Hash and Add ====================
    public void add(String key, String value){
        int hash = hash(key);
        //buckets[hash]

    }

    //========== Hash ============================
    public int hash(String key){
        int bucket = 0;
        //allow room to attempt to concatenate most ascii values to the end of the int
        for(int i = 0; i < key.length(); i++){
            bucket = bucket * 100 + key.charAt(i);
        }

        bucket = bucket % buckets.length;
        return bucket;
    }

    //=========== toString ========================
    public String toString(){
        String theString = "[\n";

        for(int i = 0; i < buckets.length; i++){
           // theString += i + ": [";
            theString += String.format("%d: [%d]\n", i, buckets[i]);
        }

        theString += "]";
        return theString;
    }

    //=========== Getters and Setters ============


    public int[] getBuckets() {
        return buckets;
    }

    public void setBuckets(int[] buckets) {
        this.buckets = buckets;
    }
}
