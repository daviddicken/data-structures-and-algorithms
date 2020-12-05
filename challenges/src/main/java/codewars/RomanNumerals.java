package codewars;

public class RomanNumerals {
    public static String toRoman(int n) {

        String str = String.valueOf(n);
        String[] arr = new String[]{"", str};
        int num = Integer.parseInt(arr[1]);

        if(num/1000 > 0) arr = addToString(1000, "M", arr);
        if(num/900 > 0) arr = addToString(900, "CM", arr);
        if(num/500 > 0) arr = addToString(500, "D", arr);
        if(num/400 > 0) arr = addToString(400, "CD", arr);
        if(num/100 > 0) arr = addToString(100, "C", arr);
        if(num/90 > 0) arr = addToString(90, "XC", arr);
        if(num/50 > 0) arr = addToString(50, "L", arr);
        if(num/40 > 0) arr = addToString(40, "XL", arr);
        if(num/10 > 0) arr = addToString(10, "X", arr);
        if(num/9 > 0) arr = addToString(9, "IX", arr);
        if(num/5 > 0) arr = addToString(5, "V", arr);
        if(num/4 > 0) arr = addToString(4, "IV", arr);
        if(num/1 > 0) arr = addToString(1, "I", arr);

        return arr[0];
    }
    //----------------------------------
    public static String[] addToString(int d, String r, String[] arr){

        int num = Integer.parseInt(arr[1]);
        for(int i = 0; i < num/d; i++){
            arr[0] += r;
        }
        num = num % d;
        arr[1] = String.valueOf(num);

        return arr;
    }


    public static int fromRoman(String romanNumeral) {
        int year = 0;
        romanNumeral += " ";
        char[] arr = romanNumeral.toCharArray();
        
        for(int i = 0; i < arr.length - 1; i++){

            if(getValue(arr[i]) < getValue(arr[i+1])){
                year += getValue(arr[i+1]) - getValue(arr[i]);
                if(i+1 == arr.length) return year;
                i++;
            }else{
                year += getValue(arr[i]);
            }
            if(i+1 == arr.length) return year += getValue(arr[i]);
        }
        return year;
    }

    //---------------------
    public static int getValue(char c){
        switch(c){
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;
            default: return 0;
        }

    }

}
