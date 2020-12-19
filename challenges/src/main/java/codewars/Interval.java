package codewars;
import java.util.Arrays;


public class Interval {
    public static int sumIntervals(int[][] intervals) {
        if (intervals == null || intervals.length < 1) return 0;

        int[] low = new int[intervals.length];
        int[] high = new int[intervals.length];
        int returnInt = 0;

        for (int i = 0; i < intervals.length; i++) { //separate each array index into separate arrays
            if(intervals[i].length > 0) {            // catch a empty array in matrix
                low[i] = intervals[i][0];
                high[i] = intervals[i][1];
            }
        }

        low = mergeSort(low);      // sort the arrays
        high = mergeSort(high);

        for (int i = 0; i < low.length; i++) {   // work through sorted arrays
            int start = low[i], end = high[i];   // grab a pair of numbers

            while (i < low.length - 1 && low[i + 1] <= high[i]) {  // check if next int in sorted low array is less then high array int
                end = high[i+1];                              // make end equal to next int in high array merging the overlapping pairs
                i++;
            }
            returnInt += end - start;
        }
        return returnInt;
    }

    public static int[] mergeSort(int[] arr){
        int n = arr.length;

        if( n > 1){
            int mid = n/2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid , arr.length);

            mergeSort(left);
            mergeSort(right);
            arr = merge(left, right, arr);
        }
        return arr;
    }

    //==================== Merge ===================
    public static int[] merge(int[] left, int[] right, int[] arr){
        int i = 0,j = 0,k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        if(i == left.length){
            while(j < right.length){
                arr[k] = right[j];
                j++;
                k++;
            }
        }else{
            while (i < left.length){
                arr[k] = left[i];
                i++;
                k++;
            }
        }
        return arr;
    }
}

//================== Zombie code(mostly works but went a different direction instead of completing)
//=================================
//{1, 4}, {7, 10}, {3, 5}
//        HashMap<Integer, Integer> sets = new HashMap();
//        boolean remove, add;
//        int removeKey = 0, space = 0;
//        // 1,4
//        for (int[] arr : intervals) {
//            System.out.println("*****Array*** " + arr[0] + "  0 " + arr[1]);
//            remove = false;
//            add = true;
//            if (sets.isEmpty()) {
//                sets.put(arr[0], arr[1]);
//                System.out.println(arr[0] + " 1  " + arr[1]);
//            } else {
//                System.out.println("**************************");
//                for (Map.Entry a : sets.entrySet()) {
//                    if (arr[0] > (Integer) a.getKey() && arr[1] < (Integer) a.getValue()) {
//                        add = false;
//                        break;
//                    }
////                    System.out.println("key " + a.getKey());
////                    System.out.println("arr[0] " + arr[0]);
////                    System.out.println("value " + a.getValue());
////                    System.out.println("arr[1] " + arr[1]);
////
////{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}
//                    if (arr[0] < (Integer) a.getKey() && arr[1] > (Integer) a.getKey()) {
//                        sets.put(arr[0], (Integer) a.getValue());
//                        System.out.println(arr[0] + "  2  " + (Integer) a.getValue());
//                        remove = true;
//                        removeKey = (Integer) a.getKey();
//                    }
//                    if (arr[1] > (Integer) a.getValue() && arr[0] < (Integer) a.getValue()) {
//                        if (remove) {
//                            //System.out.println("!!! " + arr[0] + " !!! " + arr[1]);
//                            sets.put(arr[0], arr[1]);
//                            System.out.println(arr[0] + "  3  " + arr[1]);
//                        } else {
//                            sets.put((Integer) a.getKey(), arr[1]);
//                            System.out.println((Integer) a.getKey() + "  4  " + arr[1]);
//                            add = false;
//                        }
//                    }
//                    if (remove || !add) break;
//                }
//                if (remove) {
//                    System.out.println("Removing " + removeKey);
//                    sets.remove(removeKey);
//                } else if (add) {
//                    sets.put(arr[0], arr[1]);
//                    System.out.println(arr[0] + "  5  " + arr[1]);
//                }
//            }
//        }
//
//        for (Map.Entry set : sets.entrySet()) {
//
//        }
//
//        for (Map.Entry set : sets.entrySet()) {
//            System.out.println("key " + (Integer) set.getKey() + " value " + set.getValue());
//            space += (Integer) set.getValue() - (Integer) set.getKey();
//            System.out.println(space);
//        }
//        return space;
//    }



//    //=================== works just needs to be finished================
//    int space = 0;
//      for(int i = 0; i < intervals.length; i++){
//        System.out.println("hello");
//        space += intervals[i][1] - intervals[i][0];
//        for(int j = i - 1; j>=0; j--){
//        if(intervals[i][0] < intervals[j][1] && intervals[i][0] > intervals[j][0]){
//        space -= intervals[i][1] - intervals[i][0];
//        space += intervals[i][1] - intervals[j][1];
//        }
//        if(intervals[i][0] < intervals[j][0] && intervals[j][1] > intervals[i][0]){
//        space
//        }
//        }
//        }
//        return space;
//        //============================================================================
//        }