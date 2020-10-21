package utilities;

import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] arr){
        int[] n = new int[arr.length];

        if( n.length > 1){
            int mid = n.length/2; // Got help from Jack Nelson with the awesome copy of range :)
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid , arr.length);

            mergeSort(left);
            mergeSort(right);
            arr = merge(left, right, arr);
        }
        return arr;
    }

    //==================== Merge ===================
    public int[] merge(int[] left, int[] right, int[] arr){
        int i = 0;
        int j = 0;
        int k = 0;

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
