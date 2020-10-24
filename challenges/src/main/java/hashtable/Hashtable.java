package hashtable;

public class Hashtable {

    //========= Hashmap constructor ================

    int [] buckets = new int[1];

    public Hashtable(int[] buckets) {
        this.buckets = buckets;
    }

    int [] test = new int[20];

    Hashtable testHash = new Hashtable(test);


    //    public void Hashmap(int size) throws Exception {
//        //Catch a pointless hashmap
//        if(size < 2){
//            throw new Exception("Please select a larger size for your Hashmap");
//        }
//
//        int [] buckets = new int[size];
//    }

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



}
