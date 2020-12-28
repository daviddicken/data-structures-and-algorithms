package codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Random;
import java.util.*;
import java.util.stream.Collectors;

public class RangeExtractionTest {

    @Test
    public void test_BasicTests() {
        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", RangeExtraction.rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));

        assertEquals("-3--1,2,10,15,16,18-20", RangeExtraction.rangeExtraction(new int[] {-3,-2,-1,2,10,15,16,18,19,20}));
    }

    private String rangeExtraction(int[] arr) {

        List<String> ans = new ArrayList<String>();
        int[] rngInd = new int[] {-1,-1};
        int n1, n2;

        for (int i = 1 ; i <= arr.length ; i++) {

            n1 = arr[i-1];
            n2 = (i == arr.length) ? n1+2 : arr[i];

            if (n1+1 == n2) {
                if (rngInd[0] == -1)  rngInd = new int[] {i-1,i};
                else                  rngInd[1] = i;

            } else {
                if (rngInd[0] != -1) {
                    n1 = arr[rngInd[0]];
                    n2 = arr[rngInd[1]];
                    if (rngInd[0] + 1 == rngInd[1]) {
                        ans.add(String.valueOf(n1));
                        ans.add(String.valueOf(n2));
                    } else {
                        ans.add( Arrays.asList(n1, n2)
                                .stream()
                                .map( n -> String.valueOf(n) )
                                .collect(Collectors.joining("-")) );
                    }
                    rngInd = new int[] {-1,-1};

                } else {
                    ans.add(String.valueOf(n1));
                }
            }
        }

        return String.join(",", ans.toArray(new String[0]));
    }

    @Test
    public void test_RandomTests() {

        Random rnd = new Random();

        for (int a = 0 ; a < 30 ; a++) {

            int n   = rnd.nextInt(50) - 50;
            int len = rnd.nextInt(20) + 15;
            int[] arr = new int[len];
            for (int i = 0 ; i < len ; i++) {
                arr[i] = n;
                n += rnd.nextInt(3) + 1;
            }
            // System.out.println(Arrays.toString(arr));
            assertEquals("It should work for random inputs too",
                    rangeExtraction(arr),
                    RangeExtraction.rangeExtraction(Arrays.copyOf(arr, len)));
        }
    }
}