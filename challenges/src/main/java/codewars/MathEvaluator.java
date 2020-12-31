package codewars;

import java.util.ArrayList;
import java.util.Collections;

public class MathEvaluator {
    //2 / (2 + 3) * 4.33 - -6
    //12* 123
    //2 /2+3 * 4.75- -6
    public double calculate(String expression) {
        if(expression.length() < 3) return Double.parseDouble(expression);
        makeList(expression);
        return 0.0;
    }//---------- end of main method
    /*parens algo--------------------------------------------
    get index of last ( and first )
    process math from first +1 to last -1 and save value in a double var
    if last index > 0 split the string at last index
    += double to string saved in var to the end of first string
    remove index 0 - (first - last) from second string
    check if last char in first string is -
        if it is trim - from end
        multiply double var by -1
    combine strings
    repeat recursively

1-1    // 0
1 -1   // 0
1- 1   // 0
1 - 1  // 0
1- -1  // 2
1 - -1 // 2

6 + -(4)   // 2
6 + -( -4) // 10
    */
    //================= new helpers process string and then parens
public double doMath(String str){
//    1-1    // 0
//    1 -1   // 0
//ArrayList<Character> arr = new ArrayList(Collections.singleton(str.toCharArray()));
    ArrayList<String> arr = new ArrayList<>();
    // 2 /2+3 * 4.75- -6
    boolean wasDigit = false, newNum = true;
    int multi = -1, div = -1;

    while(str.contains("*") || str.contains("/")){
        if(str.contains("*")) multi = str.indexOf("*");
        if (str.contains("/")) div = str.indexOf("/");

        // 2 /2+3 * 4.75- -6
        if(multi < div && multi != -1){
            int i = multi - 1, leftStart = 0, endStart = 0, rightEnd = 0;
            while(i > 0){ //get number to left of *
                if(str.charAt(i) == ' ' && i == multi - 1) i--;
                if(Character.isDigit(str.charAt(i))) {
                    if (newNum) endStart = i;
                    leftStart = i;
                    newNum = false;
                }else if(str.charAt(i) == '-'){
                    leftStart = i;
                    break;
                }else break;
            }
            double left = Double.parseDouble(str.substring(leftStart, endStart));
            newNum = true;
            i = multi + 1;
            //=====================================================================
            while(i < str.length() - 1){ //get number to right of *

                if(str.charAt(i) == ' ' && i == multi + 1) i++;
                if(Character.isDigit(str.charAt(i))) {
                    if (newNum) endStart = i;
                    rightEnd = i;
                    newNum = false;
                }else if(str.charAt(i) == '-' && newNum){
                    endStart = i;
                    newNum = false;
                }else break;
            }
            double right = Double.parseDouble(str.substring(endStart, rightEnd));
            newNum = true;
//do math and remake string
            double total = left * right;

        }else{

        }
    }

    // while str contains * or / get index of each compare index and process

//    for(int i = 1; i < str.length() - 1; i++){
//        if(Character.isDigit(str.charAt(i))){
//            if(newNum) start = i;
//            end = i;
//            newNum = false;
//            wasDigit = true;
//        }else if(!newNum){
//            //add str start - str end to arr
//        }
//
//    }

    return 0.0;
}
//================= Helpers ===========================================
    public ArrayList<String> makeList(String str){
        ArrayList<String> list = new ArrayList<>();
        String temp = "";
        int start = 0, end = 0, i = 0;

        //for(int i = 0; i < str.length(); i++){
        do{
            System.out.println("char " + str.charAt(i));
            if(str.charAt(i) == ('-')){//---------minus check
                System.out.println("1");
                if(i==0){
                    System.out.println("2");
                    start = i++;
                }else if(str.charAt(i-1) == (' ')){
                    System.out.println("3");
                    start = i++; //do i need to catch a blank at the start of string
                }
            }//------------------------------end of minus check
            System.out.println("4");
            if((str.codePointAt(i) > 47 && str.codePointAt(i) < 58) || str.codePointAt(i) == 46){ //unicode 0-9 .
                System.out.println("5");
                end = i;
            }else{
                System.out.println("6");
                System.out.println("----> " + buildString(str, start, end));
                list.add(buildString(str, start, end));
                start = i;
                end = i;
                if(str.charAt(i) != ' ') {
                    list.add(buildString(str, start++, end++));
                }
            }//----------------------------------- end of multidigit check
            System.out.println("7");
            i++;
        } while(i < str.length());//------------end of for
        System.out.println("8");
        list.add(buildString(str, start, end));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        return list;
    }//------------------------------------------------- end of makeList

    public String buildString(String in, int start, int end){
        String out = "";
        //if(start == end) return String.valueOf(in.charAt(start));
        for(int i = start; i <= end; i++) out += in.charAt(i);
        return out;
    }

}

//============ zombie code ==================================
//         if(str.charAt(i-1).equals(' ') || i == 0){ // - is for a negative number
//           start = i;
//           i++;
//          }
//else{
//           temp = buildString(expression, start, end);
// //           for(int k = start; k < end; k++){
// //             temp += str.charAt(k);
// //           }
//           list.set(j, temp);
//           j++;
//           start = i +1;
//           end = i + 1;
//         }

//         for(int k = start; k < end; k++){
//           temp += str.charAt(k);
//         }