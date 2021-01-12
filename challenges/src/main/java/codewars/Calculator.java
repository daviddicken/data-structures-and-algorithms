package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Calculator {
    public static Double evaluate(String expression) {
        Date date = new Date();
        System.out.println("Start " + date);
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(expression.split(" ")));
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).equals("/")){
                arr.set(i+1, String.valueOf(Double.parseDouble(arr.get(i-1)) / Double.parseDouble(arr.get(i+1))));
                arr.remove(i-1);
                arr.remove(i-1);
                --i;
            }
            if(arr.get(i).equals("*")){
                arr.set(i+1, String.valueOf(Double.parseDouble(arr.get(i-1)) * Double.parseDouble(arr.get(i+1))));
                arr.remove(i-1);
                arr.remove(i-1);
                --i;
            }
        }
        double total = Double.parseDouble(arr.get(0));

        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i).equals("+")) total += Double.parseDouble(arr.get(i+1));
            if(arr.get(i).equals("-")) total -= Double.parseDouble(arr.get(i+1));
            i++;
        }
        return total;
    }
}
