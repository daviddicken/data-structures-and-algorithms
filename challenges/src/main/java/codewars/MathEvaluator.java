package codewars;

public class MathEvaluator {
    public double calculate(String expression) {
        expression = expression.replaceAll("\\s", "");
        if (expression.length() < 3) return Double.parseDouble(expression);
        while (expression.contains("(")) expression = pullParens(expression);
        expression = convertNeg(expression);
        while (!isNum(expression)) expression = doMath(expression);
        return Double.parseDouble(expression);
    }

    //-------------- Helpers ---------------------------------
    public String convertNeg(String str) {
        boolean wasDigit = true;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '-') {
                if (str.charAt(i + 1) == '-') {
                    if (i == 0) str = str.substring(i + 2);
                    if (i > 0 && wasDigit) str = str.substring(0, i) + "+" + str.substring(i + 2);
                    if (i > 0 && !wasDigit) str = str.substring(0, i) + str.substring(i + 2);
                } else if (str.charAt(i + 1) == ' ' && i + 2 < str.length()) {
                    if (str.charAt(i + 2) == '-') {
                        str = str.substring(0, i) + "+" + str.substring(i + 3);
                    } else {
                        i = i + 2;
                    }
                }
            }
            if (str.charAt(i) != ' ') {
                if (isNum(String.valueOf(str.charAt(i)))) {
                    wasDigit = true;
                } else {
                    wasDigit = false;
                }
            }
        }
        return str;
    }

    //--------------------------------------
    public String pullParens(String str) {

        if (!str.contains("(")) {
            return doMath(str);
        }
        int counter = 1, i = str.indexOf('('), start = i;

        while (counter > 0) {
            i++;
            if (str.charAt(i) == '(') counter++;
            if (str.charAt(i) == ')') counter--;
        }
        int end = i;

        String temp = pullParens(str.substring(str.indexOf('(') + 1, end));
        if (temp.contains("(")) temp = pullParens(temp);
        temp = doMath(temp);

        if (start == 0) {
            return temp + str.substring(end + 1);
        }else if (str.charAt(start - 1) == '-')
            if (start > 2) {
                int j = start - 2;
                if (str.charAt(j) == ' ') j--;
                if (Character.isDigit(str.charAt(j))) {
                }
            } else {
                if (isNum(temp)) {
                    temp = String.valueOf(Double.parseDouble(temp) * -1);
                    start--;
                }
            }

        if (end == str.length() - 1) return str.substring(0, start) + temp;
        return str.substring(0, start) + temp + str.substring(end + 1);
    }

    //----------------------------------
    public String doMath(String str) {
        boolean newNum = true;
        int multi = -1, div = -1;

        //----------------- Multiplication and division --------------------
        while (str.contains("*") || str.contains("/")) {
            if (str.contains("*")) multi = str.indexOf("*");
            if (str.contains("/")) div = str.indexOf("/");
            str = mulDiv(str, multi, div);
            multi = -1;
            div = -1;
        }

        //------------------------- addition and subtraction --------------------
        int i = 0, start = 0, end = 0;
        double numOne = 0, numTwo, total;
        boolean isMinus = false, add = true, first = true;
        while (i < str.length()) {
            if (first) {
                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
                    if (newNum) start = i; // 0
                    newNum = false;
                    isMinus = true;
                    end = i; // 0 1 2 3

                } else {
                    if (isNum(str)) return str;
                    if (str.charAt(i) == ' ') i++;
                    if (str.charAt(i) != '+') add = false;
                    if (str.charAt(i + 1) == ' ') i++;
                    if (start == end) {
                        numOne = Character.getNumericValue(str.charAt(end));
                    } else {
                        numOne = Double.parseDouble(str.substring(start, end + 1));
                    }
                    first = false;
                    newNum = true;
                    isMinus = false;
                }
                i++;
            } else { //---------- get second number

                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
                    if (newNum) start = i;
                    newNum = false;
                    isMinus = true;
                    end = i;
                    i++;
                } else {
                    break;
                }
            }
        }

        if (start == end) {
            numTwo = Character.getNumericValue(str.charAt(end));
        } else {
            numTwo = Double.parseDouble(str.substring(start, end + 1));
        }
        if (add) {
            total = numOne + numTwo;
        } else {
            total = numOne - numTwo;
        }
        if (end == str.length() - 1) return String.valueOf(total);
        str = total + str.substring(end + 1);
        return str;
    }

    //-------------------------------------------------------
    public String mulDiv(String str, int multi, int div) {
        boolean newNum = true;
        double left, right;
        if ((multi < div && multi > -1) || div == -1) {
            int i = multi - 1, leftStart = 0, endStart = 0, rightEnd = 0;
            while (i >= 0) { //---------- get left number
                if (str.charAt(i) == ' ' && i == multi - 1) i--;
                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                    if (newNum) endStart = i;
                    leftStart = i;
                    newNum = false;
                } else if (str.charAt(i) == '-') {
                    leftStart = i;
                    break;
                } else break;
                i--;
            }
            if (leftStart == endStart) {
                left = Character.getNumericValue(str.charAt(endStart));
            } else {
                left = Double.parseDouble(str.substring(leftStart, endStart + 1));
            }
            newNum = true;
            i = multi + 1;

            while (i < str.length()) { //------------------- Get number to right
                if (str.charAt(i) == ' ' && i == multi + 1) i++;
                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                    if (newNum) endStart = i;
                    rightEnd = i;
                    newNum = false;
                } else if (str.charAt(i) == '-' && newNum) {
                    endStart = i;
                    newNum = false;
                } else break;
                i++;
            }

            if (endStart == rightEnd) {
                right = Character.getNumericValue(str.charAt(rightEnd));
            } else {
                right = Double.parseDouble(str.substring(endStart, rightEnd + 1));
            }
            double total = left * right;
            if (rightEnd < str.length() - 1) {
                if (leftStart == 0) {
                    str = total + str.substring(rightEnd + 1);
                    if (!str.contains("(") && str.charAt(str.length() - 1) == ')') str = str.substring(0, str.length() - 1);
                } else {
                    str = str.substring(0, leftStart) + total + str.substring(rightEnd + 1);
                }
            } else {
                str = str.substring(0, leftStart) + total;
            }
        } else {
            //====================== DIVISION ========================================
            int i = div - 1, leftStart = 0, endStart = 0, rightEnd = 0;
            while (i >= 0) { //------------------- Get number to left
                if (str.charAt(i) == ' ' && i == div - 1) i--;
                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                    if (newNum) endStart = i;
                    leftStart = i;
                    newNum = false;
                } else if (str.charAt(i) == '-') {
                    leftStart = i;
                    break;
                } else break;
                i--;
            }
            if (leftStart == endStart) {
                left = Character.getNumericValue(str.charAt(endStart));
            } else {
                left = Double.parseDouble(str.substring(leftStart, endStart + 1));
            }

            //=========================== RIGHT NUMBER ========================
            newNum = true;
            i = div + 1;
            while (i < str.length()) { //---------- Get number to right
                if (str.charAt(i) == ' ' && i == div + 1) i++;
                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                    if (newNum) endStart = i;
                    rightEnd = i;
                    newNum = false;
                } else if (str.charAt(i) == '-' && newNum) {
                    endStart = i; // 8
                    newNum = false;
                } else break;
                i++;
            }

            if (endStart == rightEnd) {
                right = Character.getNumericValue(str.charAt(rightEnd));
            } else {
                right = Double.parseDouble(str.substring(endStart, rightEnd + 1));
            }
            double total = left / right;

            if (rightEnd < str.length() - 1) {
                if (leftStart == 0) {
                    str = total + str.substring(rightEnd + 1);
                } else {
                    str = str.substring(0, leftStart) + total + str.substring(rightEnd + 1);
                }
            } else {
                str = str.substring(0, leftStart) + total;
            }
        }
        return str;
    }

    //-----------------------------------
    public static boolean isNum(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}


    //==============================================
//    public double calculate(String expression) {
//        System.out.println("Original String " + expression);
//        expression = expression.replaceAll("\\s", "");
//        if (expression.length() < 3) return Double.parseDouble(expression);
//        while (expression.contains("(")) {
//
//            //System.out.println("EXPRESSION BEFORE " + expression);
//            expression = pullParens(expression);
//            // System.out.println("EXPRESSION AFTER " + expression);
//        }
//        System.out.println("String before convert " + expression);
//        expression = convertNeg(expression);
//        System.out.println("String after convert " + expression);
//
//        while (!isNum(expression)){
//            //System.out.println(expression + " Is not a number sending it back");
//            System.out.println("String in num test before doMath " + expression);
//            expression = doMath(expression);
//            System.out.println("String in num test after doMath " + expression);
//        }
//        // System.out.println("final return " + expression);
//        System.out.println("Returning " + expression);
//        return Double.parseDouble(expression);
//    }
//// 0123456
//// 4-3-4- 6
//
//    //-------------- Helpers ---------------------------------
//    // 12* 123/--3.0
//
//    public String convertNeg(String str){
//        boolean wasDigit = true;
//        for(int i = 0; i < str.length() - 1; i++){
//
//            if(str.charAt(i) == '-'){
//                if(str.charAt(i+1) == '-'){
//                    if(i == 0) str = str.substring(i+2);
//                    if(i > 0 && wasDigit) str = str.substring(0, i) + "+" + str.substring(i+2);
//                    if(i > 0 && !wasDigit) str = str.substring(0, i) + str.substring(i+2);
//                }else if (str.charAt(i+1) == ' ' && i + 2 < str.length()){
//                    if(str.charAt(i+2) == '-'){
//                        str = str.substring(0, i) + "+" + str.substring(i+3);
//                    }else{
//                        i = i + 2;
//                    }
//                }
//            }
//            if(str.charAt(i) != ' '){
//                if(isNum(String.valueOf(str.charAt(i)))){
//                    wasDigit = true;
//                }else{
//                    wasDigit = false;
//                }
//            }
//        }
//        return str;
//    }
//
//    //-----------------
//    public String pullParens(String str) {
//
//        if(!str.contains("(")){
//            return doMath(str);
//        }
//        int counter = 1, i = str.indexOf('('), start = i;
//
//        while(counter > 0){
//            i++;
//            if(str.charAt(i) == '(') counter++;
//            if(str.charAt(i) == ')') counter--;
//        }
//        int end = i;
//        String temp = pullParens(str.substring(str.indexOf('(')+1,end));
//        temp = doMath(temp);
//        System.out.println("String temp after doMath " + temp);
//
//        if(start == 0){
//            return temp + str.substring(end + 1);
//
//        }else if(str.charAt(start - 1) == '-'){ // don't think i need to check start > 0 here ((80 -(19)))
//
//            System.out.println("String.valueOf before " + temp);
//            if(start > 2){
//                int j = start - 2;
//                if(str.charAt(j) == ' ') j--;
//                if(Character.isDigit(str.charAt(j))){
//                    System.out.println("entered if");
//                }
//            }else{
//                if(isNum(temp)){
//                    temp = String.valueOf(Double.parseDouble(temp) * -1);
//                    start--;
//                }
//            }
//
////       if(Double.parseDouble(temp < 0) && )
////           temp = String.valueOf(Double.parseDouble(temp) * -1);
//            //         System.out.println("String.valueOf temp after " + temp);
//            //   start--;
//        }
//
//        if(end == str.length() -1){
//            //          System.out.println("String leaving pullParens if2 " + str.substring(0, start) + temp);
//            return str.substring(0, start) + temp;
//        }
//        //     System.out.println("String leaving pullParens if3 " + str.substring(0, start) + temp + str.substring(end + 1));
//        return str.substring(0, start) + temp + str.substring(end + 1);
//
//    }
//
//    //==================================== Do Math
//    public String doMath(String str) {
//        //   System.out.println("String entering doMath " + str);
//        boolean newNum = true;
//        int multi = -1, div = -1;
//
//        //----------------- Multiplication and division --------------------
//        while (str.contains("*") || str.contains("/")) {
//            //         System.out.println("String entering doMath while " + str);
//            if (str.contains("*")) multi = str.indexOf("*");
//            if (str.contains("/")) div = str.indexOf("/");
//            str = mulDiv(str, multi, div);
//            //     System.out.println("String back from mulDiv in while " + str);
//            multi = -1;
//            div = -1;
//        }
//
////         if(isNum(str)){
////           System.out.println("Yes");
////            System.out.println("sending from doMath " + str);
////          return str;
////           }
//        //    System.out.println("string entering addition section " + str);
//        //------------------------- addition and subtraction --------------------
//        int i = 0, start = 0, end = 0;
//        double numOne = 0, numTwo, total;
//        boolean isMinus = false, add = true, first = true;
//        while (i < str.length()) {
//
//            if (first) {
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
//                    if (newNum) start = i; // 0
//                    newNum = false;
//                    isMinus = true;
//                    end = i; // 0 1 2 3
//
//                } else {
//                    System.out.println("str--- " + isNum(str));
//                    System.out.println("str size " + str.length());
//                    if(isNum(str)){
//                        System.out.println("string in in isNum " + str);
//                        return str;
//                    }
//                    System.out.println("str.... " + str);
//                    if (str.charAt(i) == ' ') i++;
//                    if (str.charAt(i) != '+') add = false; //<-->
//                    //                     System.out.println("was it a + " + add);
//                    if (str.charAt(i + 1) == ' ') i++; //<----------------------
//                    if(start == end){
//                        numOne = Character.getNumericValue(str.charAt(end));
//                    }else {
//
//                        numOne = Double.parseDouble(str.substring(start, end + 1));
//                    }
//                    first = false;
//                    newNum = true;
//                    isMinus = false;
//                }
//                i++;
//            } else { //---------- get second number
//
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
//                    if (newNum) start = i; //6
//                    newNum = false;
//                    isMinus = true;
//                    end = i; //6 7 8 9
//                    i++;
//                } else {
//                    break;
//                }
//            }
//        }//---------- end of = - while
//        if(start == end) {
//            numTwo = Character.getNumericValue(str.charAt(end));
//        }else{
//            numTwo = Double.parseDouble(str.substring(start, end + 1));
//            //         System.out.println("numTwo " + numTwo);
//        }
//        if (add) {
//            total = numOne + numTwo;
//        } else {
//            total = numOne - numTwo;
//        }
//        if (end == str.length() - 1){
//            //              System.out.println("String leaving doMath " + String.valueOf(total));
//            return String.valueOf(total);
//        }
//        str = total + str.substring(end + 1);
////      System.out.println("String leaving doMath " + str);
//        return str;
//    }
//
//    //=============== Multiply and Divide =================
//    public String mulDiv(String str, int multi, int div){
//        //     System.out.println("String entering mulDiv " + str);
//        boolean newNum = true;
//        double left, right;
//
//
////========================== MULTIPLY ==============================
//        //==========================================================
//
//        if ((multi < div && multi > -1) || div == -1){
//// System.out.println("String entering multiply " + str);
//            int i = multi - 1, leftStart = 0, endStart = 0, rightEnd = 0;
//            while (i >= 0) { //-------------------------- Get number to left
//                if (str.charAt(i) == ' ' && i == multi - 1) i--;
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
//                    if (newNum) endStart = i; // 1
//                    leftStart = i;   // 1 0
//                    newNum = false;
//                } else if (str.charAt(i) == '-') {
//                    leftStart = i;
//                    break;
//                } else break;
//                i--;
//            }
//            if(leftStart == endStart){
//                left = Character.getNumericValue(str.charAt(endStart));
//            }else {
//                left = Double.parseDouble(str.substring(leftStart, endStart + 1));
//            }
//            newNum = true;
//            i = multi + 1;
//
////========================================= RIGHT NUMBER ====================================================
//            while (i < str.length()) { //------------------- Get number to right 3 * 4.75
//                if (str.charAt(i) == ' ' && i == multi + 1) i++;
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
//                    if (newNum) endStart = i;
//                    rightEnd = i;
//                    newNum = false;
//                } else if (str.charAt(i) == '-' && newNum) {
//                    endStart = i;
//                    newNum = false;
//                } else break;
//                i++;
//            }
//
//            if(endStart == rightEnd){
//                right = Character.getNumericValue(str.charAt(rightEnd));
//            }else {
//                right = Double.parseDouble(str.substring(endStart, rightEnd + 1));
//            }
//            //----------- Do Math and remake string
//            double total = left * right;
//            System.out.println("STRING!! " + str);
//            System.out.println(total);
//            //-------------------------------
//            if(rightEnd < str.length() - 1) {
//                if(leftStart == 0){
//                    str = total + str.substring(rightEnd + 1, str.length() - 1);//<------
//                    System.out.println("STRING2!! " + str);
//
//                }else {
//                    str = str.substring(0, leftStart) + total + str.substring(rightEnd + 1);
//                }
//            }else{
//                str = str.substring(0, leftStart) + total;
//            }
////          System.out.println("String leaving multiply " + str);
//
//        } else {
//            //====================== DIVISION ========================================
//            //======================================================================= 2.33 / 6.4*4 - -6  i=43
//            System.out.println("String entering Division " + str);
//            int i = div - 1, leftStart = 0, endStart = 0, rightEnd = 0;
//            while (i >= 0) { //------------------- Get number to left
//                if (str.charAt(i) == ' ' && i == div - 1) i--;
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
//                    if (newNum) endStart = i;
//                    leftStart = i;
//                    newNum = false;
//                } else if (str.charAt(i) == '-') {
//                    leftStart = i;
//                    break;
//                } else break;
//                i--;
//            }
//            System.out.println("leftStart " + leftStart + " endStart " + endStart);
//            if(leftStart == endStart) {
//                left = Character.getNumericValue(str.charAt(endStart));
//            }else{
//                left = Double.parseDouble(str.substring(leftStart, endStart + 1));//<--->
//            }
//
//            //=========================== RIGHT NUMBER ========================
//            //================================================================= 1476.03/--3.0
//            newNum = true;
//            i = div + 1;
//            while (i < str.length()) { //---------- Get number to right
////                System.out.println("getting right number");
//                if (str.charAt(i) == ' ' && i == div + 1) i++;
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
//                    if (newNum) endStart = i;
//                    rightEnd = i;
//                    newNum = false;
//                } else if (str.charAt(i) == '-' && newNum) {
////                                   } else if (str.charAt(i) == '-' && newNum) { %%%
//
//                    endStart = i; // 8
//                    newNum = false;
//                } else break;
//                i++;
//            }
//            System.out.println("string " + str);
//            System.out.println("endStart " + endStart + " rightEnd " + rightEnd);
//
//            if(endStart == rightEnd){
//                right = Character.getNumericValue(str.charAt(rightEnd));
//            }else {
//                right = Double.parseDouble(str.substring(endStart, rightEnd + 1)); //  <----->
//            }
//            //----------- Do math and remake string
//            double total = left / right;
//
////           System.out.println("TOTAL*** " + total);
////=======================================================================   MATH
//            if(rightEnd < str.length() - 1) {
//                if(leftStart == 0){
//                    str = total + str.substring(rightEnd + 1);
//                }else {
//                    str = str.substring(0, leftStart) + total + str.substring(rightEnd + 1);
//                }
//            }else{
//                str = str.substring(0, leftStart) + total;
//            }
////          System.out.println("String leaving Division " + str);
//        }
//        //---------------------------
//        //     System.out.println("String leaving muldiv " + str);
//        return str;
//    }
//
//    //--------- Addition and Subtraction -------
//    public static String subAdd(String str){
//        //     System.out.println("String entering subAdd method " + str);
//        int i = 0, start = 0, end = 0;
//        double numOne = 0, numTwo, total;
//        boolean isMinus = false, add = true, first = true, newNum = true;
//
//        while (i < str.length()) {
//            if (first) {
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
//                    if (newNum) start = i;
//                    isMinus = true;
//                    end = i;
//                    newNum = false;
//                } else {
//                    if (str.charAt(i) == ' ') i++;
//                    if (str.charAt(i) != '+') add = false;
//                    if (str.charAt(i + 1) == ' ') i++;
//                    numOne = Double.parseDouble(str.substring(start, end));
//                    first = false;
//                    newNum = true;
//                    isMinus = false;
//                }
//                i++;
//            } else { //---------- get second number
//
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
//                    if (newNum) start = i;
//                    newNum = false;
//                    isMinus = true;
//                    end = i;
//                    i++;
//                } else {
//                    break;
//                }
//            }
//        }//---------- end of = - while
//        numTwo = Double.parseDouble(str.substring(start, end));
//        if (add) {
//            total = numOne + numTwo;
//        } else {
//            total = numOne - numTwo;
//        }
//        if (end == str.length() - 1) return String.valueOf(total);
//
//        //     System.out.println("String leaving subAdd method " + str);
//        return total + str.substring(end + 1);
//    }
//
//    //--------- isNum ---------------------------
//    public static boolean isNum(String str) {
//        //     System.out.println("Is " + str + " a number ");
//        return str.matches("-?\\d+(\\.\\d+)?");
//    }

    //===========================================
    //============================================
//    public double calculate(String expression) {
//        System.out.println("Original String " + expression);
//        if (expression.length() < 3) return Double.parseDouble(expression);
//        while (expression.contains("(")) {
//
//            //System.out.println("EXPRESSION BEFORE " + expression);
//            expression = pullParens(expression);
//            // System.out.println("EXPRESSION AFTER " + expression);
//        }
//
//        while (!isNum(expression)){
//            //System.out.println(expression + " Is not a number sending it back");
//            expression = doMath(expression);
//        }
//        // System.out.println("final return " + expression);
//        return Double.parseDouble(expression);
//    }
//
//    //-------------- Helpers ---------------------------------
//    public String pullParens(String str) {
//        //     public String pullParens(String str, int start, int end) {
//
//        //System.out.println("String entering pullParens " + str);
//
//        if(!str.contains("(")){
//            //     System.out.println("String sent to doMath from pullParens " + str);
//            return doMath(str);
//        }
//        int counter = 1, i = str.indexOf('('), start = i;
//
//        while(counter > 0){
//            i++;
//            if(str.charAt(i) == '(') counter++;
//            if(str.charAt(i) == ')') counter--;
//        }
//        int end = i;
//        String temp = pullParens(str.substring(str.indexOf('(')+1,end));
//        //    System.out.println("Start " + start);
//
//        if(start == 0){
//            //    System.out.println("String leaving pullParens if1 " + temp + str.substring(end + 1));
//            return temp + str.substring(end + 1);
//
//        }else if(str.charAt(start - 1) == '-'){ // don't think i need to check start > 0 here 80 -19.0 *33.25
////           int j = start -2;
////           while(j >= 0){
////             if(str.charAt(j) == ' ') j--;
////             if(isNum(String.valueOf(str.charAt(j)))){
////               if(Double.parseDouble(temp) < 0) temp = "+" + temp;
////               start--;
////               break;
////             }else{
////               temp = String.valueOf(Double.parseDouble(temp) * -1);
////               start--;
////             }
////             //j--;
////           }
//            //         System.out.println("String.valueOf before " + temp);
//            temp = String.valueOf(Double.parseDouble(temp) * -1);
//            //         System.out.println("String.valueOf temp after " + temp);
//            start--;
//        }
//
//        if(end == str.length() -1){
//            //          System.out.println("String leaving pullParens if2 " + str.substring(0, start) + temp);
//            return str.substring(0, start) + temp;
//        }
//        //     System.out.println("String leaving pullParens if3 " + str.substring(0, start) + temp + str.substring(end + 1));
//        return str.substring(0, start) + temp + str.substring(end + 1);
//
//    }
//
//    //==================================== Do Math
//    public String doMath(String str) {
//        //   System.out.println("String entering doMath " + str);
//        boolean newNum = true;
//        int multi = -1, div = -1;
//
//        //----------------- Multiplication and division --------------------
//        while (str.contains("*") || str.contains("/")) {
//            //         System.out.println("String entering doMath while " + str);
//            if (str.contains("*")) multi = str.indexOf("*");
//            if (str.contains("/")) div = str.indexOf("/");
//            str = mulDiv(str, multi, div);
//            //     System.out.println("String back from mulDiv in while " + str);
//            multi = -1;
//            div = -1;
//        }
//
////         if(isNum(str)){
////           System.out.println("Yes");
////            System.out.println("sending from doMath " + str);
////          return str;
////           }
//        //    System.out.println("string entering addition section " + str);
//        //------------------------- addition and subtraction --------------------
//        int i = 0, start = 0, end = 0;
//        double numOne = 0, numTwo, total;
//        boolean isMinus = false, add = true, first = true;
//        while (i < str.length()) {
//            if (first) {
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
//                    if (newNum) start = i; // 0
//                    newNum = false;
//                    isMinus = true;
//                    end = i; // 0 1 2 3
//
//                } else {
//                    if (str.charAt(i) == ' ') i++;
//                    if (str.charAt(i) != '+') add = false;
//                    //                     System.out.println("was it a + " + add);
//                    if (str.charAt(i + 1) == ' ') i++;
//                    if(start == end){
//                        numOne = Character.getNumericValue(str.charAt(end));
//                    }else {
//
//                        numOne = Double.parseDouble(str.substring(start, end + 1));
//                    }
//                    first = false;
//                    newNum = true;
//                    isMinus = false;
//                }
//                i++;
//            } else { //---------- get second number
//
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
//                    if (newNum) start = i; //6
//                    newNum = false;
//                    isMinus = true;
//                    end = i; //6 7 8 9
//                    i++;
//                } else {
//                    break;
//                }
//            }
//        }//---------- end of = - while
//        if(start == end) {
//            numTwo = Character.getNumericValue(str.charAt(end));
//        }else{
//            numTwo = Double.parseDouble(str.substring(start, end + 1));
//            //         System.out.println("numTwo " + numTwo);
//        }
//        if (add) {
//            total = numOne + numTwo;
//        } else {
//            total = numOne - numTwo;
//        }
//        if (end == str.length() - 1){
//            //              System.out.println("String leaving doMath " + String.valueOf(total));
//            return String.valueOf(total);
//        }
//        str = total + str.substring(end + 1);
////      System.out.println("String leaving doMath " + str);
//        return str;
//    }
//
//    //=============== Multiply and Divide =================
//    public String mulDiv(String str, int multi, int div){
//        //     System.out.println("String entering mulDiv " + str);
//        boolean newNum = true;
//        double left, right;
//
////========================== MULTIPLY ==============================
//        //==========================================================
//
//        if ((multi < div && multi > -1) || div == -1){
//// System.out.println("String entering multiply " + str);
//            int i = multi - 1, leftStart = 0, endStart = 0, rightEnd = 0;
//            while (i >= 0) { //-------------------------- Get number to left
//                if (str.charAt(i) == ' ' && i == multi - 1) i--;
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
//                    if (newNum) endStart = i; // 1
//                    leftStart = i;   // 1 0
//                    newNum = false;
//                } else if (str.charAt(i) == '-') {
//                    leftStart = i;
//                    break;
//                } else break;
//                i--;
//            }
//            if(leftStart == endStart){
//                left = Character.getNumericValue(str.charAt(endStart));
//            }else {
//                left = Double.parseDouble(str.substring(leftStart, endStart + 1));
//            }
//            newNum = true;
//            i = multi + 1;
//
////========================================= RIGHT NUMBER ====================================================
//            while (i < str.length()) { //------------------- Get number to right 3 * 4.75
//                if (str.charAt(i) == ' ' && i == multi + 1) i++;
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
//                    if (newNum) endStart = i;
//                    rightEnd = i;
//                    newNum = false;
//                } else if (str.charAt(i) == '-' && newNum) {
//                    endStart = i;
//                    newNum = false;
//                } else break;
//                i++;
//            }
//
//            if(endStart == rightEnd){
//                right = Character.getNumericValue(str.charAt(rightEnd));
//            }else {
//                right = Double.parseDouble(str.substring(endStart, rightEnd + 1));
//            }
//            //----------- Do Math and remake string
//            double total = left * right;
//            //-------------------------------
//            if(rightEnd < str.length() - 1) {
//                if(leftStart == 0){
//                    str = total + str.substring(rightEnd);
//                }else {
//                    str = str.substring(0, leftStart) + total + str.substring(rightEnd + 1);
//                }
//            }else{
//                str = str.substring(0, leftStart) + total;
//            }
////          System.out.println("String leaving multiply " + str);
//        } else {
//            //====================== DIVISION ========================================
//            //======================================================================= 2.33 / 6.4*4 - -6  i=43
//            //        System.out.println("String entering Division " + str);
//            int i = div - 1, leftStart = 0, endStart = 0, rightEnd = 0;
//            while (i >= 0) { //------------------- Get number to left
//                if (str.charAt(i) == ' ' && i == div - 1) i--;
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
//                    if (newNum) endStart = i;// 3
//                    leftStart = i;  //3210
//                    newNum = false;
//                } else if (str.charAt(i) == '-') {
//                    leftStart = i;
//                    break;
//                } else break;
//                i--;
//            }
//            if(leftStart == endStart) {
//                left = Character.getNumericValue(str.charAt(endStart));
//            }else{
//                left = Double.parseDouble(str.substring(leftStart, endStart + 1));//<--->
//
//            }
//
//            //=========================== RIGHT NUMBER ========================
//            //=================================================================
//            newNum = true;
//            i = div + 1;
//            while (i < str.length()) { //---------- Get number to right 2 /5.0 * 4.33 - -6
////                System.out.println("getting right number");
//                if (str.charAt(i) == ' ' && i == div + 1) i++;
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
//                    if (newNum) endStart = i;
//                    rightEnd = i;
//                    newNum = false;
//                } else if (str.charAt(i) == '-' && newNum) {
//                    endStart = i;
//                    newNum = false;
//                } else break;
//                i++;
//            }
//            if(endStart == rightEnd){
//                right = Character.getNumericValue(str.charAt(rightEnd));
//            }else {
//                right = Double.parseDouble(str.substring(endStart, rightEnd + 1)); //  <----->
//            }
//            //----------- Do math and remake string
//            double total = left / right;
//
////           System.out.println("TOTAL*** " + total);
////=======================================================================   MATH
//            if(rightEnd < str.length() - 1) {
//                if(leftStart == 0){
//                    str = total + str.substring(rightEnd + 1);
//                }else {
//                    str = str.substring(0, leftStart) + total + str.substring(rightEnd + 1);
//                }
//            }else{
//                str = str.substring(0, leftStart) + total;
//            }
////          System.out.println("String leaving Division " + str);
//        }
//        //---------------------------
//        //     System.out.println("String leaving muldiv " + str);
//        return str;
//    }
//
//    //--------- Addition and Subtraction -------
//    public static String subAdd(String str){
//        //     System.out.println("String entering subAdd method " + str);
//        int i = 0, start = 0, end = 0;
//        double numOne = 0, numTwo, total;
//        boolean isMinus = false, add = true, first = true, newNum = true;
//
//        while (i < str.length()) {
//            if (first) {
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
//                    if (newNum) start = i;
//                    isMinus = true;
//                    end = i;
//                    newNum = false;
//                } else {
//                    if (str.charAt(i) == ' ') i++;
//                    if (str.charAt(i) != '+') add = false;
//                    if (str.charAt(i + 1) == ' ') i++;
//                    numOne = Double.parseDouble(str.substring(start, end));
//                    first = false;
//                    newNum = true;
//                    isMinus = false;
//                }
//                i++;
//            } else { //---------- get second number
//
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
//                    if (newNum) start = i;
//                    newNum = false;
//                    isMinus = true;
//                    end = i;
//                    i++;
//                } else {
//                    break;
//                }
//            }
//        }//---------- end of = - while
//        numTwo = Double.parseDouble(str.substring(start, end));
//        if (add) {
//            total = numOne + numTwo;
//        } else {
//            total = numOne - numTwo;
//        }
//        if (end == str.length() - 1) return String.valueOf(total);
//
//        //     System.out.println("String leaving subAdd method " + str);
//        return total + str.substring(end + 1);
//    }
//
//    //--------- isNum ---------------------------
//    public static boolean isNum(String str) {
//        //     System.out.println("Is " + str + " a number ");
//        return str.matches("-?\\d+(\\.\\d+)?");
//    }
    //==========================================================
    //==========================================================
//    public double calculate(String expression) {
//        System.out.println("Original String " + expression);
//        //2 / (2 + 3) * 4.33 - -6
//        if (expression.length() < 3) return Double.parseDouble(expression);
//        while (expression.contains("(")) {
////            int open, close = -1;
////            open = expression.lastIndexOf("(");
////            for (int i = open; i < expression.length(); i++){
////                if(expression.charAt(i) == ')'){
////                    close = i;
////                    break;
////                }
////            }
////            expression = pullParens(expression,open,close);
//            expression = pullParens(expression);
//        }
//
//       //  if(expression.contains("(")) expression = pullParens(expression);//, expression.lastIndexOf("("));
//        //}
//        while (!isNum(expression)){
//            expression = doMath(expression);
//        }
//        return Double.parseDouble(expression);
//    }
//
//    //------ I should be able to do this recursively
//    public String pullParens(String str) {
////(123.45*(678.90 / (-2.5+ 11.5)-(((80 -(19))) *33.25)) / 20)
//        System.out.println("entered pullparens");
//
//        if(!str.contains("(")){
//            return doMath(str);
//        }
//        int counter = 1, i = str.indexOf('('), start = i;
//
//        while(counter > 0){
//            i++;
//            if(str.charAt(i) == '(') counter++;
//            if(str.charAt(i) == ')') counter--;
//        }
//        int end = i;
//        String temp = pullParens(str.substring(str.indexOf('(')+1,end));
//        System.out.println("temp " + temp);
//        System.out.println("str " + str );
//        if(start == 0){
//            System.out.println("return 1 " + temp + str.substring(end + 1));
//
//            return temp + str.substring(end + 1);
//        }
//        if(end == str.length() -1){
//            System.out.println("return 2 " + str.substring(0, start - 1) + temp);
//            return str.substring(0, start - 1) + temp;
//        }
//        System.out.println("return 3 " + str.substring(0, start - 1) + temp + str.substring(end + 1));
//        return str.substring(0, start) + temp + str.substring(end + 1);
//
//
//
//
//     //   return str.substring(start) + doMath(str) + str.substring(end);
//
//        //==========================================================
////        String total = doMath(str.substring(start + 1, end));
////
////        if(start > 0) {
////            if (str.charAt(start - 1) == '-') {
////                total = String.valueOf(Double.parseDouble(total) * -1);
////                start -= 1;
////            }
////        }
////
////        if (end < str.length()) {
////            str = str.substring(0, start) + total + str.substring(end + 1);
////        } else {
////            str = str.substring(0, start) + total;
////        }
////        //===============================================
////        return str;
//    }
//
//    //================= new helpers process string and then parens
//    public String doMath(String str) {
//        boolean newNum = true;
//        int multi = -1, div = -1;
//
//        //----------------- Multiplication and division --------------------
//        while (str.contains("*") || str.contains("/")) {
//            if (str.contains("*")) multi = str.indexOf("*");
//            if (str.contains("/")) div = str.indexOf("/");
//            str = mulDiv(str, multi, div);
//            multi = -1;
//            div = -1;
//        }
//        if(isNum(str)) return str;
//            //------------------------- addition and subtraction --------------------
//            int i = 0, start = 0, end = 0;
//            double numOne = 0, numTwo, total;
//            boolean isMinus = false, add = true, first = true;
//            while (i < str.length()) {
//                if (first) {
//                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
//                        if (newNum) start = i;
//                        newNum = false;
//                        isMinus = true;
//                        end = i;
//
//                    } else {
//                        if (str.charAt(i) == ' ') i++;
//                        if (str.charAt(i) != '+') add = false;
//                        if (str.charAt(i + 1) == ' ') i++; // i = 6
//                        if(start == end){
//                            numOne = Character.getNumericValue(str.charAt(end));
//                        }else {
//                            numOne = Double.parseDouble(str.substring(start, end + 1));
//                        }
//                        first = false;
//                        newNum = true;
//                        isMinus = false;
//                    }
//                    i++;
//                } else { //---------- get second number
//
//                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
//                        if (newNum) start = i;
//                        newNum = false;
//                        isMinus = true;
//                        end = i;
//                        i++;
//                    } else {
//                        break;
//                    }
//                }
//            }//---------- end of = - while
//        if(start == end) {
//            numTwo = Character.getNumericValue(str.charAt(end));
//        }else{
//            numTwo = Double.parseDouble(str.substring(start, end + 1));
//        }
//            if (add) {
//                total = numOne + numTwo;
//            } else {
//                total = numOne - numTwo;
//            }
//            if (end == str.length() - 1){
//                return String.valueOf(total);
//            }
//            str = total + str.substring(end + 1);
//        return str;
//        }
//
//    //=============== Multiply and Divide =================
//    public String mulDiv(String str, int multi, int div){
////        System.out.println("entered muldiv multi: ");
//         boolean newNum = true;
//         double left, right;
//
////========================== MULTIPLY ==============================
//        //==========================================================
//
//        if ((multi < div && multi > -1) || div == -1){
//
////            System.out.println("entered multiply section of muldiv");
//            int i = multi - 1, leftStart = 0, endStart = 0, rightEnd = 0;
//            while (i >= 0) { //-------------------------------------------- Get number to left
//                if (str.charAt(i) == ' ' && i == multi - 1) i--;
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
//                    if (newNum) endStart = i;
//                    leftStart = i;
//                    newNum = false;
//                } else if (str.charAt(i) == '-') {
//                    leftStart = i;
//                    break;
//                } else break;
//                i--;
//            }
//            if(leftStart == endStart){
//                left = Character.getNumericValue(str.charAt(endStart));
//            }else {
//                left = Double.parseDouble(str.substring(leftStart, endStart + 1));
//            }
//            newNum = true;
//            i = multi + 1;
//
////========================================= RIGHT NUMBER ====================================================
//            while (i < str.length()) { //------------------- Get number to right
//                if (str.charAt(i) == ' ' && i == multi + 1) i++;
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
//                    if (newNum) endStart = i;
//                    rightEnd = i;
//                    newNum = false;
//                } else if (str.charAt(i) == '-' && newNum) {
//                    endStart = i;
//                    newNum = false;
//                } else break;
//                i++;
//            }
//
//            if(endStart == rightEnd){
//                right = Character.getNumericValue(str.charAt(rightEnd));
//            }else {
//                right = Double.parseDouble(str.substring(endStart, rightEnd + 1));
//            }
//            //----------- Do Math and remake string
//            double total = left * right;
////            System.out.println("multiply left " + left + " right " + right + " total " + total);
//            //-------------------------------
//            if(rightEnd < str.length() - 1) {
//                if(leftStart == 0){
//                    str = total + str.substring(rightEnd);
//                }else {
//                    str = str.substring(0, leftStart) + total + str.substring(rightEnd + 1);
//                }
//            }else{
//                str = str.substring(0, leftStart) + total;
//            }
//        } else {
//            //=======================================================================
//            //=======================================================================
//            //-------------- Process division ------------------------ 1 /1  2 /2+3 * 4.75
//            int i = div - 1, leftStart = 0, endStart = 0, rightEnd = 0;
//            while (i >= 0) { //------------------- Get number to left
//                if (str.charAt(i) == ' ' && i == div - 1) i--;
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
//                    if (newNum) endStart = i;
//                    leftStart = i;
//                    newNum = false;
//                } else if (str.charAt(i) == '-') {
//                    leftStart = i;
//                    break;
//                } else break;
//                i--;
//            }
//            if(leftStart == endStart) {
//                left = Character.getNumericValue(str.charAt(endStart));
//            }else{
//                left = Double.parseDouble(str.substring(leftStart, endStart));
//            }
//
//            //=========================== RIGHT NUMBER ========================
//            //=================================================================
//            newNum = true;
//            i = div + 1;
//            while (i < str.length()) { //---------------------------- Get number to right
////                System.out.println("getting right number");
//                if (str.charAt(i) == ' ' && i == div + 1) i++;
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
//                    if (newNum) endStart = i;
//                    rightEnd = i;
//                    newNum = false;
//                } else if (str.charAt(i) == '-' && newNum) {
//                    endStart = i;
//                    newNum = false;
//                } else break;
//                i++;
//            }
//            if(endStart == rightEnd){
//                right = Character.getNumericValue(str.charAt(rightEnd));
//            }else {
//                right = Double.parseDouble(str.substring(endStart, rightEnd)); //<-------------------------- 2 / (2 + 3) * 4.33 - -6
//            }
//            //----------- Do math and remake string     2 / (2 + 3) * 4.33 - -6
//            double total = left / right;
////=======================================================================   MATH
//            if(rightEnd < str.length() - 1) {
//                if(leftStart == 0){
//                    str = total + str.substring(rightEnd + 1);
//                }else {
//                    str = str.substring(0, leftStart) + total + str.substring(rightEnd + 1);
//                }
//            }else{
//                str = str.substring(0, leftStart) + total;
//            }
////            System.out.println("str after div math " + str);
//        }
//        //---------------------------
//        return str;
//    }
//
//    //--------- Addition and Subtraction -------
//    public static String subAdd(String str){
//        int i = 0, start = 0, end = 0;
//        double numOne = 0, numTwo, total;
//        boolean isMinus = false, add = true, first = true, newNum = true;
////1232 + -68
//        while (i < str.length()) {
//            if (first) {
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
//                    if (newNum) start = i;
//                    isMinus = true;
//                    end = i;
//                    newNum = false;
//                } else {
//                    if (str.charAt(i) == ' ') i++;
//                    if (str.charAt(i) != '+') add = false;
//                    if (str.charAt(i + 1) == ' ') i++;
//                    numOne = Double.parseDouble(str.substring(start, end));
//                    first = false;
//                    newNum = true;
//                    isMinus = false;
//                }
//                i++;
//            } else { //---------- get second number
//
//                if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.' || (!isMinus && str.charAt(i) == '-')) {
//                    if (newNum) start = i;
//                    newNum = false;
//                    isMinus = true;
//                    end = i;
//                    i++;
//                } else {
//                    break;
//                }
//            }
//        }//---------- end of = - while
//        numTwo = Double.parseDouble(str.substring(start, end));
//        if (add) {
//            total = numOne + numTwo;
//        } else {
//            total = numOne - numTwo;
//        }
//        if (end == str.length() - 1) return String.valueOf(total);
//        return total + str.substring(end + 1);
//    }
//
//    //--------- isNum ---------------------------
//    //https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java
//    public static boolean isNum(String str) {
//        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
//    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>}

////================= Helpers ===========================================
//    public ArrayList<String> makeList(String str){
//        ArrayList<String> list = new ArrayList<>();
//        String temp = "";
//        int start = 0, end = 0, i = 0;
//
//        //for(int i = 0; i < str.length(); i++){
//        do{
//            System.out.println("char " + str.charAt(i));
//            if(str.charAt(i) == ('-')){//---------minus check
//                System.out.println("1");
//                if(i==0){
//                    System.out.println("2");
//                    start = i++;
//                }else if(str.charAt(i-1) == (' ')){
//                    System.out.println("3");
//                    start = i++; //do i need to catch a blank at the start of string
//                }
//            }//------------------------------end of minus check
//            System.out.println("4");
//            if((str.codePointAt(i) > 47 && str.codePointAt(i) < 58) || str.codePointAt(i) == 46){ //unicode 0-9 .
//                System.out.println("5");
//                end = i;
//            }else{
//                System.out.println("6");
//                System.out.println("----> " + buildString(str, start, end));
//                list.add(buildString(str, start, end));
//                start = i;
//                end = i;
//                if(str.charAt(i) != ' ') {
//                    list.add(buildString(str, start++, end++));
//                }
//            }//----------------------------------- end of multidigit check
//            System.out.println("7");
//            i++;
//        } while(i < str.length());//------------end of for
//        System.out.println("8");
//        list.add(buildString(str, start, end));
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        return list;
//    }//------------------------------------------------- end of makeList
//
//    public String buildString(String in, int start, int end){
//        String out = "";
//        //if(start == end) return String.valueOf(in.charAt(start));
//        for(int i = start; i <= end; i++) out += in.charAt(i);
//        return out;
//    }


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

//            if (multi < div && multi != -1) { //----------- Process multiplication
//                int i = multi - 1, leftStart = 0, endStart = 0, rightEnd = 0;
//                while (i > 0) { //-------------------------- Get number to left
//                    if (str.charAt(i) == ' ' && i == multi - 1) i--;
//                    if (Character.isDigit(str.charAt(i))) {
//                        if (newNum) endStart = i;
//                        leftStart = i;
//                        newNum = false;
//                    } else if (str.charAt(i) == '-') {
//                        leftStart = i;
//                        break;
//                    } else break;
//                }
//                double left = Double.parseDouble(str.substring(leftStart, endStart));
//                newNum = true;
//                i = multi + 1;
//
//                while (i < str.length() - 1) { //------------------- Get number to right
//                    if (str.charAt(i) == ' ' && i == multi + 1) i++;
//                    if (Character.isDigit(str.charAt(i))) {
//                        if (newNum) endStart = i;
//                        rightEnd = i;
//                        newNum = false;
//                    } else if (str.charAt(i) == '-' && newNum) {
//                        endStart = i;
//                        newNum = false;
//                    } else break;
//                }
//                double right = Double.parseDouble(str.substring(endStart, rightEnd));
//                newNum = true;
//                //----------- Do Math and remake string
//                double total = left * right;
//                String tempStr = "";
//                tempStr = str.substring(0, leftStart - 1);
//                tempStr += total;
//                tempStr += str.substring(rightEnd + 1, str.length() - 1);
//                str = tempStr;
//
//            } else {
//                //-------------- Process division ------------------------
//                int i = div - 1, leftStart = 0, endStart = 0, rightEnd = 0;
//                while (i > 0) { //------------------- Get number to left
//                    if (str.charAt(i) == ' ' && i == multi - 1) i--;
//                    if (Character.isDigit(str.charAt(i))) {
//                        if (newNum) endStart = i;
//                        leftStart = i;
//                        newNum = false;
//                    } else if (str.charAt(i) == '-') {
//                        leftStart = i;
//                        break;
//                    } else break;
//                }
//                double left = Double.parseDouble(str.substring(leftStart, endStart));
//
//                newNum = true;
//                i = div + 1;
//                while (i < str.length() - 1) { //---------- Get number to right
//                    if (str.charAt(i) == ' ' && i == multi + 1) i++;
//                    if (Character.isDigit(str.charAt(i))) {
//                        if (newNum) endStart = i;
//                        rightEnd = i;
//                        newNum = false;
//                    } else if (str.charAt(i) == '-' && newNum) {
//                        endStart = i;
//                        newNum = false;
//                    } else break;
//                }
//                double right = Double.parseDouble(str.substring(endStart, rightEnd));
//                newNum = true;
//                //----------- Do math and remake string
//                double total = left / right;
//                String tempStr = "";
//                tempStr = str.substring(0, leftStart - 1);
//                tempStr += total;
//                tempStr += str.substring(rightEnd + 1, str.length() - 1);
//                str = tempStr;
//            }

//-------------------------------- 1* 1
//            String tempStr = "";
//            tempStr = str.substring(0, leftStart - 1);
//            tempStr += total;
//            tempStr += str.substring(rightEnd + 1, str.length() - 1);
//            str = tempStr;