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
public String doMath(String str){
    boolean newNum = true;
    int multi = -1, div = -1;

    //----------------- Multiplication and division --------------------
    while(str.contains("*") || str.contains("/")){
        if(str.contains("*")) multi = str.indexOf("*");
        if (str.contains("/")) div = str.indexOf("/");

        if(multi < div && multi != -1){ //----------- Process multiplication
            int i = multi - 1, leftStart = 0, endStart = 0, rightEnd = 0;
            while(i > 0){ //-------------------------- Get number to left
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

            while(i < str.length() - 1){ //------------------- Get number to right
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
            //----------- Do Math and remake string
            double total = left * right;
            String tempStr = "";
            tempStr = str.substring(0, leftStart - 1);
            tempStr += total;
            tempStr += str.substring(rightEnd + 1, str.length() - 1);
            str = tempStr;

        }else{
            //-------------- Process division ------------------------
            int i = div - 1, leftStart = 0, endStart = 0, rightEnd = 0;
            while(i > 0){ //------------------- Get number to left
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
            i = div + 1;
            while(i < str.length() - 1){ //---------- Get number to right
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
            //----------- Do math and remake string
            double total = left / right;
            String tempStr = "";
            tempStr = str.substring(0, leftStart - 1);
            tempStr += total;
            tempStr += str.substring(rightEnd + 1, str.length() - 1);
            str = tempStr;
        }
    }//-------- end of * / while

    //2 /2+3 * 4.75- -6
    // 1+14.24- -6
    //------------------------- addition and subtraction --------------------
    int i = 0, start = 0, end = 0;
    double numOne = 0, numTwo = 0;
    boolean isMinus = false, add = true, first = true;

    while(i < str.length()){
        if(first) {
            if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
                if (newNum) start = i;
                isMinus = true;
                end = i;
            } else {
                if (str.charAt(i) == ' ') i++;
                if (str.charAt(i) != '+') add = false;
                if (str.charAt(i + 1) == ' ') i++;
                numOne = Double.parseDouble(str.substring(start, end));
                first = false;
                newNum = true;
                isMinus = false;
            }
            i++;
        }else{ //---------- get second number

            if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
                if (newNum) start = i;
                isMinus = true;
                end = i;
                i++;
            } else {
                if (str.charAt(i) == ' ') i++;
                if (str.charAt(i) != '+') add = false;
                numTwo = Double.parseDouble(str.substring(start, end));
            }
        }
        // want to store result of math to be used as first number second time through.... this should be done recursively
    }//---------- end of = - while



    return str;
}//----------------------------- End of doMath

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

//========================================
//    StringBuilder sb = new StringBuilder();
//    1-1    // 0
//    1 -1   // 0
//ArrayList<Character> arr = new ArrayList(Collections.singleton(str.toCharArray()));
//ArrayList<String> arr = new ArrayList<>();
// 2 /2+3 * 4.75- -6

//            sb.append(str, 0, leftStart - 1);
//            sb.append(total);
//            sb.append(str,rightEnd + 1, str.length() -1);
//            str = sb.toString();

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